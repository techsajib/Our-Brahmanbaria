package com.techsajib.amaderbbaria.HomeProfile.TouristPlace;

import android.content.Context;
import android.support.annotation.LayoutRes;
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

import static android.R.attr.resource;

/**
 * Created by User on 12/29/2017.
 */

public class TouristAdapter extends ArrayAdapter<TouristIDRegister> {

    private ArrayList<TouristIDRegister> data;
    private Context context;

    public TouristAdapter(ArrayList<TouristIDRegister> data, @NonNull Context context) {
        super(context, R.layout.tourist_place_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        TextView text;
        ImageView icon;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TouristIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.tourist_place_row_design, parent, false);
            viewHolder.text = (TextView) convertView.findViewById(R.id.touristText);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.touristIcon);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.text.setText(datamodel.getText());
        viewHolder.icon.setImageResource(datamodel.getIcon());
        return convertView;
    }
}
