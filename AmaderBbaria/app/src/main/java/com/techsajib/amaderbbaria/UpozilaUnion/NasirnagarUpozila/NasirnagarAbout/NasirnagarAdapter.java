package com.techsajib.amaderbbaria.UpozilaUnion.NasirnagarUpozila.NasirnagarAbout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion.SarailAdapter;
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion.SarailIDRegister;

import java.util.ArrayList;

/**
 * Created by User on 1/12/2018.
 */

public class NasirnagarAdapter extends ArrayAdapter<NasirnagarIDRegister> {

    private ArrayList<NasirnagarIDRegister> data;
    private Context context;

    public NasirnagarAdapter(ArrayList<NasirnagarIDRegister> data, @NonNull Context context) {
        super(context, R.layout.union_nasirnagar_row_design, data);

        this.data = data;
        this.context = context;

    }

    public class ViewHolder {
        TextView unionName, chairmanName, chairmanAddress;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        NasirnagarIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.union_nasirnagar_row_design, parent, false);
            viewHolder.unionName = (TextView) convertView.findViewById(R.id.nasirnagarunionOfficeText);
            viewHolder.chairmanName = (TextView) convertView.findViewById(R.id.nasirnagarchairmanNameText);
            viewHolder.chairmanAddress = (TextView) convertView.findViewById(R.id.nasirnagarchairmanAddressText);


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
