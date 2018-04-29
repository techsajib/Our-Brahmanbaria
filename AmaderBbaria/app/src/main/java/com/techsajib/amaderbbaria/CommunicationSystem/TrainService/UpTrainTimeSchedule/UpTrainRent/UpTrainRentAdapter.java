package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainRent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainAdapter;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/14/2018.
 */

public class UpTrainRentAdapter extends ArrayAdapter<UpTrainRentIDRegister> {

    private ArrayList<UpTrainRentIDRegister> data;
    private Context context;

    public UpTrainRentAdapter (ArrayList<UpTrainRentIDRegister> data, @NonNull Context context) {
        super(context, R.layout.train_up_train_rent_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{

        TextView train;
        TextView aCSeat;
        TextView snigdaAC;
        TextView firstClass;
        TextView shovonChair;
        TextView shovon;
        TextView sulob;
        TextView noticed;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UpTrainRentIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.train_up_train_rent_row_design, parent, false);
            viewHolder.train = (TextView) convertView.findViewById(R.id.trainUpNameText);
            viewHolder.aCSeat = (TextView) convertView.findViewById(R.id.trainUpACSeatText);
            viewHolder.snigdaAC = (TextView) convertView.findViewById(R.id.trainUpSnigdaText);
            viewHolder.firstClass = (TextView) convertView.findViewById(R.id.trainUPFirstClassText);
            viewHolder.shovonChair = (TextView) convertView.findViewById(R.id.trainUpShovonChairText);
            viewHolder.shovon = (TextView) convertView.findViewById(R.id.trainUpShovonText);
            viewHolder.sulob = (TextView) convertView.findViewById(R.id.trainUpSholobText);
            viewHolder.noticed = (TextView) convertView.findViewById(R.id.trainNoticeInfoText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.train.setText(datamodel.getTrain());
        viewHolder.aCSeat.setText(datamodel.getaCSeat());
        viewHolder.snigdaAC.setText(datamodel.getSnigdaAC());
        viewHolder.firstClass.setText(datamodel.getFirstClass());
        viewHolder.shovonChair.setText(datamodel.getShovonChair());
        viewHolder.shovon.setText(datamodel.getShovon());
        viewHolder.sulob.setText(datamodel.getSulob());
        viewHolder.noticed.setText(datamodel.getNotice());

        return convertView;
    }
}
