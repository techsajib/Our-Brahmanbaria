package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.KasbaCommand;


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
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand.AkhauraCommandAdapter;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand.AkhauraCommandIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KasbaCommandMain extends Fragment {

    ListView listView;
    ArrayList<KasbaCommandIDRegister> listOfKasbaCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;


    public KasbaCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_kasba_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.kasbaCommandListView);
        listOfKasbaCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.kasbaCommandLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<= 11; i++) {
            int id = i + 1;
            String designation = "";
            String name = "";
            String fatherName = "";
            String address = "";

            if (i == 1){
                id = i + 1;
                designation = " পদবী: ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: সহিদুল্লাহ";
                fatherName = " প্রার্থীর পিতার নাম: দাইমুদ্দীন";
                address = " প্রার্থীর ঠিকানা: মীরশাহপুর, কসবা";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: মোঃ আবু ছায়েদ";
                fatherName = " প্রার্থীর পিতার নাম: আঃ ওয়াহেদ";
                address = " প্রার্থীর ঠিকানা: গোপিনাথপুর, কসবা";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: সুবেঃ মোঃ ওয়ালেক মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আবুল হাসান ভূইয়া";
                address = " প্রার্থীর ঠিকানা: সৈয়দাবাদ, কসবা";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: মোসলেম উদ্দিন সরকার";
                fatherName = " প্রার্থীর পিতার নাম: জলফু মিয়া সরকার";
                address = " প্রার্থীর ঠিকানা: মইনপুর, কসবা";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রাণ ও সমাজ কল্যাণ)";
                name = " প্রার্থীর নাম: মোঃ আজিজুল হক";
                fatherName = " প্রার্থীর পিতার নাম: আঃ আহাদ মুন্সী";
                address = " প্রার্থীর ঠিকানা: রাইতলা, কসবা";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: গোলাম মোস্তফা খান (বীর বিক্রম)";
                fatherName = " প্রার্থীর পিতার নাম: পাঞ্জাতন আলী খান";
                address = " প্রার্থীর ঠিকানা: বিষ্ণুপুর, মাইজখার, কসবা";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সংস্কৃতি)";
                name = " প্রার্থীর নাম: মোঃ সোজাউদ্দিন ভূইয়া";
                fatherName = " প্রার্থীর পিতার নাম: হাজী আশরাফ উদ্দিন";
                address = " প্রার্থীর ঠিকানা: মান্দারপুর, জমশেরপুর, কসবা";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার(অর্থ)";
                name = " প্রার্থীর নাম: মোঃ নুরুল ইসলাম খান";
                fatherName = " প্রার্থীর পিতার নাম: আবদুর রশিদ খান";
                address = " প্রার্থীর ঠিকানা: দেলী, কসবা";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: সুঃ মোঃ শামছুল আলম";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ ফুল মিয়া";
                address = " প্রার্থীর ঠিকানা: কসবা";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকারী সদস্য";
                name = " প্রার্থীর নাম: মোঃ আলী আজগর";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ দুদু মিয়া";
                address = " প্রার্থীর ঠিকানা: নেয়ামতপুর, মূলগ্রাম, কসবা";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকারী সদস্য";
                name = " প্রার্থীর নাম: সেলিম আক্তার";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ আঃ গণি";
                address = " প্রার্থীর ঠিকানা: বামুটিয়া, খেওড়া, কসবা";
            }

            KasbaCommandIDRegister kasbaCommandIDRegister = new KasbaCommandIDRegister(id, designation, name, fatherName, address);
            listOfKasbaCommand.add(kasbaCommandIDRegister);



        }

        KasbaCommandAdapter kasbaCommandAdapter = new KasbaCommandAdapter(listOfKasbaCommand, getActivity());
        listView.setAdapter(kasbaCommandAdapter);


        return rootView;
    }

}
