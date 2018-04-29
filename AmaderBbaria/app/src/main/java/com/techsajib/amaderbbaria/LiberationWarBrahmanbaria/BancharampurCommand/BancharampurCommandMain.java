package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.BancharampurCommand;


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
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand.AkhauraCommandIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BancharampurCommandMain extends Fragment {

    ListView listView;
    ArrayList<BancharampurCommandIDRegister> listOfBancharampurCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public BancharampurCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_bancharampur_command_main, container, false);

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


        listView = (ListView) rootView.findViewById(R.id.bancharampurCommandListView);
        listOfBancharampurCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.bancharampurCommandLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<= 11; i++) {
            int id = i + 1;
            String designation = "";
            String name = "";
            String fatherName = "";
            String address = "";

            if (i == 1) {
                id = i + 1;
                designation = " পদবী: ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: এইচ এম আ: কাদির";
                fatherName = " প্রার্থীর পিতার নাম: হাজী আক্তারুজ্জামান";
                address = " প্রার্থীর ঠিকানা: আছাদনগর, বাঞ্ছারামপুর";
            }else  if (i == 2) {
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: মো: আ: লতিফ";
                fatherName = " প্রার্থীর পিতার নাম: আহাম্মদ আলী";
                address = " প্রার্থীর ঠিকানা: সোনারামপুর, বাঞ্ছারামপুর";
            }else  if (i == 3) {
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: মো: ছিদ্দিকুর রহমান";
                fatherName = " প্রার্থীর পিতার নাম: মো: মোক্তার খান";
                address = " প্রার্থীর ঠিকানা: শেখেরকান্দি, উজানচর, বাঞ্ছারামপুর";
            }else  if (i == 4) {
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: আবদুল খালেক";
                fatherName = " প্রার্থীর পিতার নাম: কালু নায়েব আলী";
                address = " প্রার্থীর ঠিকানা: বুধাইরকান্দি, উজানচর, বাঞ্ছারামপুর";
            }else  if (i == 5) {
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: ওয়াজেদ মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: কালু মিয়া";
                address = " প্রার্থীর ঠিকানা: ছলিমাবাদ, বাঞ্ছারামপুর";
            }else  if (i == 6) {
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: মো: নজরুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: গোফরান মিয়া";
                address = " প্রার্থীর ঠিকানা: কানাইনগর, ধরিয়ারচর, বাঞ্ছারামপুর";
            }else  if (i == 7) {
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সাংস্কৃতিক)";
                name = " প্রার্থীর নাম: মো: জাকারিয়া";
                fatherName = " প্রার্থীর পিতার নাম: হাজী আ: লতিফ";
                address = " প্রার্থীর ঠিকানা: ফরদাবাদ, বাঞ্ছারামপুর";
            }else  if (i == 8) {
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: মো: মরতুজ আলি মোল্লা";
                fatherName = " প্রার্থীর পিতার নাম: সুবেদ আলী মোল্লা";
                address = " প্রার্থীর ঠিকানা: বাঞ্ছারামপুর";
            }else  if (i == 9) {
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রাণ ও সমাজকল্যাণ)";
                name = " প্রার্থীর নাম: মো: ফিরোজ মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: মুন্সি নায়েব আলী";
                address = " প্রার্থীর ঠিকানা: রুপসদী, বাঞ্ছারামপুর";
            }else  if (i == 10) {
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: কাজী মোখলেছ উদ্দিন";
                fatherName = " প্রার্থীর পিতার নাম: কাজী মোজাফফর হোসেন";
                address = " প্রার্থীর ঠিকানা: আইয়ুবপুর, বাঞ্ছারামপুর";
            }else  if (i == 11) {
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: ফরিদ মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: পাঞ্জু খাঁ";
                address = " প্রার্থীর ঠিকানা: আকানগর, ছলিমাবাদ, বাঞ্ছারামপুর";
            }

            BancharampurCommandIDRegister bancharampurCommandIDRegister = new BancharampurCommandIDRegister(id, designation, name, fatherName, address);
            listOfBancharampurCommand.add(bancharampurCommandIDRegister);
        }

            BancharampurCommandAdapter bancharampurCommandAdapter = new BancharampurCommandAdapter(listOfBancharampurCommand, getActivity());
            listView.setAdapter(bancharampurCommandAdapter);
        return rootView;
    }

}
