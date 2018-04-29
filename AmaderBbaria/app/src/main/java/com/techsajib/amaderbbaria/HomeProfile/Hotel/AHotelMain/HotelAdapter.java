package com.techsajib.amaderbbaria.HomeProfile.Hotel.AHotelMain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.District;
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.DistrictAdapter;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 12/31/2017.
 */

public class HotelAdapter extends ArrayAdapter<HotelIDRegister> {

    private ArrayList<HotelIDRegister> data;
    private Context context;

    public HotelAdapter(ArrayList<HotelIDRegister> data, @NonNull Context context) {
        super(context, R.layout.hotel_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView text;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        HotelIDRegister datmodel = getItem(position);
        ViewHolder viewHolder;
        final View result;


        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.hotel_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.hotelImage);
            viewHolder.text = (TextView) convertView.findViewById(R.id.hotelText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datmodel.getLogo());
        viewHolder.text.setText(datmodel.getText());

        return convertView;


    }
}
