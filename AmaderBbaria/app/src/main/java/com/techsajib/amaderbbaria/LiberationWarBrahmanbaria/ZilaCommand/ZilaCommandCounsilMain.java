package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.ZilaCommand;


import android.content.Intent;
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
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.UpozilaChairman.UpozilaChairmanIDRegister;
import com.techsajib.amaderbbaria.UpozilaUnion.SadarUpozila.SadarUpozilaMain;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZilaCommandCounsilMain extends Fragment {

    ListView listView;
    ArrayList<ZilaCommandIDRegister> listOfZilaCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public ZilaCommandCounsilMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_zila_command_counsil_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.zilaCommandListView);
        listOfZilaCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.zilaCommandLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<18; i++){
            int id = i + 1;
            String designation = "";
            String name = "";
            String fatherName = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 designation = " পদবী: ইউনিট কমান্ডার";
                 name = " প্রার্থীর নাম: আলহাজ্ব মো: হারুন অর রশিদ";
                 fatherName = " প্রার্থীর পিতার নাম: আবদুল হামিদ";
                 address = " প্রার্থীর ঠিকানা: অলিপুর, বিজয়নগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: এস, এম আজিজুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: সুবেদার মো: লাল মিয়া";
                address = " প্রার্থীর ঠিকানা: সেমন্তঘর, বাঘাউড়া, নবীনগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: ডেপুটি ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: গাজী মো: রতন মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আবদুল ছাত্তার";
                address = " প্রার্থীর ঠিকানা: বিজেশ্বর, উলচাপাড়া, সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: এস আর এম ফারুক";
                fatherName = " প্রার্থীর পিতার নাম: তোতা মিয়া";
                address = " প্রার্থীর ঠিকানা: পানিয়ারুপ, কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (প্রচার)";
                name = " প্রার্থীর নাম: মো: তাজুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: আবদুল লতিফ";
                address = " প্রার্থীর ঠিকানা: তারুয়া, তরুয়া, আশুগঞ্জ, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (তথ্য ও গবেষণা)";
                name = " প্রার্থীর নাম: মো: মোখলেছুর রহমান";
                fatherName = " প্রার্থীর পিতার নাম: আজিজুর রহমান";
                address = " প্রার্থীর ঠিকানা: রাণীখার, ঘোলখা, আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: অরুণ জ্যোতি সরকার";
                fatherName = " প্রার্থীর পিতার নাম: ক্ষেত্রমোহন সরকার";
                address = " প্রার্থীর ঠিকানা: তালপাড়া, নাসিরনগর, ব্রাহ্মণবাড়িয়া";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাহিত্য ও সংস্কৃতি)";
                name = " প্রার্থীর নাম: গোলাম মোহাম্মদ";
                fatherName = " প্রার্থীর পিতার নাম: জুলফিকার আলী";
                address = " প্রার্থীর ঠিকানা: রসুল্লাবাদ, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (ত্রাণ ও সমাজ কল্যাণ)";
                name = " প্রার্থীর নাম: রফিকুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: আয়ুব আলী";
                address = " প্রার্থীর ঠিকানা: কামাউড়া, আশুগঞ্জ, ব্রাহ্মণবাড়িয়া";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (ক্রীড়া)";
                name = " প্রার্থীর নাম: আবুল কালাম আজাদ";
                fatherName = " প্রার্থীর পিতার নাম: মহিউদ্দিন";
                address = " প্রার্থীর ঠিকানা: গোপীনাথপুর, কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (শ্রম ও জনশক্তি)";
                name = " প্রার্থীর নাম: মো: হায়দার আলী";
                fatherName = " প্রার্থীর পিতার নাম: ছলিম উদ্দিন";
                address = " প্রার্থীর ঠিকানা: রুপসদী, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 12){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (দপ্তর)";
                name = " প্রার্থীর নাম: মো: আবদুল্লা খসরু";
                fatherName = " প্রার্থীর পিতার নাম: মো: আবদুল হাই";
                address = " প্রার্থীর ঠিকানা: কাজীপাড়া, সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 13){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (প্রকল্প ও সমবায়)";
                name = " প্রার্থীর নাম: মো: ফুল মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আবুদর রহিম";
                address = " প্রার্থীর ঠিকানা: দগরিসার, আশুগঞ্জ, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 14){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (শিক্ষা, পাঠাগার ও মিলনায়তন)";
                name = " প্রার্থীর নাম: জহির উদ্দিন আহম্মদ";
                fatherName = " প্রার্থীর পিতার নাম: সুন্দর আলী";
                address = " প্রার্থীর ঠিকানা: হাবলাউচ্চ, সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 15){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: কাজী মফিজুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: কাজী আলী মিয়া";
                address = " প্রার্থীর ঠিকানা: সৈয়দটুলা, সরাইল, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 16){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মো: মফিজুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: মোগল মিয়া";
                address = " প্রার্থীর ঠিকানা: বাড়াইল, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 17){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মো: লিয়াকত আলী";
                fatherName = " প্রার্থীর পিতার নাম: আ: আলিম";
                address = " প্রার্থীর ঠিকানা: নাটঘর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }

            ZilaCommandIDRegister zilaCommandIDRegister = new ZilaCommandIDRegister(id, designation, name, fatherName, address);
            listOfZilaCommand.add(zilaCommandIDRegister);
        }

        ZilaCommandAdapter zilaCommandAdapter = new ZilaCommandAdapter(listOfZilaCommand, getActivity());
        listView.setAdapter(zilaCommandAdapter);



        return rootView;
    }

}
