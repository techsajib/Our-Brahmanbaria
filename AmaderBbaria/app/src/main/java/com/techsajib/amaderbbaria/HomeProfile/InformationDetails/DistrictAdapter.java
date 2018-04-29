package com.techsajib.amaderbbaria.HomeProfile.InformationDetails;

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

import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 12/23/2017.
 */

public class DistrictAdapter extends ArrayAdapter<District> {

    private ArrayList<District> data;
    private Context context;

    public DistrictAdapter(ArrayList<District> data, @NonNull Context context) {
        super(context, R.layout.district_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView text;
        ImageView icon;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        District datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.district_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.districtLogo);
            viewHolder.text = (TextView) convertView.findViewById(R.id.districtText);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.districtIcon);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.text.setText(datamodel.getText());
        viewHolder.icon.setImageResource(datamodel.getIcon());
        return convertView;
    }
}
