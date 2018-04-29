package com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import com.techsajib.amaderbbaria.DoctorHospital.GovtHospital.GovtHospitalIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrivateHospitalMain extends Fragment {

    ListView listView;
    ArrayList<PrivateHospitalIDRegister> listOfPrivateHospital;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public PrivateHospitalMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hos_private_hospital_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.privateHospitalListView);
        listOfPrivateHospital = new ArrayList<PrivateHospitalIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.privateHospitalLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 0; i<39; i++) {
            int id = i + 1;
            int logo = R.drawable.book;
            String hospital = "";
            String owner = "";
            String location = "";

            if (i == 0){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " ব্রাহ্মণবাড়িয়া মেডিকেল কলেজ হাসপাতাল";
                owner = " পরিচালক - ডাঃ মোঃ আবু সাঈদ";
                location = " ঘাটুরা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 1){
                 id = i + 1;
                 logo = R.drawable.medicalicon;
                 hospital = " দি ল্যাব এইড ও শিশু জেনারেল হাসপাতাল";
                 owner = " পরিচালক - ডাঃ মোঃ বজলুর রহমান";
                 location = " সদর, আমিন কমপ্লেক্স, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " প্রতিভা চক্ষু হাসপাতাল ও ক্লিনিক";
                owner = " পরিচালক - ডাঃ সুখেন্দু বিকাশ তালুকদার";
                location = " পাইক পাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " ব্রাহ্মণবাড়িয়া মডেল জেনারেল হাসপাতাল";
                owner = " পরিচালক - ডাঃ মোঃ আবু সাঈদ";
                location = " মধ্যপাড়া, সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মডেল জেনারেল হাসপাতাল";
                owner = " পরিচালক - ডাঃ মোঃ ফরিদ উদ্দিন আহম্মেদ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " তিতাস জেনারেল হাসপাতাল";
                owner = " পরিচালক - আরতি তালুকদার";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " খ্রীষ্টান মিশনারী হাসপাতাল";
                owner = " পরিচালক - ডাঃ ডিউক চৌধুরী";
                location = " নিয়াজ পার্ক, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 7){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " সেবা ক্লিনিক";
                owner = " পরিচালক - ডাঃ বজলুর রহমান";
                location = " পশ্চিম পাইক পাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 8){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " ডক্টরস কেয়ার হাসপাতাল";
                owner = " পরিচালক- কাজী সায়হাম";
                location = " পাইক পাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 9){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " সেবা পল্লী";
                owner = " পরিচালক - সিরাজুল ইসলাম মোল্লা";
                location = " ভাদুঘর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 10){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " ব্রাহ্মণবাড়িয়া ল্যাব এইড হাসপাতাল এন্ড ডায়াগনস্টিক";
                owner = " ব্যক্তি মালিকানা।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 11){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " ডাঃ ফরিদুল হুদা মেমোরিয়াল ক্লিনিক";
                owner = " ব্যক্তি মালিকানা।";
                location = " কালাশ্রী পাড়া, ব্রাহ্মবাড়িয়া।";
            }else if (i == 12){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " শমরিতা জেনারেল হাসপাতাল";
                owner = " ব্যক্তি মালিকানা।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 13){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " লাইফ কেয়ার হাসপাতাল";
                owner = " ব্যক্তি মালিকানা।";
                location = " জেল রোড, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 14){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " সেন্ট্রাল ডায়াগনস্টিক সেন্টার এন্ড হাসপাতাল";
                owner = " ব্যক্তি মালিকানা।";
                location = " আজিজ গার্ডেন, পুরাতন জেল রোড, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 15){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " আস্থা হাসপাতাল এন্ড ডায়াগনস্টিক সেন্টার";
                owner = " ব্যক্তি মালিকানা।";
                location = " টি এ রোড, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 16){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মেরি স্টোপস ক্লিনিক";
                owner = " ব্যক্তি মালিকানা।";
                location = " জেল রোড, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 17){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মেডিনোভা হাসপাতাল";
                owner = " ব্যক্তি মালিকানা।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 18){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মর্ডাণ এক্স-রে ক্লিনিক";
                owner = " ব্যক্তি মালিকানা।";
                location = " জেল রোড, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 19){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " বসুন্ধরা হাসপাতাল";
                owner = " ব্যক্তি মালিকানা।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 20){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " রয়েল হাসপাতাল";
                owner = " ব্যক্তি মালিকানা।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 21){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মুক্তি প্রাইভেট হাসপাতাল এন্ড ডায়াগনোষ্টিক সেন্টার";
                owner = " পরিচালক -  এম খায়ের বারী";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 22){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " আহমেদ প্রাইভেট এন্ড ডায়াগনেস্টিক সেন্টার হাসপাতাল";
                owner = " পরিচালক - ফরিদ উদ্দিন আহমেদ";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 23){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " সন্ধ্যানী প্যাথলজি সেন্টার";
                owner = " পরিচালক - মোঃ আলমগীর";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 24){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " তিতাস ডায়াগনোষ্টিক সেন্টার";
                owner = " পরিচালক - আশরাফুল ইসলাম";
                location = " হাসপাতাল রোড, নবীনগর ব্রাহ্মণবাড়িয়া।";
            }else if (i == 25){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " সেবা মেডিকেল সেন্টার";
                owner = " পরিচালক -  এম এ জববার";
                location = " থানা গেইট, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 26){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " কনফার্ম ডায়াগনোষ্টিক সেন্টার";
                owner = " পরিচালক - আবদুছ ছাত্তার";
                location = " ডাক বাংলো রোড, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 27){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মাহবুবুর রহমান মেমোরিয়াল হাসপাতাল";
                owner = " পরিচালক - এমডি আতিকুর রহমান";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 28){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " তিতাস ইউনিট হাসপাতাল";
                owner = " পরিচালক - ডাঃ নাছির উদ্দিন চেয়ারম্যান";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 29){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মর্ডান ডায়াগনস্টিক সেন্টার";
                owner = " পরিচালক - মো: সেলিম";
                location = " নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 30){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মেডি-কেয়ার ডায়াগনিস্টিক সেন্টার";
                owner = " পরিচালক - জনাব বীরেন্দ্র";
                location = " নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 31){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " চাতলপাড় ডায়াগনস্টিক সেন্টার";
                owner = " পরিচালক - মো: আ: রাকিব";
                location = " নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 32){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " তিতাস মেডিকেল হল";
                owner = " পরিচালক - মো: জাহাঙ্গীর আলম ভূইয়া";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 33){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " ইস্টার্ন মেডিকেল ল্যাব";
                owner = " পরিচালক - জহর লাল সাহা, মো: আলমগীর, শাফায়েত উল ইসলাম";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 34){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " রূপালী মেডিকেল সেন্টার";
                owner = " পরিচালক - মো: রফিকুল ইসলাম";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 35){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " কিউর মেডিকেল সেন্টার";
                owner = " পরিচালক - কুতুব চৌধুরী";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 36){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " বিকল্প মেডিকেল সার্ভিস";
                owner = " পরিচালক - ডা: শামছুল আলম";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 37){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " সেবা মেডিকেল সেন্টার";
                owner = " পরিচালক - ইয়াসিন আলম সিদ্দিকী";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 38){
                id = i + 1;
                logo = R.drawable.medicalicon;
                hospital = " মনোয়ার হাসপাতাল";
                owner = " পরিচালক - ডাঃ আবদুল কাদের";
                location = " সরাইল, ব্রাহ্মণবাড়িয়া।";
            }

            PrivateHospitalIDRegister privateHospitalIDRegister = new PrivateHospitalIDRegister(id, logo, hospital, owner, location);
            listOfPrivateHospital.add(privateHospitalIDRegister);
        }
            PrivateHospitalAdapter privateHospitalAdapter = new PrivateHospitalAdapter(listOfPrivateHospital, getActivity());
            listView.setAdapter(privateHospitalAdapter);

        return rootView;
    }

}
