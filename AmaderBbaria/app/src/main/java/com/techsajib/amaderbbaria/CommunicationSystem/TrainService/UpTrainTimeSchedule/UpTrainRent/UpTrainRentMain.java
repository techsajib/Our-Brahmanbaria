package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainRent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpTrainRentMain extends Fragment {

    ListView listView;
    ArrayList<UpTrainRentIDRegister> listOfUpTrainRentSchedule;

    LinearLayout first;
    Animation uptodown;

    public UpTrainRentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.train_up_train_rent_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.trainUpRentListView);
        listOfUpTrainRentSchedule = new ArrayList<UpTrainRentIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.trainUpRentLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<7; i++) {
             int id = i+1;
             String train = " ";
             String aCSeat = " ";
             String snigdaAC = " ";
             String firstClass = " ";
             String shovonChair = " ";
             String shovon = " ";
             String sulob = " ";
             String notice = " ";

             if (i == 1){
                  id = i+1;
                  train = " মহানগর গোধুলী (আপ)";
                  aCSeat = " এসি সীট: ৩০৫/-";
                  snigdaAC = " স্নিগ্ধা (এসি): ২৫৩/-";
                  firstClass = " ১ম শ্রেণী: --";
                  shovonChair = " শোভন চেয়ার: ১৩৫/-";
                  shovon = " শোভন: --";
                  sulob = " সুলভ: --";
                  notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
             }else if (i == 2){
                 id = i+1;
                 train = " উপকুল এক্সপ্রেস (আপ)";
                 aCSeat = " এসি সীট:  --";
                 snigdaAC = " স্নিগ্ধা (এসি): --";
                 firstClass = " ১ম শ্রেণী: ১৭৫/-";
                 shovonChair = " শোভন চেয়ার: ১৩৫/-";
                 shovon = " শোভন: ১১০/-";
                 sulob = " সুলভ: --";
                 notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
             }else if (i == 3){
                 id = i+1;
                 train = " পারাবত এক্সপ্রেস (আপ)";
                 aCSeat = " এসি সীট:  --";
                 snigdaAC = " স্নিগ্ধা (এসি): --";
                 firstClass = " ১ম শ্রেণী: ১৭৫/-";
                 shovonChair = " শোভন চেয়ার: --";
                 shovon = " শোভন: ১১০/-";
                 sulob = " সুলভ: --";
                 notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
             }else if (i == 4){
                 id = i+1;
                 train = " জয়ন্তিকা এক্সপ্রেস (আপ)";
                 aCSeat = " এসি সীট:  --";
                 snigdaAC = " স্নিগ্ধা (এসি): --";
                 firstClass = " ১ম শ্রেণী: --";
                 shovonChair = " শোভন চেয়ার: --";
                 shovon = " শোভন: ১১০/-";
                 sulob = " সুলভ: --";
                 notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
             }else if (i == 5){
                 id = i+1;
                 train = " তূর্ণা নিশিথা (আপ)";
                 aCSeat = " এসি সীট:  --";
                 snigdaAC = " স্নিগ্ধা (এসি): --";
                 firstClass = " ১ম শ্রেণী: --";
                 shovonChair = " শোভন চেয়ার: --";
                 shovon = " শোভন: ১১০/-";
                 sulob = " সুলভ: --";
                 notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
             }else if (i == 6){
                 id = i+1;
                 train = " চট্টলা এক্সপ্রেস (আপ)";
                 aCSeat = " এসি সীট:  --";
                 snigdaAC = " স্নিগ্ধা (এসি): --";
                 firstClass = " ১ম শ্রেণী: --";
                 shovonChair = " শোভন চেয়ার: --";
                 shovon = " শোভন: --";
                 sulob = " সুলভ: ৭০/-";
                 notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
             }

             UpTrainRentIDRegister upTrainRentIDRegister = new UpTrainRentIDRegister(id, train, aCSeat, snigdaAC, firstClass, shovonChair, shovon, sulob, notice);
             listOfUpTrainRentSchedule.add(upTrainRentIDRegister);

        }

            UpTrainRentAdapter upTrainRentAdapter = new UpTrainRentAdapter(listOfUpTrainRentSchedule, getActivity());
            listView.setAdapter(upTrainRentAdapter);
        return rootView;
    }

}
