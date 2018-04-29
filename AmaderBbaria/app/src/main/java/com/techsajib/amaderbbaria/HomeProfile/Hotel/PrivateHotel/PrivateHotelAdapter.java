package com.techsajib.amaderbbaria.HomeProfile.Hotel.PrivateHotel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel.GovtHotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/2/2018.
 */

public class PrivateHotelAdapter extends ArrayAdapter<PrivateHotelIDRegister> {

    private ArrayList<PrivateHotelIDRegister> data;
    private Context context;

    public PrivateHotelAdapter(ArrayList<PrivateHotelIDRegister> data, @NonNull Context context) {
        super(context, R.layout.hotel_private_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView hotelName;
        TextView phoneNumber;
        TextView location;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        PrivateHotelIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.hotel_private_row_design, parent, false);

            viewHolder.logo = (ImageView) convertView.findViewById(R.id.privatehotelImage);
            viewHolder.hotelName = (TextView) convertView.findViewById(R.id.privatehotelText);
            viewHolder.phoneNumber = (TextView) convertView.findViewById(R.id.privatehotePhoneText);
            viewHolder.location = (TextView) convertView.findViewById(R.id.privatehotellocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.hotelName.setText(datamodel.getHotelName());
        viewHolder.phoneNumber.setText(datamodel.getPhoneNumber());
        viewHolder.location.setText(datamodel.getLocation());


        return convertView;
    }
}
