package com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Library.LibraryAdapter;
import com.techsajib.amaderbbaria.HomeProfile.Library.LibraryIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/6/2018.
 */

public class CollegeUniversityAdapter extends ArrayAdapter<CollegeUniversityIDRegister> {

    private ArrayList<CollegeUniversityIDRegister> data;
    private Context context;

    public CollegeUniversityAdapter(ArrayList<CollegeUniversityIDRegister> data, @NonNull Context context) {
        super(context, R.layout.edu_college_university_row_design, data);

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
        CollegeUniversityIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.edu_college_university_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.collegeImage);
            viewHolder.collegeName = (TextView) convertView.findViewById(R.id.collegeUniversityText);
            viewHolder.placedName = (TextView) convertView.findViewById(R.id.collegeplacedText);
            viewHolder.locationName = (TextView) convertView.findViewById(R.id.collegelocationText);
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
