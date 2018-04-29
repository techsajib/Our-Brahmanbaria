package com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion.AshuganjAdapter;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion.AshuganjIDRegister;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SarailUnionAbout extends Fragment {

    ListView listView;
    ArrayList<SarailIDRegister> listOfSarailUnionData;


    public SarailUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_sarail_union_about, container, false);

        listView = (ListView) rootView.findViewById(R.id.sarailUnionDataListView);
        listOfSarailUnionData = new ArrayList<>();

        for (int i =1; i<10; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";


            if (i == 1) {
                id = i + 1;
                union = " ইউনিয়ন: অরুয়াইল";
                chairman = "  চেয়ারম্যান: মিজানুর রহমান";
                address = " পোস্টাল ঠিকানা: অরুয়াইল ইউনিয়ন পরিষদ, সরাইল, ব্রাহ্মণবাড়িয়া";
            }else if (i == 2) {
                id = i + 1;
                union = " ইউনিয়ন: পাকশিমূল";
                chairman = "  চেয়ারম্যান: কাজী মোজাম্মেল হক";
                address = " পোস্টাল ঠিকানা: পাকশিমূল ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 3) {
                id = i + 1;
                union = " ইউনিয়ন: চুন্টা";
                chairman = " চেয়ারম্যান: মো:শাহজাহান মিয়া";
                address = " পোস্টাল ঠিকানা: চুন্টা ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 4) {
                id = i + 1;
                union = " ইউনিয়ন: কালিকচ্ছ";
                chairman = "  চেয়ারম্যান: মোঃ তকদীর হোসেন";
                address = " পোস্টাল ঠিকানা: কালিকচ্ছ ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 5) {
                id = i + 1;
                union = " ইউনিয়ন: পানিশ্বর(উত্তর)";
                chairman = "  চেয়ারম্যান: মোঃ নুরুল হক";
                address = " পোস্টাল ঠিকানা: পানিশ্বর(উত্তর) ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 6) {
                id = i + 1;
                union = " ইউনিয়ন: সরাইল";
                chairman = "  চেয়ারম্যান: শংকর চন্দ্র দাস";
                address = " পোস্টাল ঠিকানা: সরাইল ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 7) {
                id = i + 1;
                union = " ইউনিয়ন: নোয়াগাঁও";
                chairman = "  চেয়ারম্যান: মো:কাজল চৌধুরী";
                address = " পোস্টাল ঠিকানা: নোয়াগাঁও ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 8) {
                id = i + 1;
                union = " ইউনিয়ন: শাহজাদাপুর";
                chairman = "  চেয়ারম্যান: রফিকুল ইসলাম";
                address = " পোস্টাল ঠিকানা: শাহাজাদাপুর ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }else if (i == 9) {
                id = i + 1;
                union = " ইউনিয়ন: শাহবাজপুর";
                chairman = "  চেয়ারম্যান: ওছমান উদ্দিন আহম্মদ খালেদ";
                address = " পোস্টাল ঠিকানা: শাহবাজপুর ইউনিয়ন পরিষদ,সরাইল, ব্রাহ্মণবাড়িয়া";

            }


            SarailIDRegister sarailIDRegister  = new SarailIDRegister(id, union, chairman, address);
            listOfSarailUnionData.add(sarailIDRegister);
        }

        SarailAdapter sarailAdapter = new SarailAdapter(listOfSarailUnionData, getActivity());
        listView.setAdapter(sarailAdapter);
            return rootView;
    }

}
