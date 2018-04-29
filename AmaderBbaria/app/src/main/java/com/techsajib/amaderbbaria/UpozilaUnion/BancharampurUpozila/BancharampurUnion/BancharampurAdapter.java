package com.techsajib.amaderbbaria.UpozilaUnion.BancharampurUpozila.BancharampurUnion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUnion.KasbaAdapter;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUnion.KasbaIDRegister;

import java.util.ArrayList;

/**
 * Created by User on 1/13/2018.
 */

public class BancharampurAdapter extends ArrayAdapter<BancharampurIDRegister> {

    private ArrayList<BancharampurIDRegister> data;
    private Context context;

    public BancharampurAdapter(ArrayList<BancharampurIDRegister> data, @NonNull Context context) {
        super(context, R.layout.union_bancharampur_row_design, data);

        this.data = data;
        this.context = context;

    }

    public class ViewHolder {
        TextView unionName, chairmanName, chairmanAddress;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        BancharampurIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.union_bancharampur_row_design, parent, false);
            viewHolder.unionName = (TextView) convertView.findViewById(R.id.bancharampurunionOfficeText);
            viewHolder.chairmanName = (TextView) convertView.findViewById(R.id.bancharampurchairmanNameText);
            viewHolder.chairmanAddress = (TextView) convertView.findViewById(R.id.bancharampurchairmanAddressText);


            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.unionName.setText(datamodel.getUnion());
        viewHolder.chairmanName.setText(datamodel.getChairman());
        viewHolder.chairmanAddress.setText(datamodel.getChairmanAddress());
        return convertView;
    }

}
