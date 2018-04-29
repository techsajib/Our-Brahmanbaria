package com.techsajib.amaderbbaria.UpozilaUnion.BancharampurUpozila.BancharampurUnion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUnion.KasbaIDRegister;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BancharampurUnionAbout extends Fragment {


    ListView listView;
    ArrayList<BancharampurIDRegister> listOfBancharampurUnionData;

    public BancharampurUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_bancharampur_union_about, container, false);

        listView = (ListView) rootView.findViewById(R.id.bancharampurUnionDataListView);
        listOfBancharampurUnionData = new ArrayList<>();

        for (int i =1; i<14; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 union = " ইউনিয়ন: তেজখালি";
                 chairman = "  চেয়ারম্যান: তাজুল ইসলাম";
                 address = " পোস্টাল ঠিকানা: তেজখালি, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: পাহাড়িয়াকান্দি";
                chairman = "  চেয়ারম্যান: মোঃ গাজিউর রহমান";
                address = " পোস্টাল ঠিকানা: পাহাড়িয়াকান্দি, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: দরিয়াদৌলত";
                chairman = "  চেয়ারম্যান: মোঃ জাহাঙ্গির আলম";
                address = " পোস্টাল ঠিকানা: দরিয়াদৌলত, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: সোনারামপুর";
                chairman = "  চেয়ারম্যান: জসিম উদ্দিন ভূইয়া";
                address = " পোস্টাল ঠিকানা: সোনারামপুর, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: দরিকান্দি";
                chairman = "  চেয়ারম্যান: মোঃ সফিকুল ইসলাম";
                address = " পোস্টাল ঠিকানা: দরিকান্দি, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 6){
                id = i + 1;
                union = " ইউনিয়ন: ছয়ফুল্লাকান্দি";
                chairman = "  চেয়ারম্যান: মোঃ আনোয়ারুল ইসলাম";
                address = " পোস্টাল ঠিকানা: ছয়ফুল্লাকান্দি, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 7){
                id = i + 1;
                union = " ইউনিয়ন: বাঞ্ছারামপুর";
                chairman = "  চেয়ারম্যান: মোঃ হযরত আলী";
                address = " পোস্টাল ঠিকানা: বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 8){
                id = i + 1;
                union = " ইউনিয়ন: আইযুবপুর";
                chairman = "  চেয়ারম্যান: মোঃ নজরুল ইসলাম";
                address = " পোস্টাল ঠিকানা: আইযুবপুর, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 9){
                id = i + 1;
                union = " ইউনিয়ন: ফরদাবাদ";
                chairman = "  চেয়ারম্যান: আব্দুল আজিজ";
                address = " পোস্টাল ঠিকানা: ফরদাবাদ, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 10){
                id = i + 1;
                union = " ইউনিয়ন: রূপসদী";
                chairman = "  চেয়ারম্যান: মোঃ ফিরোজ মিয়া";
                address = " পোস্টাল ঠিকানা: রূপসদী, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 11){
                id = i + 1;
                union = " ইউনিয়ন: ছলিমাবাদ";
                chairman = "  চেয়ারম্যান: আবদুল মতিন";
                address = " পোস্টাল ঠিকানা: ছলিমাবাদ, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 12){
                id = i + 1;
                union = " ইউনিয়ন: উজানচর";
                chairman = "  চেয়ারম্যান: মোহাম্মদ আব্দুল মতিন";
                address = " পোস্টাল ঠিকানা: উজানচর, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 13){
                id = i + 1;
                union = " ইউনিয়ন: মানিকপুর";
                chairman = "  চেয়ারম্যান: মুশফিকুল মান্নান";
                address = " পোস্টাল ঠিকানা: মানিকপুর, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া";
            }

            BancharampurIDRegister bancharampurIDRegister = new BancharampurIDRegister(id, union, chairman, address);
            listOfBancharampurUnionData.add(bancharampurIDRegister);
        }

        BancharampurAdapter bancharampurAdapter = new BancharampurAdapter(listOfBancharampurUnionData, getActivity());
        listView.setAdapter(bancharampurAdapter);
        return rootView;
    }

}
