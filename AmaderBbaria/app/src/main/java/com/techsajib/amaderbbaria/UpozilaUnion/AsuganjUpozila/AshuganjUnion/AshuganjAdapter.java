package com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/11/2018.
 */

public class AshuganjAdapter extends ArrayAdapter<AshuganjIDRegister> {

    private ArrayList<AshuganjIDRegister> data;
    private Context context;

    public AshuganjAdapter(ArrayList<AshuganjIDRegister> data, @NonNull Context context) {
        super(context, R.layout.union_ashuganj_union_row_design, data);

        this.data = data;
        this.context = context;

    }

    public class ViewHolder {
        TextView unionName, chairmanName, chairmanAddress;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        AshuganjIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.union_ashuganj_union_row_design, parent, false);
            viewHolder.unionName = (TextView) convertView.findViewById(R.id.ashuganjunionOfficeText);
            viewHolder.chairmanName = (TextView) convertView.findViewById(R.id.ashuganjchairmanNameText);
            viewHolder.chairmanAddress = (TextView) convertView.findViewById(R.id.ashuganjchairmanAddressText);


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
