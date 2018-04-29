package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.NasirnagarCommand;


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
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SarailCommand.SarailCommandAdapter;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SarailCommand.SarailCommandIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NasinagarCommandMain extends Fragment {

    ListView listView;
    ArrayList<NasirnagarCommandIDRegister> listOfNasirnagarCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public NasinagarCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_nasinagar_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.nasirnagarCommandListView);
        listOfNasirnagarCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.nasirnagarCommandLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<11; i++){
            int id = i + 1;
            String designation = "";
            String name = "";
            String fatherName = "";
            String address = "";

            if (i == 1){
                id = i + 1;
                designation = " পদবী: ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: সুনীল কুমার দত্ত";
                fatherName = " প্রার্থীর পিতার নাম: সুদিন দত্ত";
                address = " প্রার্থীর ঠিকানা: নাসিরনগর";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: মোঃ সোহরাব মোল্লা";
                fatherName = " প্রার্থীর পিতার নাম: বজলুর রহমান মোল্লা";
                address = " প্রার্থীর ঠিকানা: কুলিকুন্ডা, নাসিরনগর";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: শ্রী দীনেশ চন্দ্র দাস";
                fatherName = " প্রার্থীর পিতার নাম: শ্রী যোগেশ চন্দ্র দাস";
                address = " প্রার্থীর ঠিকানা: ভলাকুট, নাসিরনগর";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: স্বপন কুমার রায়";
                fatherName = " প্রার্থীর পিতার নাম: শ্যামেন্দ্র মোহন রায়";
                address = " প্রার্থীর ঠিকানা: ফান্দাউক, নাসিরনগর";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: মোঃ সাহাব উদ্দিন";
                fatherName = " প্রার্থীর পিতার নাম: হাফিজ উদ্দিন";
                address = " প্রার্থীর ঠিকানা: ফুলপুর, নুরপুর, নাসিরনগর";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: মোঃ আবু জাহের";
                fatherName = " প্রার্থীর পিতার নাম: মানিক মিয়া";
                address = " প্রার্থীর ঠিকানা: পূর্বভাগ, নাসিরনগর";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সাংস্কৃতিক)";
                name = " প্রার্থীর নাম: মোঃ দীন ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: হাজী আঃ মজিদ মিয়া";
                address = " প্রার্থীর ঠিকানা: পতইর, চাতলপাড়, নাসিরনগর";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: কালন চৌধুরী";
                fatherName = " প্রার্থীর পিতার নাম: মিয়া চান চৌধুরী";
                address = " প্রার্থীর ঠিকানা: ফুলপুর, নুরপুর, নাসিরনগর";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রান ও সমাজ কল্যান)";
                name = " প্রার্থীর নাম: শেখ আবদুল্লাহ";
                fatherName = " প্রার্থীর পিতার নাম: হাজী শেখ আবুল খায়ের";
                address = " প্রার্থীর ঠিকানা: নাসিরনগর ";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মোঃ সহিদ মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: কালা মিয়া";
                address = " প্রার্থীর ঠিকানা: চঠিপাড়া, নুরপুর, নাসিরনগর";
            }


            NasirnagarCommandIDRegister nasirnagarCommandIDRegister = new NasirnagarCommandIDRegister(id, designation, name, fatherName, address);
            listOfNasirnagarCommand.add(nasirnagarCommandIDRegister);
        }

        NasirnagarCommandAdapter nasirnagarCommandAdapter = new NasirnagarCommandAdapter(listOfNasirnagarCommand, getActivity());
        listView.setAdapter(nasirnagarCommandAdapter);

        return rootView;
    }

}
