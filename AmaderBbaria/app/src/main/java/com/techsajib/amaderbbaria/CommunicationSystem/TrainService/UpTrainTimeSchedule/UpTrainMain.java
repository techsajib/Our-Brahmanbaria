package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital.PrivateHospitalIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpTrainMain extends Fragment {

    ListView listView;
    ArrayList<UpTrainIDRegister> listOfUpTrainSchedule;

    LinearLayout first;
    Animation uptodown;


    public UpTrainMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.train_up_train_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.trainListView);
        listOfUpTrainSchedule = new ArrayList<UpTrainIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.trainLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<17; i++) {
            int id = i + 1;
            String trainNumber = "";
            String train = "";
            String trainOffDay = "";
            String firstTime = "";
            String secondTime = "";
            String notice = "";

            if (i == 1){
                 id = i + 1;
                 trainNumber = " ট্রেন নং: ৭২১";
                 train = " মহানগর প্রভাতী";
                 trainOffDay = " সাপ্তাহিক বন্ধ: রবিবার";
                 firstTime = "  চট্টগ্রাম হতে ছাড়েঃ সকাল ৭.১৫ মিঃ";
                 secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ সকাল ১১.৫0 মিঃ";
                 notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 2){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭০৩";
                train = " মহানগর গোধুলী";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ বিকাল ৩.০০ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ বিকাল ৭.৩০ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 3){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭৪১";
                train = " তুর্ণা নিশিতা";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ রাত ১১.০০ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ রাত ৩.২৪ মি:";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 4){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৩";
                train = " কর্ণফুলী এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ সকাল ১০.০০ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ দুপুর ৪.১৩ মিঃ";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 5){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭০১";
                train = " সুবর্ণ এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: সোমবার";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ সকাল ৬ টা ৪০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ দুপুর ১২.৪৫ মিঃ";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 6){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৬৭";
                train = " চট্টলা এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: মঙ্গলবার";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ সকাল ৮ টা ৪০ মিনিট";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ দুপুর  ১:০৭ মিনিট";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";

            }else if (i == 7){
                id = i + 1;
                trainNumber = " ট্রেন নং: ১";
                train = " চট্টগ্রাম মেইল";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই ";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ রাত ১০.৩০ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ রাত ৪.০৫ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";

            }else if (i == 8){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭১১";
                train = " উপকুল এক্সপ্রেস ";
                trainOffDay = " সাপ্তাহিক বন্ধ: বুধবার";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ দুপুর ২.১৫ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ বিকাল ৬.১৯ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";

            }else if (i == 9){
                id = i + 1;
                trainNumber = " ট্রেন নং: ১২";
                train = " নোয়াখালী এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  চট্টগ্রাম হতে ছাড়েঃ রাত ৮.৩০ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ রাত ১.৩০ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";

            }else if (i == 10){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭১০";
                train = " পারাবত এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: মঙ্গলবার";
                firstTime = "  সিলেট হতে ছাড়েঃ দুপুর ২.৪৫ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ সন্ধ্যা ৭.১৮ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";

            }else if (i == 11){
                id = i + 1;
                trainNumber = "ট্রেন নং: ৭১৮";
                train = " জয়ন্তিকা এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: বৃহস্পতিবার";
                firstTime = "  সিলেট হতে ছাড়েঃ সকাল ৮ টা ৪০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ দুপুর ২.০৫ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";

            }else if (i == 12){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭৪০";
                train = " উপবন এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = " সিলেট হতে ছাড়েঃ রাত ১০.০০ মি.";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ রাত ২.৩০ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 13){
                id = i + 1;
                trainNumber = " ট্রেন নং: ৭৭৪";
                train = " কালনী এক্সপ্রেস";
                trainOffDay = " সাপ্তাহিক বন্ধ: শুক্রবার";
                firstTime = " সিলেট হতে ছাড়েঃ সকাল ৭.০০ মি.";
                secondTime = " ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ সকাল  ১১.০০ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 14){
                id = i + 1;
                trainNumber = " ট্রেন নং: ১০";
                train = " সুরমা মেইল";
                trainOffDay = " সাপ্তাহিক বন্ধ: নাই";
                firstTime = "  সিলেট হতে ছাড়েঃ রাত ৭.২০ মিঃ";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ রাত ৪.২৫ মি.";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 15){
                id = i + 1;
                trainNumber = " ট্রেন নং: -- ";
                train = " তিতাস কমিউটার";
                trainOffDay = " সাপ্তাহিক বন্ধ: --";
                firstTime = "  --";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ সকাল ৫.৩৮ মি:";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }else if (i == 16){
                id = i + 1;
                trainNumber = " ট্রেন নং: -- ";
                train = " তিতাস কমিউটার";
                trainOffDay = " সাপ্তাহিক বন্ধ: --";
                firstTime = "  --";
                secondTime = "  ব্রাহ্মণবাড়িয়া হতে ছাড়েঃ দুপুর ১.৩০ মি";
                notice = " ***ট্রেনের সময় ও শিডিউল পরিবর্তিত হতে পারে।";
            }

            UpTrainIDRegister upTrainIDRegister = new UpTrainIDRegister(id, trainNumber, train, trainOffDay, firstTime, secondTime, notice);
            listOfUpTrainSchedule.add(upTrainIDRegister);
        }

            UpTrainAdapter upTrainAdapter = new UpTrainAdapter(listOfUpTrainSchedule, getActivity());
            listView.setAdapter(upTrainAdapter);

        return rootView;
    }

}
