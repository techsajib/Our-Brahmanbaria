package com.techsajib.amaderbbaria.UpozilaUnion.BijoynagarUpozila.BijoynagarUnion;


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
public class BIjoynagarUnionAbout extends Fragment {

    ListView listView;
    ArrayList<BijoynagarIDRegister> listOfBijoynagarUnionData;

    public BIjoynagarUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_bijoynagar_union_about, container, false);
        listView = (ListView) rootView.findViewById(R.id.bijoynagarUnionDataListView);
        listOfBijoynagarUnionData = new ArrayList<>();

        for (int i =1; i<11; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 union = " ইউনিয়ন: বুধন্তি";
                 chairman = "  চেয়ারম্যান: আলহাজ্ব মো:জিতু মিয়া";
                 address = " পোস্টাল ঠিকানা: বুধন্তি, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: হরষপুর";
                chairman = "  চেয়ারম্যান: মোঃ সারুয়ার রহমান ভূইয়া";
                address = " পোস্টাল ঠিকানা: হরষপুর, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: চান্দুরা";
                chairman = "  চেয়ারম্যান: এ এম শামিউল হক চৌধুরী";
                address = " পোস্টাল ঠিকানা: চান্দুরা, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: ইছাপুরা";
                chairman = "  চেয়ারম্যান: মো:জিয়াউল হক বকুল";
                address = " পোস্টাল ঠিকানা: ইছাপুরা, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: চম্পকনগর";
                chairman = "  চেয়ারম্যান: মোঃ হামিদুল হক";
                address = " পোস্টাল ঠিকানা: চম্পকনগর, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 6){
                id = i + 1;
                union = " ইউনিয়ন: চর ইসলামপুর";
                chairman = "  চেয়ারম্যান: মোঃ দানা মিয়া ভূইয়া";
                address = " পোস্টাল ঠিকানা: চর ইসলামপুর, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 7){
                id = i + 1;
                union = " ইউনিয়ন: পত্তন";
                chairman = "  চেয়ারম্যান: মোঃ কামরুজ্জামান রতন";
                address = " পোস্টাল ঠিকানা: পত্তন, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 8){
                id = i + 1;
                union = " ইউনিয়ন: সিঙ্গারবিল";
                chairman = "  চেয়ারম্যান: মোঃ মনিরুল ইসলাম";
                address = " পোস্টাল ঠিকানা: সিঙ্গারবিল, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 9){
                id = i + 1;
                union = " ইউনিয়ন: বিষ্ণুপুর";
                chairman = "  চেয়ারম্যান: মোঃ জামাল উদ্দিন ভূইয়া";
                address = " পোস্টাল ঠিকানা: বিষ্ণুপুর, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 10){
                id = i + 1;
                union = " ইউনিয়ন: পাহাড়পুর";
                chairman = "  চেয়ারম্যান: মো:আব্দুর রশিদ খন্দকার";
                address = " পোস্টাল ঠিকানা: পাহাড়পুর, বিজয়নগর, ব্রাহ্মণবাড়িয়া";
            }

            BijoynagarIDRegister bijoynagarIDRegister = new BijoynagarIDRegister(id, union, chairman, address);
            listOfBijoynagarUnionData.add(bijoynagarIDRegister);
        }

            BijoynagarAdapter bijoynagarAdapter = new BijoynagarAdapter(listOfBijoynagarUnionData, getActivity());
            listView.setAdapter(bijoynagarAdapter);
            return rootView;
    }

}
