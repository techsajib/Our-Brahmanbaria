package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Library.LibraryAdapter;
import com.techsajib.amaderbbaria.HomeProfile.Library.LibraryIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/5/2018.
 */

public class MosqueAdapter extends ArrayAdapter<MosqueIDRegister> {

    private ArrayList<MosqueIDRegister> data;
    private Context context;

    public MosqueAdapter(ArrayList<MosqueIDRegister> data, @NonNull Context context) {
        super(context, R.layout.mosque_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView libraryName;
        TextView placedName;
        TextView locationName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MosqueIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.mosque_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.mosqueImage);
            viewHolder.libraryName = (TextView) convertView.findViewById(R.id.mosqueNameText);
            viewHolder.placedName = (TextView) convertView.findViewById(R.id.mosquePlacedText);
            viewHolder.locationName = (TextView) convertView.findViewById(R.id.mosquelocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.libraryName.setText(datamodel.getMosque());
        viewHolder.placedName.setText(datamodel.getPlaced());
        viewHolder.locationName.setText(datamodel.getLocation());
        return convertView;
    }
}
