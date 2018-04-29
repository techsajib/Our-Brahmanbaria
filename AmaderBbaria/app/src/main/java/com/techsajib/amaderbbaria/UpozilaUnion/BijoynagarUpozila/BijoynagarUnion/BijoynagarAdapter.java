package com.techsajib.amaderbbaria.UpozilaUnion.BijoynagarUpozila.BijoynagarUnion;

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

public class BijoynagarAdapter extends ArrayAdapter<BijoynagarIDRegister> {

    private ArrayList<BijoynagarIDRegister> data;
    private Context context;

    public BijoynagarAdapter(ArrayList<BijoynagarIDRegister> data, @NonNull Context context) {
        super(context, R.layout.union_bijoynagar_row_design, data);

        this.data = data;
        this.context = context;

    }

    public class ViewHolder {
        TextView unionName, chairmanName, chairmanAddress;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        BijoynagarIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.union_bijoynagar_row_design, parent, false);
            viewHolder.unionName = (TextView) convertView.findViewById(R.id.bijoynagarunionOfficeText);
            viewHolder.chairmanName = (TextView) convertView.findViewById(R.id.bijoynagarchairmanNameText);
            viewHolder.chairmanAddress = (TextView) convertView.findViewById(R.id.bijoynagarchairmanAddressText);


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
