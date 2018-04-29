package com.techsajib.amaderbbaria.SangshadChairmanInfo.UpozilaChairman;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember.SangshadAdapter;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember.SangshadIDRegister;

import java.util.ArrayList;

/**
 * Created by User on 1/14/2018.
 */

public class UpozilaChairmanAdapter extends ArrayAdapter<UpozilaChairmanIDRegister> {

    private ArrayList<UpozilaChairmanIDRegister> data;
    private Context context;

    public UpozilaChairmanAdapter(ArrayList<UpozilaChairmanIDRegister> data, @NonNull Context context) {
        super(context, R.layout.sangshad_upozila_chairman_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        TextView text, text2, text3, text4, text5;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UpozilaChairmanIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.sangshad_upozila_chairman_row_design, parent, false);
            viewHolder.text = (TextView) convertView.findViewById(R.id.upozilaNameText);
            viewHolder.text2 = (TextView) convertView.findViewById(R.id.chairmainNameText);
            viewHolder.text3 = (TextView) convertView.findViewById(R.id.viceChairmainNameText);
            viewHolder.text4 = (TextView) convertView.findViewById(R.id.womanViceChairmainNameText);
            viewHolder.text5 = (TextView) convertView.findViewById(R.id.mayorNameText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.text.setText(datamodel.getUpozilaName());
        viewHolder.text2.setText(datamodel.getChairmanName());
        viewHolder.text3.setText(datamodel.getViceChairmanName());
        viewHolder.text4.setText(datamodel.getWomanViceChairmanName());
        viewHolder.text5.setText(datamodel.getMayorName());

        return convertView;
    }
}
