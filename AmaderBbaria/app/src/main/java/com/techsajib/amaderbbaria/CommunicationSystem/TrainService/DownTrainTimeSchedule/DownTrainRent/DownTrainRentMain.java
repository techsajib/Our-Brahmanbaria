package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.DownTrainTimeSchedule.DownTrainRent;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.DownTrainTimeSchedule.DownTrain.DownTrainAdapter;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.DownTrainTimeSchedule.DownTrain.DownTrainIDRegister;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainRent.UpTrainRentIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DownTrainRentMain extends Fragment {


    ListView listView;
    ArrayList<DownTrainRentIDRegister> listOfDownTrainRent;

    LinearLayout first;
    Animation uptodown;

    public DownTrainRentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.train_down_train_rent_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.trainDownRrentListView);
        listOfDownTrainRent = new ArrayList<DownTrainRentIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.trainDownRrentLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<5; i++) {
            int id = i + 1;
            String train = " ";
            String aCSeat = " ";
            String snigdaAC = " ";
            String firstClass = " ";
            String shovonChair = " ";
            String shovon = " ";
            String sulob = " ";
            String notice = " ";

            if (i == 1){
                 id = i + 1;
                 train = " মহানগর প্রভাতী (ডাউন)";
                 aCSeat = " এসি সীট: ৪৮৯/-";
                 snigdaAC = " স্নিগ্ধা (এসি): ৮০৯/-";
                 firstClass = " ১ম শ্রেণী: --";
                 shovonChair = " শোভন চেয়ার: ২১৫/-";
                 shovon = " শোভন: --";
                 sulob = " সুলভ: --";
                 notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
            }else if (i == 2){
                id = i + 1;
                train = " মহানগর গোধুলী (ডাউন)";
                aCSeat = " এসি সীট: --";
                snigdaAC = " স্নিগ্ধা (এসি): --";
                firstClass = " ১ম শ্রেণী: ২৮৫/-";
                shovonChair = " শোভন চেয়ার: --";
                shovon = " শোভন: ১৮০/-";
                sulob = " সুলভ: --";
                notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
            }else if (i == 3){
                id = i + 1;
                train = " তূর্ণা নিশিথা (ডাউন)";
                aCSeat = " এসি সীট: --";
                snigdaAC = " স্নিগ্ধা (এসি): ৪০৯/-";
                firstClass = " ১ম শ্রেণী: --";
                shovonChair = " শোভন চেয়ার: ২১৫/-";
                shovon = " শোভন: --";
                sulob = " সুলভ: --";
                notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
            }else if (i == 4){
                id = i + 1;
                train = " চট্রলা এক্সপ্রেস (ডাউন)";
                aCSeat = " এসি সীট: --";
                snigdaAC = " স্নিগ্ধা (এসি): --";
                firstClass = " ১ম শ্রেণী: ২৮৫/-";
                shovonChair = " শোভন চেয়ার: ২১৫/-";
                shovon = " শোভন: --";
                sulob = " সুলভ: ১১০/-";
                notice = " ***ট্রেনের ভাড়া পরিবর্তিত হতে পারে।";
            }

            DownTrainRentIDRegister downTrainRentIDRegister = new DownTrainRentIDRegister(id, train, aCSeat, snigdaAC, firstClass, shovonChair, shovon, sulob, notice);
            listOfDownTrainRent.add(downTrainRentIDRegister);
        }

        DownTrainRentAdapter downTrainRentAdapter = new DownTrainRentAdapter(listOfDownTrainRent, getActivity());
        listView.setAdapter(downTrainRentAdapter);
        return rootView;
    }

}
