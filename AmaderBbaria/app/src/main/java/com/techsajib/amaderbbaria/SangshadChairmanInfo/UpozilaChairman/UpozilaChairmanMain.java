package com.techsajib.amaderbbaria.SangshadChairmanInfo.UpozilaChairman;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember.SangshadIDRegister;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpozilaChairmanMain extends Fragment {

    ListView listView;
    ArrayList<UpozilaChairmanIDRegister> listOfUpozilaChairman;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public UpozilaChairmanMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.sangshad_upozila_chairman_main, container, false);

        //interstitial ads here // change your setAdunitAd ID, it's fake!
        interstitialAd = new InterstitialAd(getActivity());
        interstitialAd.setAdUnitId("ca-app-pub-8230275109768142/2069466350");
        AdRequest adRequest1 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest1);

        interstitialAd.setAdListener(new AdListener(){
                                         @Override
                                         public void onAdLoaded() {
                                             if (interstitialAd.isLoaded()){
                                                 interstitialAd.show();
                                             }
                                         }
                                     }

        );

        listView = (ListView) rootView.findViewById(R.id.upozilaChairmanListView);
        listOfUpozilaChairman = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.upozilaChairmanLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<10; i++) {
            int id = i + 1;
            String upozilaName = "উপজেলা: ব্রাহ্মণবাড়িয়া সদর";
            String chairmanName = " চেয়ারম্যান: মোঃ জাহাঙ্গীর আলম ";
            String viceChairmanName = "ভাইস চেয়ারম্যান: মহসিন মিঞা";
            String womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: তাসলিমা খানম নিশাত";
            String mayorName = "পৌরসভা মেয়র: নায়ার কবির";

            if (i == 1){
                 id = i + 1;
                 upozilaName = "উপজেলা: ব্রাহ্মণবাড়িয়া সদর";
                 chairmanName = "চেয়ারম্যান: মোঃ জাহাঙ্গীর আলম ";
                 viceChairmanName = "ভাইস চেয়ারম্যান: মহসিন মিঞা";
                 womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: তাসলিমা খানম নিশাত";
                 mayorName = "পৌরসভা মেয়র: নায়ার কবির";
            }else if (i == 2){
                id = i + 1;
                upozilaName = "উপজেলা: সরাইল";
                chairmanName = "চেয়ারম্যান: মোঃ  আবদুর  রহমান";
                viceChairmanName = "ভাইস চেয়ারম্যান: শের আলম";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: তাহমিনা বেগম";
                mayorName = "পৌরসভা মেয়র: NA";
            }else if (i == 3){
                id = i + 1;
                upozilaName = "উপজেলা: আশুগঞ্জ";
                chairmanName = "চেয়ারম্যান: আবু  আসিফ আহমেদ";
                viceChairmanName = "ভাইস চেয়ারম্যান: আমির হোসাইন";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: রেহেনা আক্তার";
                mayorName = "পৌরসভা মেয়র: NA";
            }else if (i == 4){
                id = i + 1;
                upozilaName = "উপজেলা: নাসিরনগর";
                chairmanName = "চেয়ারম্যান: এ টি এম মনিরুজ্জামান সরকার";
                viceChairmanName = "ভাইস চেয়ারম্যান: ";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: ";
                mayorName = "পৌরসভা মেয়র: ";
            }else if (i == 5){
                id = i + 1;
                upozilaName = "উপজেলা: নবীনগর";
                chairmanName = "চেয়ারম্যান: ইঞ্জিনিয়ার শফিকুল ইসলাম";
                viceChairmanName = "ভাইস চেয়ারম্যান: মোশারফ হোসেন";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: মোছেনা বেগম";
                mayorName = "পৌরসভা মেয়র: মাইনূল ইসলাম মাইনু";
            }else if (i == 6){
                id = i + 1;
                upozilaName = "উপজেলা: বাঞ্ছারামপুর";
                chairmanName = "চেয়ারম্যান: মোঃ নুরুল ইসলাম";
                viceChairmanName = "ভাইস চেয়ারম্যান: ";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: ";
                mayorName = "পৌরসভা মেয়র: ";
            }else if (i == 7){
                id = i + 1;
                upozilaName = "উপজেলা: কসবা";
                chairmanName = "চেয়ারম্যান: এড. আনিসুল হক ভূঁইয়া";
                viceChairmanName = "ভাইস চেয়ারম্যান: অধ্যাপিকা শাহিন সুলতানা";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: অধ্যাপিকা বিলকিস বেগম";
                mayorName = "পৌরসভা মেয়র: এমরান উদ্দিন জুয়েল";
            }else if (i == 8){
                id = i + 1;
                upozilaName = "উপজেলা: আখাউড়া";
                chairmanName = "চেয়ারম্যান: মোঃ  মুসলিম  উদ্দিন";
                viceChairmanName = "ভাইস চেয়ারম্যান: ";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: ";
                mayorName = "পৌরসভা মেয়র: ";
            }else if (i == 9){
                id = i + 1;
                upozilaName = "উপজেলা: বিজয়নগর";
                chairmanName = "চেয়ারম্যান: মোঃ  তানভীর  ভূঞা";
                viceChairmanName = "ভাইস চেয়ারম্যান: বাবুল আক্তার";
                womanViceChairmanName = "মহিলা ভাইস চেয়ারম্যান: ফজিলাতুন্নেছা টুনি";
                mayorName = "পৌরসভা মেয়র: NA";
            }

            UpozilaChairmanIDRegister upozilaChairmanIDRegister = new UpozilaChairmanIDRegister(id, upozilaName, chairmanName, viceChairmanName, womanViceChairmanName, mayorName);
            listOfUpozilaChairman.add(upozilaChairmanIDRegister);

        }
            UpozilaChairmanAdapter upozilaChairmanAdapter = new UpozilaChairmanAdapter(listOfUpozilaChairman, getActivity());
            listView.setAdapter(upozilaChairmanAdapter);
            return rootView;
    }

}
