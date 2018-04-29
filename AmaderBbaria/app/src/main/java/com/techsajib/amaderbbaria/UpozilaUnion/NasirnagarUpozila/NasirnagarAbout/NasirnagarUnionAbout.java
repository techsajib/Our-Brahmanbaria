package com.techsajib.amaderbbaria.UpozilaUnion.NasirnagarUpozila.NasirnagarAbout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion.SarailAdapter;
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion.SarailIDRegister;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NasirnagarUnionAbout extends Fragment {

    ListView listView;
    ArrayList<NasirnagarIDRegister> listOfNasirnagarUnionData;


    public NasirnagarUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_nasirnagar_union_about, container, false);

        listView = (ListView) rootView.findViewById(R.id.nasirnagarUnionDataListView);
        listOfNasirnagarUnionData = new ArrayList<>();

        for (int i =1; i<14; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 union = " ইউনিয়ন: চাতলপাড়";
                 chairman = "  চেয়ারম্যান: শেখ আবদুল আহাদ";
                 address = " পোস্টাল ঠিকানা: চাতলপাড়, নাসিরনগর ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: ভলাকুট";
                chairman = "  চেয়ারম্যান: এস, এম বাকি বিল্লাহ";
                address = " পোস্টাল ঠিকানা: ভলাকুট, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: গোয়ালনগর";
                chairman = "  চেয়ারম্যান: মোঃ কিরণ মিয়া";
                address = " পোস্টাল ঠিকানা: গোয়ালনগর, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: নাসিরনগর সদর";
                chairman = "  চেয়ারম্যান: মোঃ রফিজ মিয়া";
                address = " পোস্টাল ঠিকানা: নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: কুন্ডা";
                chairman = "  চেয়ারম্যান: মোঃ ওমরাও খান";
                address = " পোস্টাল ঠিকানা: কুন্ডা, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 6){
                id = i + 1;
                union = " ইউনিয়ন: গোকর্ণ";
                chairman = "  চেয়ারম্যান: মো:হাসান খান";
                address = " পোস্টাল ঠিকানা: গোকর্ণ, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 7){
                id = i + 1;
                union = " ইউনিয়ন: গুণিয়াউক";
                chairman = "  চেয়ারম্যান: মো:আবুল হোসেন";
                address = " পোস্টাল ঠিকানা: গুণিয়াউক, নাসিরনগর ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 8){
                id = i + 1;
                union = " ইউনিয়ন: বুড়িশ্বর";
                chairman = "  চেয়ারম্যান: এটিএম মনিরুজ্জামান সরকার";
                address = " পোস্টাল ঠিকানা: বুড়িশ্বর, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 9){
                id = i + 1;
                union = " ইউনিয়ন: ফান্দাউক";
                chairman = "  চেয়ারম্যান: মোঃ ফারুকুজ্জামান";
                address = " পোস্টাল ঠিকানা: ফান্দাউক, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 10){
                id = i + 1;
                union = " ইউনিয়ন: পূর্বভাগ";
                chairman = "  চেয়ারম্যান: মোঃ সায়েম মিয়া";
                address = " পোস্টাল ঠিকানা: পূর্বভাগ, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 11){
                id = i + 1;
                union = " ইউনিয়ন: হরিপুর";
                chairman = "  চেয়ারম্যান: মোঃ জামাল মিয়া";
                address = " পোস্টাল ঠিকানা: হরিণবেড়, হরিপুর, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 12){
                id = i + 1;
                union = " ইউনিয়ন: চাপরতলা";
                chairman = "  চেয়ারম্যান: মোঃ ফয়েজ উদ্দিন ভূইয়া";
                address = " পোস্টাল ঠিকানা: চাপরতলা, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else  if (i == 13){
                id = i + 1;
                union = " ইউনিয়ন: ধরমন্ডল";
                chairman = "  চেয়ারম্যান: মোঃ আব্দুল হাই";
                address = " পোস্টাল ঠিকানা: ধরমন্ডল, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }

            NasirnagarIDRegister nasirnagarIDRegister = new NasirnagarIDRegister(id, union, chairman, address);
            listOfNasirnagarUnionData.add(nasirnagarIDRegister);
        }

       NasirnagarAdapter nasirnagarAdapter = new NasirnagarAdapter(listOfNasirnagarUnionData, getActivity());
        listView.setAdapter(nasirnagarAdapter);
        return rootView;
    }

}
