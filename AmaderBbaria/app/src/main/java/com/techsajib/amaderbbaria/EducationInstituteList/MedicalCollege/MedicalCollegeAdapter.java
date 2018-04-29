package com.techsajib.amaderbbaria.EducationInstituteList.MedicalCollege;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity.CollegeUniversityAdapter;
import com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity.CollegeUniversityIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/7/2018.
 */

public class MedicalCollegeAdapter extends ArrayAdapter<MedicalCollegeIDRegister> {

    private ArrayList<MedicalCollegeIDRegister> data;
    private Context context;

    public MedicalCollegeAdapter(ArrayList<MedicalCollegeIDRegister> data, @NonNull Context context) {
        super(context, R.layout.edu_medical_college_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView collegeName;
        TextView placedName;
        TextView locationName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MedicalCollegeIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.edu_medical_college_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.medicalCollegeImage);
            viewHolder.collegeName = (TextView) convertView.findViewById(R.id.medicalCollegeText);
            viewHolder.placedName = (TextView) convertView.findViewById(R.id.medicalCollegePhoneText);
            viewHolder.locationName = (TextView) convertView.findViewById(R.id.medicalCollegelocationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.collegeName.setText(datamodel.getCollege());
        viewHolder.placedName.setText(datamodel.getPlaced());
        viewHolder.locationName.setText(datamodel.getLocation());

        return convertView;
    }
}
