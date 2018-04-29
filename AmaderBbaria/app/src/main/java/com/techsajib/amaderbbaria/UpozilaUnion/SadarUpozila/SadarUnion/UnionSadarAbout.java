package com.techsajib.amaderbbaria.UpozilaUnion.SadarUpozila.SadarUnion;


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
public class UnionSadarAbout extends Fragment {


    ListView listView;
    ArrayList<UnionRegister> listOfUnionData;

    public UnionSadarAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_sadar_unionn_about, container, false);
        listView = (ListView) rootView.findViewById(R.id.unionDataListView);
        listOfUnionData = new ArrayList<>();

        for (int i =1; i<12; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";


            if (i == 1){
                id = i+1;
                union = " ইউনিয়ন: রামরাইল";
                chairman = " চেয়ারম্যান: মোঃ শাহাদত খান";
                address = " পোস্টাল ঠিকানা: মোহাম্মদপুর, রামরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 2){
                id = i+1;
                union = " ইউনিয়ন: নাটাই(উত্তর)";
                chairman = " চেয়ারম্যান: মোঃ সোহেল";
                address = " পোস্টাল ঠিকানা: রাজঘর, ভাটপাড়া, ব্রাহ্মণবাড়িয়া";

           }else if (i == 3){
                id = i+1;
                union = " ইউনিয়ন: বুধল";
                chairman = " চেয়ারম্যান: এ, কে নুরুল হাছান আলম";
                address = " পোস্টাল ঠিকানা: মালিহাতা, বুধল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 4){
                id = i+1;
                union = " ইউনিয়ন: নাটাই(দক্ষিণ)";
                chairman = " চেয়ারম্যান: মোঃ আবদুল কাইয়ুম";
                address = " পোস্টাল ঠিকানা: সিন্দুউড়া, নাটাই, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i+1;
                union = " ইউনিয়ন: তালশহর(পূর্ব)";
                chairman = " চেয়ারম্যান: মোঃ জায়েদুল কবির (কালাম)";
                address = " পোস্টাল ঠিকানা: অষ্টগ্রাম, মোহনপুর বাজার, ব্রাহ্মণবাড়িয়া।";

            }else if (i == 6){
                id = i+1;
                union = " ইউনিয়ন: বাসুদেব";
                chairman = " চেয়ারম্যান: মোঃ নেছার উদ্দিন";
                address = " পোস্টাল ঠিকানা: কোড্ডা, ঘাটিয়ারা,ব্রাহ্মণবাড়িয়া";

            }else if (i == 7){
                id = i+1;
                union = " ইউনিয়ন: সুলতানপুর";
                chairman = " চেয়ারম্যান: ফিরোজুর রহমান";
                address = " পোস্টাল ঠিকানা: সুলতানপুর, সুলতানপুর, ব্রাহ্মণবাড়িয়া";

            }else if (i == 8){
                id = i+1;
                union = " ইউনিয়ন: সুহিলপুর";
                chairman = " চেয়ারম্যান: মোঃ আজিজুর রহমান";
                address = " পোস্টাল ঠিকানা: সুহিলপুর, সুহিলপুর, ব্রাহ্মণবাড়িয়া";

            }else if (i == 9){
                id = i+1;
                union = " ইউনিয়ন: মাছিহাতা";
                chairman = " চেয়ারম্যান: মোঃ জাহাঙ্গীর আলম";
                address = " পোস্টাল ঠিকানা: কাছাইট, মাছিহাতা, ব্রাহ্মণবাড়িয়া";

            }else if (i == 10){
                id = i+1;
                union = " ইউনিয়ন: সাদেকপুর";
                chairman = " চেয়ারম্যান: এ কে এম আবদুল হাই";
                address = " পোস্টাল ঠিকানা: বিরামপুর, সাদেকপুর, ব্রাহ্মণবাড়িয়া";

            }else if (i == 11){
                id = i+1;
                union = " ইউনিয়ন: মজলিশপুর";
                chairman = " চেয়ারম্যান: মোঃ তাজুল ইসলাম";
                address = " পোস্টাল ঠিকানা: মজলিশপুর, মজলিশপুর, ব্রাহ্মণবাড়িয়া";

            }


            UnionRegister unionRegister = new UnionRegister(id, union, chairman, address);
            listOfUnionData.add(unionRegister);
        }

        UnionAdapter unionAdapter = new UnionAdapter(listOfUnionData, getActivity());
        listView.setAdapter(unionAdapter);

        return rootView;
    }

}
