package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SarailCommand;


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
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SadarCommand.SadarAdapter;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SadarCommand.SadarIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SarailCommandMain extends Fragment {

    ListView listView;
    ArrayList<SarailCommandIDRegister> listOfSarailCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public SarailCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_sarail_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.sarailCommandListView);
        listOfSarailCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.sarailCommandLiniearLayout);
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
                name = " প্রার্থীর নাম: মোঃ ইছমত আলী";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ সুন্দর আলী";
                address = " প্রার্থীর ঠিকানা: সৈয়দটুলা, সরাইল";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: এম এফ মোঃ আনোয়ার হোসেন";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ সিতাব আলী";
                address = " প্রার্থীর ঠিকানা: সরাইল";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: যতীন্দ্র মোহন চৌধুরী";
                fatherName = " প্রার্থীর পিতার নাম: মুরারী মোহন চৌধুরী";
                address = " প্রার্থীর ঠিকানা: শাহবাজপুর, সরাইল";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: আব্দুল আহাদ";
                fatherName = " প্রার্থীর পিতার নাম: তোয়াজ উদ্দিন";
                address = " প্রার্থীর ঠিকানা: দেওড়া, শাহজাদাপুর, সরাইল";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: ছিদ্দিক মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: ইমতিয়াজ আলী";
                address = " প্রার্থীর ঠিকানা: ধামাউড়া, অরুয়াইল, সরাইল";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: মোঃ সফর আলী";
                fatherName = " প্রার্থীর পিতার নাম: আব্দুল মজিদ";
                address = " প্রার্থীর ঠিকানা: বাড়িউড়া, মজলিশপুর, সরাইল";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সাংস্কৃতিক)";
                name = " প্রার্থীর নাম: মোঃ রফিজ উদ্দিন";
                fatherName = " প্রার্থীর পিতার নাম: রোকন উদ্দিন";
                address = " প্রার্থীর ঠিকানা: কুট্টাপাড়া, সরাইল";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: মোঃ জহুরুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ ইউসুফ";
                address = " প্রার্থীর ঠিকানা: বড়দেওয়ানপাড়া, সরাইল";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রান ও সমাজ কল্যান)";
                name = " প্রার্থীর নাম: মোঃ নোয়াব মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আছম আলী";
                address = " প্রার্থীর ঠিকানা: সৈয়দটুলা, সরাইল";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মোঃ আরব আলী";
                fatherName = " প্রার্থীর পিতার নাম: হাজী মন্নর আলী";
                address = " প্রার্থীর ঠিকানা: রসুলপুর, সরাইল";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: নান্নু মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: কাছম আলী";
                address = " প্রার্থীর ঠিকানা: চৌরাগোদা, নোয়াগাঁও, সরাইল";
            }

            SarailCommandIDRegister sarailCommandIDRegister = new SarailCommandIDRegister(id, designation, name, fatherName, address);
            listOfSarailCommand.add(sarailCommandIDRegister);
        }

        SarailCommandAdapter sarailCommandAdapter = new SarailCommandAdapter(listOfSarailCommand, getActivity());
        listView.setAdapter(sarailCommandAdapter);

        return rootView;
    }

}
