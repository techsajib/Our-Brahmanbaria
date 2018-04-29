package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SadarCommand;


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
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.ZilaCommand.ZilaCommandAdapter;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.ZilaCommand.ZilaCommandIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SadarCommandMain extends Fragment {

    ListView listView;
    ArrayList<SadarIDRegister> listOfSadarCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public SadarCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_sadar_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.sadarCommandListView);
        listOfSadarCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.sadarCommandLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<12; i++){
            int id = i + 1;
            String designation = "";
            String name = "";
            String fatherName = "";
            String address = "";

            if (i == 1){
                id = i + 1;
                designation = " পদবী: ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: মোঃ আবু হোরায়রাহ";
                fatherName = " প্রার্থীর পিতার নাম: সুবেঃ অবঃ আব্দুল আউয়াল";
                address = " প্রার্থীর ঠিকানা: কান্দিপাড়া, ১০ নং ওয়ার্ড, সদর";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: মোঃ তাজুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: গোলাম রসুল";
                address = " প্রার্থীর ঠিকানা: রামরাইল, সেন্দ, সদর";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: মোঃ নুরুল আমিন";
                fatherName = " প্রার্থীর পিতার নাম: গোলাম মৌলা";
                address = " প্রার্থীর ঠিকানা: কালিসীমা, সদর";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: সিঃ  মোঃ আলফাজ  মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আঃ আজিজ মিয়া";
                address = " প্রার্থীর ঠিকানা: সুলতানপুর, সদর";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: বখতিয়ার আহমেদ খান";
                fatherName = " প্রার্থীর পিতার নাম: আলী  এমদাদ  খান";
                address = " প্রার্থীর ঠিকানা: পৈরতলা দক্ষিণ, সদর";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: এ.এন.এম তাজুল ইসলাম ভূইয়া";
                fatherName = " প্রার্থীর পিতার নাম: সোনা  মিয়া ভূইয়া";
                address = " প্রার্থীর ঠিকানা: বাসুদেব, সদর";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সাংস্কৃতিক)";
                name = " প্রার্থীর নাম: হরিপদ বনিক";
                fatherName = " প্রার্থীর পিতার নাম: উপেন্দ্র চন্দ্র বণিক";
                address = " প্রার্থীর ঠিকানা: পৈরতলা দক্ষিণ, ৬ নং ওয়ার্ড, সদর,";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: খন্দকার মতিউর রহমান";
                fatherName = " প্রার্থীর পিতার নাম: হাজী  তৈয়ব আলী খন্দকার";
                address = " প্রার্থীর ঠিকানা: কাছাইট, মাছিহাতা, সদর";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রান ও সমাজ কল্যান)";
                name = " প্রার্থীর নাম: প্রদীপ কুমার চক্রবর্তী";
                fatherName = " প্রার্থীর পিতার নাম: শ্রী যামিনী মোহন চক্রবর্তী";
                address = " প্রার্থীর ঠিকানা: কাজীপাড়া,  ৮ নং ওয়ার্ড, সদর";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: আঃ  কাদির";
                fatherName = " প্রার্থীর পিতার নাম: অছর উদ্দিন";
                address = " প্রার্থীর ঠিকানা: তেলিনগর, অষ্টগ্রাম, সদর";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: সি এফ এন সাইফুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: এ মন্নান";
                address = " প্রার্থীর ঠিকানা: ভাদুঘর, ১২ নং ওয়ার্ড, সদর";
            }

            SadarIDRegister sadarIDRegister = new SadarIDRegister(id, designation, name, fatherName, address);
            listOfSadarCommand.add(sadarIDRegister);
        }

        SadarAdapter sadarAdapter = new SadarAdapter(listOfSadarCommand, getActivity());
        listView.setAdapter(sadarAdapter);


        return rootView;
    }

}
