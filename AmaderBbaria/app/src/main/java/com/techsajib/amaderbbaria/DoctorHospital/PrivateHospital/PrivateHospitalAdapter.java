package com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.DoctorHospital.GovtHospital.GovtHospitalAdapter;
import com.techsajib.amaderbbaria.DoctorHospital.GovtHospital.GovtHospitalIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/8/2018.
 */

public class PrivateHospitalAdapter extends ArrayAdapter<PrivateHospitalIDRegister> {

    private ArrayList<PrivateHospitalIDRegister> data;
    private Context context;

    public PrivateHospitalAdapter (ArrayList<PrivateHospitalIDRegister> data, @NonNull Context context) {
        super(context, R.layout.hos_private_hospital_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView hospitalName;
        TextView ownerName;
        TextView locationName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        PrivateHospitalIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.hos_private_hospital_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.privatehospitalImage);
            viewHolder.hospitalName = (TextView) convertView.findViewById(R.id.privatehospitalNameText);
            viewHolder.ownerName = (TextView) convertView.findViewById(R.id.privatehospitalOwerNameText);
            viewHolder.locationName = (TextView) convertView.findViewById(R.id.privatehospitallocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.hospitalName.setText(datamodel.getHospital());
        viewHolder.ownerName.setText(datamodel.getOwner());
        viewHolder.locationName.setText(datamodel.getLocation());

        return convertView;
    }
}
