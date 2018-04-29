package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.NabinagarCommand;


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
public class NabinagarCommandMain extends Fragment {

    ListView listView;
    ArrayList<NabinagarCommandIDRegister> listOfNabinagarCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;


    public NabinagarCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_nabinagar_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.nabinagarCommandListView);
        listOfNabinagarCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.nabinagarCommandLiniearLayout);
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
                name = " প্রার্থীর নাম: মো: আমদাদুল হক";
                fatherName = " প্রার্থীর পিতার নাম: আবুল হাসেম";
                address = " প্রার্থীর ঠিকানা: বিটঘর, নবীনগর";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: হাবিলদার শামসুল আলম";
                fatherName = " প্রার্থীর পিতার নাম: আ: লতিফ";
                address = " প্রার্থীর ঠিকানা: ইব্রাহিমপুর, নবীনগর";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: হাজী মো: রজ্জব আলী";
                fatherName = " প্রার্থীর পিতার নাম: আ: ছালাম মোল্লা";
                address = " প্রার্থীর ঠিকানা: গোসাইপুর, জালশুকা, নবীনগর";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: আ: সালাম";
                fatherName = " প্রার্থীর পিতার নাম: আ: হামিদ";
                address = " প্রার্থীর ঠিকানা: রছুল্লাবাদ, নবীনগর";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রাণ ও সমাজ কল্যাণ)";
                name = " প্রার্থীর নাম: গোলাম মোস্তফা";
                fatherName = " প্রার্থীর পিতার নাম: হাজী আ: লতিফ";
                address = " প্রার্থীর ঠিকানা: থোল্লা কান্দি, বড়িকান্দি, নবীনগর";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: আ: রাজ্জাক";
                fatherName = " প্রার্থীর পিতার নাম: আ: হক";
                address = " প্রার্থীর ঠিকানা: বিদ্যাকুট, নবীনগর";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সংস্কৃতি)";
                name = " প্রার্থীর নাম: আব্দুল মোতালিব";
                fatherName = " প্রার্থীর পিতার নাম: আব্দুল মোতালিব";
                address = " প্রার্থীর ঠিকানা: মাঝিকারা, নবীনগর";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার(অর্থ)";
                name = " প্রার্থীর নাম: মো: আমির আলী মোল্লা";
                fatherName = " প্রার্থীর পিতার নাম: আব্দুল বারী মোল্লা";
                address = " প্রার্থীর ঠিকানা: দক্ষিণ লক্ষীপুর, কৃষ্ণনগর, নবীনগর";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: আজহারুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: মো: কালু মিয়া";
                address = " প্রার্থীর ঠিকানা: নবীনগর";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকারী সদস্য";
                name = " প্রার্থীর নাম: মো: আ: কাশেম";
                fatherName = " প্রার্থীর পিতার নাম: মো: আবু ছিদ্দিক";
                address = " প্রার্থীর ঠিকানা: গোপালপুর, নবীনগর";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকারী সদস্য";
                name = " প্রার্থীর নাম: মো: সিদ্দিকুর রহমান";
                fatherName = " প্রার্থীর পিতার নাম: আ: সোবহান";
                address = " প্রার্থীর ঠিকানা: আলীয়াবাদ, নবীনগর";
            }

            NabinagarCommandIDRegister nabinagarCommandIDRegister = new NabinagarCommandIDRegister(id, designation, name, fatherName, address);
            listOfNabinagarCommand.add(nabinagarCommandIDRegister);
        }

        NabinagarCommandAdapter nabinagarCommandAdapter = new NabinagarCommandAdapter(listOfNabinagarCommand, getActivity());
        listView.setAdapter(nabinagarCommandAdapter);
        return rootView;
    }

}
