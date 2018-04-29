package com.techsajib.amaderbbaria.HomeProfile.PostalCode;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by User on 12/27/2017.
 */

public class PostCodeAdapter extends ArrayAdapter<PostCodeRegister> {
    private ArrayList<PostCodeRegister> data;
    private Context context;

    public PostCodeAdapter(ArrayList<PostCodeRegister> data, @NonNull Context context) {
        super(context, R.layout.postal_code_row_design, data);

        this.data = data;
        this.context = context;

    }

    public class ViewHolder{
        TextView postoffice, postcode, thanaoffice;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        PostCodeRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final  View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.postal_code_row_design, parent, false);
            viewHolder.postoffice = (TextView) convertView.findViewById(R.id.postOfficeText);
            viewHolder.postcode = (TextView) convertView.findViewById(R.id.postCodeText);
            viewHolder.thanaoffice = (TextView) convertView.findViewById(R.id.thanaText);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.postoffice.setText(datamodel.getPostOfiice());
        viewHolder.postcode.setText(datamodel.getPostCode());
        viewHolder.thanaoffice.setText(datamodel.getThana());

        return convertView;
    }
}
