package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.ReligiousMain;

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
 * Created by User on 1/4/2018.
 */

public class ReligiousAdapter extends ArrayAdapter<ReligiousIDRegister> {

    private ArrayList<ReligiousIDRegister> data;
    private Context context;

    public ReligiousAdapter(ArrayList<ReligiousIDRegister> data, @NonNull Context context) {
        super(context, R.layout.religious_main_row_design, data);

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
        ReligiousIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.religious_main_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.religiousImage);
            viewHolder.text = (TextView) convertView.findViewById(R.id.religiousText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.text.setText(datamodel.getText());

        return convertView;
    }
}
