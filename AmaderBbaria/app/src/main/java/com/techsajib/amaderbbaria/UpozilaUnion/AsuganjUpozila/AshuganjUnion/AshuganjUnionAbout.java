package com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion;


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
public class AshuganjUnionAbout extends Fragment {

    ListView listView;
    ArrayList<AshuganjIDRegister> listOfAshuganjUnionData;

    public AshuganjUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_ashuganj_union_about, container, false);

        listView = (ListView) rootView.findViewById(R.id.ashuganjUnionDataListView);
        listOfAshuganjUnionData = new ArrayList<>();

        for (int i =1; i<9; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";


            if (i == 1){
                id = i + 1;
                union = " ইউনিয়ন: আশুগঞ্জ সদর";
                chairman = " চেয়ারম্যান: মোঃ মোবারক হোসেন";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, আশুগঞ্জ সদর, আশুগঞ্জ";
            }else  if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: চরচারতলা";
                chairman = " চেয়ারম্যান: মোঃ আয়ুব খান";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, চরচারতলা, আশুগঞ্জ";
            }else  if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: দুর্গাপুর";
                chairman = " চেয়ারম্যান: জিয়াউল করিম খান সাবু";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, দুর্গাপুর, আশুগঞ্জ";
            }else  if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: তালশহর";
                chairman = " চেয়ারম্যান: মো আবু সামা";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, তালশহর, আশুগঞ্জ";
            }else  if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: আড়াইসিধা";
                chairman = " চেয়ারম্যান: মো: সেলিম মিয়া";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, আড়াইসিধা, আশুগঞ্জ";
            }else  if (i == 6){
                id = i + 1;
                union = " ইউনিয়ন: শরীফপুর";
                chairman = " চেয়ারম্যান: সাইফ উদ্দিন";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, শরীফপুর, আশুগঞ্জ";
            }else  if (i == 7){
                id = i + 1;
                union = " ইউনিয়ন: লালপুর";
                chairman = " চেয়ারম্যান: আবু সায়েম";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, লালপুর, আশুগঞ্জ";
            }else  if (i == 8){
                id = i + 1;
                union = " ইউনিয়ন: তারুয়া";
                chairman = " চেয়ারম্যান: ইদ্রিস মিয়া";
                address = " পোস্টাল ঠিকানা: ইউনিয়ন পরিষদ কার্যালয়, তারুয়া, আশুগঞ্জ";
            }

            AshuganjIDRegister ashuganjIDRegister = new AshuganjIDRegister(id, union, chairman, address);
            listOfAshuganjUnionData.add(ashuganjIDRegister);

        }

            AshuganjAdapter ashuganjAdapter = new AshuganjAdapter(listOfAshuganjUnionData, getActivity());
            listView.setAdapter(ashuganjAdapter);
        return rootView;
    }

}
