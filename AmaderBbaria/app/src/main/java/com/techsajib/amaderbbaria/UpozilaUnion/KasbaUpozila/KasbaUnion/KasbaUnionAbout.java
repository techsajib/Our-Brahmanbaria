package com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUnion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion.AshuganjIDRegister;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KasbaUnionAbout extends Fragment {

    ListView listView;
    ArrayList<KasbaIDRegister> listOfKasbaUnionData;

    public KasbaUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_kasba_union_about, container, false);

        listView = (ListView) rootView.findViewById(R.id.kasbaUnionDataListView);
        listOfKasbaUnionData = new ArrayList<>();

        for (int i =1; i<11; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 union = " ইউনিয়ন: মূলগ্রাম";
                 chairman = "  চেয়ারম্যান: মোঃ মইনুল ইসলাম";
                 address = " পোস্টাল ঠিকানা: মূলগ্রাম, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: মেহারী";
                chairman = "  চেয়ারম্যান: মোস্তফা কামাল";
                address = " পোস্টাল ঠিকানা: মেহারী, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: বাদৈর";
                chairman = "  চেয়ারম্যান: এম মারুফ হাসান";
                address = " পোস্টাল ঠিকানা: জমশেরপুর, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: খাড়েরা";
                chairman = "  চেয়ারম্যান: মোঃ মোখলেছুর রহমান";
                address = " পোস্টাল ঠিকানা: খাড়েরা, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: বিনাউটি";
                chairman = "  চেয়ারম্যান: এম এস আলম ভূইয়া";
                address = " পোস্টাল ঠিকানা: চান্দাইসার, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 6){
                id = i + 1;
                union = " ইউনিয়ন: গোপীনাথপুর";
                chairman = "  চেয়ারম্যান: মোঃ আনোয়ার হোসেন";
                address = " পোস্টাল ঠিকানা: চন্ডিদ্বার বাজার, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 7){
                id = i + 1;
                union = " ইউনিয়ন: কুটি";
                chairman = "  চেয়ারম্যান: আঃ কাদির";
                address = " পোস্টাল ঠিকানা: কুটি বাজার, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 8){
                id = i + 1;
                union = " ইউনিয়ন: কসবা পশ্চিম";
                chairman = "  চেয়ারম্যান: মোঃ জহিরুল হক খান";
                address = " পোস্টাল ঠিকানা: কসবা, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 9){
                id = i + 1;
                union = " ইউনিয়ন: কাইমপুর";
                chairman = "  চেয়ারম্যান: মোঃ আমজাদ হোসেন সরকার";
                address = " পোস্টাল ঠিকানা: মইনপুর বাজার, কসবা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 10){
                id = i + 1;
                union = " ইউনিয়ন: বায়েক";
                chairman = "  চেয়ারম্যান: মোঃ বিল্লাল হোসেন";
                address = " পোস্টাল ঠিকানা: সালদানদী, কসবা, ব্রাহ্মণবাড়িয়া";
            }

            KasbaIDRegister kasbaIDRegister = new KasbaIDRegister(id, union, chairman, address);
            listOfKasbaUnionData.add(kasbaIDRegister);

        }
            KasbaAdapter kasbaAdapter = new KasbaAdapter(listOfKasbaUnionData, getActivity());
            listView.setAdapter(kasbaAdapter);
            return rootView;
    }

}
