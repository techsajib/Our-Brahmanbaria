package com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GovtHotelMain extends Fragment {
    ListView listView;
    ArrayList<GovtHotelIDRegister> listOfGovtHotel;

    LinearLayout first;
    Animation uptodown;

    public GovtHotelMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hotel_government, container, false);
        listView = (ListView) rootView.findViewById(R.id.govtHotelListView);
        listOfGovtHotel = new ArrayList<>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.govtHotelLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<9; i++){
            int id = i+1;
            int logo = R.drawable.hotel;
            String hotelName = "";
            String managementInstitute = "";
            String location = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" জেলা পরিষদ ডাক বাংলো";
                managementInstitute = " জেলা পরিষদ, ব্রাহ্মণবাড়িয়া";
                location = " কাউতলী, সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" সরাইল জেলা পরিষদ ডাকবাংলো";
                managementInstitute = " জেলা পরিষদ, ব্রাহ্মণবাড়িয়া";
                location = " উপজেলা পরিষদ চত্বর, সরাইল";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" নাসিরনগর ডাক বাংলো";
                managementInstitute = " জেলা পরিষদ, ব্রাহ্মণবাড়িয়া।";
                location = " ডাক বাংলো ঘাট, নাসিরনগর";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" নবীনগর জেলা পরিষদ ডাকবাংলো";
                managementInstitute = " জেলা পরিষদ, ব্রাহ্মণবাড়িয়া।";
                location = " ডাক বাংলো, নবীনগর";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" কসবা উপজেলা পরিষদ গেষ্ট হাউজ";
                managementInstitute = " উপজেলা পরিষদ, কসবা";
                location = " উপজেলা সুপার মার্কেট, কসবা";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" কসবা জেলা পরিষদ ডাকবাংলো";
                managementInstitute = " জেলা পরিষদ, কসবা";
                location = " কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" কসবা কোল্লাপাথর রেস্ট হাউজ";
                managementInstitute = " জেলা পরিষদ, ব্রাহ্মণবাড়িয়া।";
                location = " বায়েক, কসবা";
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.govtbuilding;
                hotelName =" বাঞ্ছারামপুর জেলা পরিষদ ডাক বাংলো";
                managementInstitute = " জেলা পরিষদ, ব্রাহ্মণবাড়িয়া।";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }

            GovtHotelIDRegister govtHotelIDRegister = new GovtHotelIDRegister(id, logo, hotelName,managementInstitute,location);
            listOfGovtHotel.add(govtHotelIDRegister);
        }

            GovtHotelAdapter govtHotelAdapter = new GovtHotelAdapter(listOfGovtHotel, getActivity());
            listView.setAdapter(govtHotelAdapter);
        return rootView;
    }

}
