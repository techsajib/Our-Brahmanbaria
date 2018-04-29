package com.techsajib.amaderbbaria.FamousPeople;

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

import java.util.ArrayList;

/**
 * Created by Xubisoft on 3/16/2018.
 */

public class FamousAdapter extends ArrayAdapter<FamousIDRegister> {

    private ArrayList<FamousIDRegister> data;
    private Context context;

    public FamousAdapter (ArrayList<FamousIDRegister> data, @NonNull Context context) {
        super(context, R.layout.famous_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView text;
        ImageView icon;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FamousIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.famous_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.famousLogo);
            viewHolder.text = (TextView) convertView.findViewById(R.id.famousText);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.famousIcon);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.text.setText(datamodel.getText());
        viewHolder.icon.setImageResource(datamodel.getIcon());
        return convertView;
    }
}
