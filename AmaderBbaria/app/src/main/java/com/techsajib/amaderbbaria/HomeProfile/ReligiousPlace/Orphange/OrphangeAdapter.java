package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Orphange;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque.MosqueAdapter;
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque.MosqueIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/10/2018.
 */

public class OrphangeAdapter extends ArrayAdapter<OrphangeIDRegister> {

    private ArrayList<OrphangeIDRegister> data;
    private Context context;

    public OrphangeAdapter(ArrayList<OrphangeIDRegister> data, @NonNull Context context) {
        super(context, R.layout.orphange_main_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView orphangeName;
        TextView orphangeSeat;
        TextView orphangelocation;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        OrphangeIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.orphange_main_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.orphangeImage);
            viewHolder.orphangeName = (TextView) convertView.findViewById(R.id.orphangeNameText);
            viewHolder.orphangeSeat = (TextView) convertView.findViewById(R.id.orphangeSeatText);
            viewHolder.orphangelocation = (TextView) convertView.findViewById(R.id.orphangelocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.orphangeName.setText(datamodel.getOrphange());
        viewHolder.orphangeSeat.setText(datamodel.getOrphangeSeat());
        viewHolder.orphangelocation.setText(datamodel.getOrphangeLocation());
        return convertView;

        }


    }

