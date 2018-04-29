package com.techsajib.amaderbbaria.DoctorHospital.GovtHospital;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.EducationInstituteList.AliaMadrasa.AliaMadrasaAdapter;
import com.techsajib.amaderbbaria.EducationInstituteList.AliaMadrasa.AliaMadrasaIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/8/2018.
 */

public class GovtHospitalAdapter extends ArrayAdapter<GovtHospitalIDRegister> {

    private ArrayList<GovtHospitalIDRegister> data;
    private Context context;

    public GovtHospitalAdapter(ArrayList<GovtHospitalIDRegister> data, @NonNull Context context) {
        super(context, R.layout.hos_govt_hospital_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView hospitalName;
        TextView seatName;
        TextView doctor;
        TextView locationName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        GovtHospitalIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.hos_govt_hospital_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.hospitalImage);
            viewHolder.hospitalName = (TextView) convertView.findViewById(R.id.hospitalNameText);
            viewHolder.seatName = (TextView) convertView.findViewById(R.id.hospitalSeatText);
            viewHolder.doctor = (TextView) convertView.findViewById(R.id.doctorCountText);
            viewHolder.locationName = (TextView) convertView.findViewById(R.id.hospitallocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.hospitalName.setText(datamodel.getHospital());
        viewHolder.seatName.setText(datamodel.getSeat());
        viewHolder.doctor.setText(datamodel.getDoctor());
        viewHolder.locationName.setText(datamodel.getLocation());

        return convertView;
    }
}
