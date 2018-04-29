package com.techsajib.amaderbbaria.OfficeBankList.NGOList;

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
 * Created by Xubisoft on 2/21/2018.
 */

public class NGOAdapter extends ArrayAdapter<NGOIDRegister> {

    private ArrayList<NGOIDRegister> data;
    private Context context;

    public NGOAdapter(ArrayList<NGOIDRegister> data, @NonNull Context context) {
        super(context, R.layout.ngo_ngo_list_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        TextView ngoName;
        TextView directorName;
        TextView phone;
        TextView location;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        NGOIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.ngo_ngo_list_row_design, parent, false);

            viewHolder.ngoName = (TextView) convertView.findViewById(R.id.ngoNameText);
            viewHolder.directorName = (TextView) convertView.findViewById(R.id.ngoDirectorText);
            viewHolder.phone = (TextView) convertView.findViewById(R.id.ngoPhoneText);
            viewHolder.location = (TextView) convertView.findViewById(R.id.ngolocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        viewHolder.ngoName.setText(datamodel.getNgoName());
        viewHolder.directorName.setText(datamodel.getDirector());
        viewHolder.phone.setText(datamodel.getPhone());
        viewHolder.location.setText(datamodel.getLocation());

        return convertView;
    }
}
