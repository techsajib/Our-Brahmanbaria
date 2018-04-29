package com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Hotel.AHotelMain.HotelAdapter;
import com.techsajib.amaderbbaria.HomeProfile.Hotel.AHotelMain.HotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/1/2018.
 */

public class GovtHotelAdapter extends ArrayAdapter<GovtHotelIDRegister> {

    private ArrayList<GovtHotelIDRegister> data;
    private Context context;

    public GovtHotelAdapter(ArrayList<GovtHotelIDRegister> data, @NonNull Context context) {
        super(context, R.layout.hotel_government_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView hotelName;
        TextView managementInstitute;
        TextView location;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        GovtHotelIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.hotel_government_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.govthotelImage);
            viewHolder.hotelName = (TextView) convertView.findViewById(R.id.govthotelText);
            viewHolder.managementInstitute = (TextView) convertView.findViewById(R.id.govthotelmanagerText);
            viewHolder.location = (TextView) convertView.findViewById(R.id.govthotellocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
           viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.hotelName.setText(datamodel.getHotelName());
        viewHolder.managementInstitute.setText(datamodel.getManagementInstitute());
        viewHolder.location.setText(datamodel.getLocation());



        return convertView;
    }
}
