package com.techsajib.amaderbbaria.HomeProfile.Hotel.Restaurant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Hotel.PrivateHotel.PrivateHotelAdapter;
import com.techsajib.amaderbbaria.HomeProfile.Hotel.PrivateHotel.PrivateHotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/2/2018.
 */

public class RestaurantAdapter extends ArrayAdapter<RestaurantIDResgister> {

    private ArrayList<RestaurantIDResgister> data;
    private Context context;

    public RestaurantAdapter (ArrayList<RestaurantIDResgister> data, @NonNull Context context) {
        super(context, R.layout.restaurant_row_design, data);

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
        RestaurantIDResgister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;


        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.restaurant_row_design, parent, false);

            viewHolder.logo = (ImageView) convertView.findViewById(R.id.restaurantImage);
            viewHolder.hotelName = (TextView) convertView.findViewById(R.id.restaurantNameText);
            viewHolder.phoneNumber = (TextView) convertView.findViewById(R.id.restaurantPhoneText);
            viewHolder.location = (TextView) convertView.findViewById(R.id.restaurantlocationText);
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
