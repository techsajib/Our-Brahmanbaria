package com.techsajib.amaderbbaria.UpozilaUnion.AkhauraUpozila.AkhauraUnion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AkhauraUnionAbout extends Fragment {

    ListView listView;
    ArrayList<AkhauraIDRegister> listOfAkhauraUnionData;

    public AkhauraUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_akhaura_union_about, container, false);
        listView = (ListView) rootView.findViewById(R.id.akhauraUnionDataListView);
        listOfAkhauraUnionData = new ArrayList<>();

        for (int i =1; i<6; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 union = " ইউনিয়ন: মোগড়া";
                 chairman = "  চেয়ারম্যান: মোঃ নান্নু মিয়া";
                 address = " পোস্টাল ঠিকানা: মোগড়া বাজার, আখাউড়া, ব্রাহ্মণবাড়িয়া";
            }else if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: মনিয়ন্ধ";
                chairman = "  চেয়ারম্যান: মোঃ আব্দুল ওহাব ভূইয়া";
                address = " পোস্টাল ঠিকানা: মনিয়ন্দ (উত্তর), আখাউড়া, ব্রাহ্মণবাড়িয়া";
            }else if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: ধরখার";
                chairman = "  চেয়ারম্যান: কাজী হোসেন ভূইয়া";
                address = " পোস্টাল ঠিকানা: ধরখার, আখাউড়া, ব্রাহ্মণবাড়িয়া";
            }else if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: আখাউড়া উত্তর";
                chairman = "  চেয়ারম্যান: মোঃ হান্নান ভূইয়া";
                address = " পোস্টাল ঠিকানা: আখাউড়া উত্তর ইউনিয়ন পরিষদ ভবন, সড়ক বাজার, আখাউড়া, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: আখাউড়া দক্ষিণ";
                chairman = "  চেয়ারম্যান: মোঃ শাহনোয়াজ খান";
                address = " পোস্টাল ঠিকানা: আখাউড়া দক্ষিণ ইউনিয়ন পরিষদ ভবন, লাল বাজার, আখাউড়া, ব্রাহ্মণবাড়িয়া";
            }

            AkhauraIDRegister akhauraIDRegister = new AkhauraIDRegister(id, union, chairman, address);
            listOfAkhauraUnionData.add(akhauraIDRegister);
        }

            AkhauraAdapter akhauraAdapter = new AkhauraAdapter(listOfAkhauraUnionData, getActivity());
            listView.setAdapter(akhauraAdapter);
            return rootView;
    }

}
