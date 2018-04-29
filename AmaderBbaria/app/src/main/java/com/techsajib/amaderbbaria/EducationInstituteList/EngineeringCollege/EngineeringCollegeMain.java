package com.techsajib.amaderbbaria.EducationInstituteList.EngineeringCollege;


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
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EngineeringCollegeMain extends Fragment {

    ListView listView;
    ArrayList<EngineeringCollegeIDRegister> listOfEngineeringCollege;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public EngineeringCollegeMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.edu_engineering_college_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.engineeringCollegeListView);
        listOfEngineeringCollege = new ArrayList<EngineeringCollegeIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.engineeringCollegeLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<7; i++) {
            int id = i + 1;
            int logo = R.drawable.book;
            String college = "";
            String placed = "";
            String location = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.engineeringicon;
                college = " ব্রাহ্মণবাড়িয়া পলিটেকনিক ইনস্টিটিউট";
                placed = " ২০০৫ সালে প্রতিষ্ঠিত হয়।";
                location = " ইসলামপুর, বুধন্তী, বিজয়নগর।";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.engineeringicon;
                college = " সেবাপল্লী সাইন্স এন্ড পলিটেকনিক ইন্সটিটিউট";
                placed = " ২০০২ সালে প্রতিষ্ঠিত হয়।";
                location = " সেবাপল্লী, ভাদুঘর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.engineeringicon;
                college = " বদিউল আলম সায়েন্স এন্ড পলিটেকনিক ইনস্টিটিউট";
                placed = " ";
                location = " কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.engineeringicon;
                college = " জাহানারা কুদ্দুস ইঞ্জিনিয়ারিং ইনস্টিটিউট";
                placed = " ";
                location = " আশুগঞ্জ, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.engineeringicon;
                college = " ব্রাহ্মণবাড়িয়া টেকনিক্যাল স্কুল ও কলেজ";
                placed = " ১৯৬৯ সালে প্রতিষ্ঠিত হয়।";
                location = " খৈয়াসার, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.engineeringicon;
                college = " তোফায়েল আলী কারিগরি স্কুল এন্ড কলেজ";
                placed = " ২০০০ সালে প্রতিষ্ঠিত হয়।";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }

            EngineeringCollegeIDRegister engineeringCollegeIDRegister = new EngineeringCollegeIDRegister(id, logo, college, placed, location);
            listOfEngineeringCollege.add(engineeringCollegeIDRegister);

        }
            EngineeringCollegeAdapter engineeringCollegeAdapter = new EngineeringCollegeAdapter(listOfEngineeringCollege, getActivity());
            listView.setAdapter(engineeringCollegeAdapter);
        return rootView;
    }

}
