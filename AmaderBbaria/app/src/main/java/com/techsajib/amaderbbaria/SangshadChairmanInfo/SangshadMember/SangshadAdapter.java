package com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.ReligiousMain.ReligiousAdapter;
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.ReligiousMain.ReligiousIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/14/2018.
 */

public class SangshadAdapter extends ArrayAdapter<SangshadIDRegister>{

    private ArrayList<SangshadIDRegister> data;
    private Context context;

    public SangshadAdapter(ArrayList<SangshadIDRegister> data, @NonNull Context context) {
        super(context, R.layout.sangshad_member_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView text, text2, text3, text4, text5;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SangshadIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.sangshad_member_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.sangshadImage);
            viewHolder.text = (TextView) convertView.findViewById(R.id.sangshadparliamentMemberNameText);
            viewHolder.text2 = (TextView) convertView.findViewById(R.id.sangshadDesignationText);
            viewHolder.text3 = (TextView) convertView.findViewById(R.id.sangshadSeatNumberText);
            viewHolder.text4 = (TextView) convertView.findViewById(R.id.sangshadElectionPlacedText);
            viewHolder.text5 = (TextView) convertView.findViewById(R.id.sangshadElectionPartyText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.text.setText(datamodel.getName());
        viewHolder.text2.setText(datamodel.getDesignation());
        viewHolder.text3.setText(datamodel.getSeatNumber());
        viewHolder.text4.setText(datamodel.getElectionPlaced());
        viewHolder.text5.setText(datamodel.getElectionParty());

        return convertView;
    }
}
