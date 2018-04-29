package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.DownTrainTimeSchedule.DownTrain;


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
public class DownTrainMain extends Fragment {

    ListView listView;
    ArrayList<DownTrainIDRegister> listOfDownTrainSchedule;

    LinearLayout first;
    Animation uptodown;

    public DownTrainMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.train_down_train_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.trainDownListView);
        listOfDownTrainSchedule = new ArrayList<DownTrainIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.trainDownLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<17; i++) {
            int id = i + 1;
            String trainNumber = "";
            String train = "";
            String trainOffDay = "";
            String firstTime = "";
            String secondTime = "";
            String noticed = "";

            if (i == 1){
                 id = i + 1;
                 trainNumber = " ট্রেন নং: ৭০২";
                 train = " সুবর্ণ এক্সপ্রেস";
                 trainOffDay = " সাপ্তাহিক বন্ধ: শুক্রবার";
                 firstTime = "  ঢাকা হতে ছাড়ে: বিকাল ৩ টা";
                 secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: রাত ৭.১০ মিঃ";
                 noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 2){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭০৪";
                train = " মহানগর প্রভাতী";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  ঢাকা হতে ছাড়ে: সকাল ৭ টা ৪০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: সকাল ১০ টা ১৫ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 3){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭২২";
                train = " মহানগর গোধুলী";
                trainOffDay = " সাপ্তাহিক বন্ধ: রবিবার";
                firstTime = "  ঢাকা হতে ছাড়ে: বিকাল ৩.০০ মি";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: বিকাল ৫.৩৮ মি";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 4){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭৪২";
                train = " তুর্না এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  ঢাকা হতে ছাড়ে: রাত ১১ টা ৩০ মি";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: রাত ৩ টা ৩০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 5){
                id = i + 1;
                trainNumber = " ট্রেন নং: ২";
                train = " চিটাগং মেইল";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  ঢাকা হতে ছাড়ে: রাত ১০ টা ৩০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: রাত ২ টা ৩০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 6){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৪";
                train = " কর্ণফুলী এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  ঢাকা হতে ছাড়ে: সকাল ৮ টা ২৫ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: দুপুর ১২.৪০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 7){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৬৮";
                train = " চট্টলা এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: মঙ্গলবার";
                firstTime = "  ঢাকা হতে ছাড়ে: সকাল ১১ টা";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: দুপুর ৩.৪০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 8){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭০৯";
                train = " পারাবত এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: মঙ্গলবার";
                firstTime = "  ঢাকা হতে ছাড়ে: সকাল ৬ টা ৪০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: সকাল ৯.০০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 9){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭১৭";
                train = " জয়ন্তিকা এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  ঢাকা হতে ছাড়ে: দুপুর ১২ টা";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: বিকাল ৪.৩০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 10){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭৩৯";
                train = " উপবন এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: বুধবার";
                firstTime = "  ঢাকা হতে ছাড়ে: রাত ৯ টা ৫০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: রাত ১.৫০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 11){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭৭৩";
                train = " কালনী এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: শুক্রবার";
                firstTime = "  ঢাকা হতে ছাড়ে: বিকাল ৪ টা";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: রাত ৬.৫০ মি. ";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 12){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৯";
                train = " সুরমা মেইল";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই ";
                firstTime = "  ঢাকা হতে ছাড়ে: রাত ১০ টা ৫০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়ে: রাত ২.৫০ মি.";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 13){
                id = i + 1;
                trainNumber = " --";
                train = " তিতাস কমিউটার";
                trainOffDay = " --";
                firstTime = "  ঢাকা হতে ছাড়ে: সকাল ১০.১০";
                secondTime = "  --";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else  if (i == 14){
                id = i + 1;
                trainNumber = " --";
                train = " তিতাস কমিউটার";
                trainOffDay = " --";
                firstTime = "  ঢাকা হতে ছাড়ে: বিকাল ৫.৩৫ মি.";
                secondTime = "  --";
                noticed = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }

            DownTrainIDRegister downTrainIDRegister = new DownTrainIDRegister(id, trainNumber, train, trainOffDay, firstTime, secondTime, noticed);
            listOfDownTrainSchedule.add(downTrainIDRegister);

        }

            DownTrainAdapter downTrainAdapter = new DownTrainAdapter(listOfDownTrainSchedule, getActivity());
            listView.setAdapter(downTrainAdapter);
        return rootView;
    }

}
