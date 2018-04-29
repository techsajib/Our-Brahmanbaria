package com.techsajib.amaderbbaria.HomeProfile.Library;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel.GovtHotelAdapter;
import com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel.GovtHotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * Created by User on 1/3/2018.
 */

public class LibraryAdapter extends ArrayAdapter<LibraryIDRegister> {

    private ArrayList<LibraryIDRegister> data;
    private Context context;

    public LibraryAdapter(ArrayList<LibraryIDRegister> data, @NonNull Context context) {
        super(context, R.layout.library_row_design, data);

        this.data = data;
        this.context = context;
    }

    public class ViewHolder{
        ImageView logo;
        TextView libraryName;
        TextView placedName;
        TextView bookName;
        TextView locationName;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LibraryIDRegister datamodel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
           viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.library_row_design, parent, false);
            viewHolder.logo = (ImageView) convertView.findViewById(R.id.libraryImage);
            viewHolder.libraryName = (TextView) convertView.findViewById(R.id.libraryText);
            viewHolder.placedName = (TextView) convertView.findViewById(R.id.placedText);
            viewHolder.bookName = (TextView) convertView.findViewById(R.id.bookText);
            viewHolder.locationName = (TextView) convertView.findViewById(R.id.locationText);
            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.logo.setImageResource(datamodel.getLogo());
        viewHolder.libraryName.setText(datamodel.getLibrary());
        viewHolder.placedName.setText(datamodel.getPlaced());
        viewHolder.bookName.setText(datamodel.getBook());
        viewHolder.locationName.setText(datamodel.getLocation());

        return convertView;
    }
}
