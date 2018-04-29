package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.KasbaCommand;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand.AkhauraCommandAdapter;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand.AkhauraCommandIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by Xubisoft on 2/5/2018.
 */

public class KasbaCommandAdapter extends ArrayAdapter<KasbaCommandIDRegister> {

    private ArrayList<KasbaCommandIDRegister> data;
    private Context context;

    public KasbaCommandAdapter(ArrayList<KasbaCommandIDRegister> data, @NonNull Context context) {
        super(context, R.layout.war_zila_command_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        TextView text, text2, text3, text4;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        KasbaCommandIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.war_zila_command_row_design, parent, false);
            viewHolder.text = (TextView) convertView.findViewById(R.id.designationNameText);
            viewHolder.text2 = (TextView) convertView.findViewById(R.id.soldierNameText);
            viewHolder.text3 = (TextView) convertView.findViewById(R.id.soldierFatherNameText);
            viewHolder.text4 = (TextView) convertView.findViewById(R.id.soldierAddressText);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.text.setText(datamodel.getDesignationNameText());
        viewHolder.text2.setText(datamodel.getSoldierNameText());
        viewHolder.text3.setText(datamodel.getSoldierFatherNameText());
        viewHolder.text4.setText(datamodel.getSoldierAddressText());


        return convertView;
    }
}
