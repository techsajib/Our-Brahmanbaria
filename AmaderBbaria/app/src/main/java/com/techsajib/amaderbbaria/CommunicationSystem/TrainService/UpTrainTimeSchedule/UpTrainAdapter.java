package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital.PrivateHospitalAdapter;
import com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital.PrivateHospitalIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/13/2018.
 */

public class UpTrainAdapter extends ArrayAdapter<UpTrainIDRegister>{

    private ArrayList<UpTrainIDRegister> data;
    private Context context;

    public UpTrainAdapter (ArrayList<UpTrainIDRegister> data, @NonNull Context context) {
        super(context, R.layout.train_up_train_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{

        TextView trainNumber;
        TextView trainName;
        TextView trainOffDay;
        TextView trainTime;
        TextView trainSecondTime;
        TextView noticed;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UpTrainIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.train_up_train_row_design, parent, false);
            viewHolder.trainNumber = (TextView) convertView.findViewById(R.id.trainNumberText);
            viewHolder.trainName = (TextView) convertView.findViewById(R.id.trainNameText);
            viewHolder.trainOffDay = (TextView) convertView.findViewById(R.id.trainWeeklyOffDayText);
            viewHolder.trainTime = (TextView) convertView.findViewById(R.id.trainFirstTimeText);
            viewHolder.trainSecondTime = (TextView) convertView.findViewById(R.id.trainSecondTimeText);
            viewHolder.noticed = (TextView) convertView.findViewById(R.id.trainNoticeText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.trainNumber.setText(datamodel.getTrainnumber());
        viewHolder.trainName.setText(datamodel.getTrain());
        viewHolder.trainOffDay.setText(datamodel.getTrainOffDay());
        viewHolder.trainTime.setText(datamodel.getRealTime());
        viewHolder.trainSecondTime.setText(datamodel.getBbTime());
        viewHolder.noticed.setText(datamodel.getNoticed());

        return convertView;
    }
}
