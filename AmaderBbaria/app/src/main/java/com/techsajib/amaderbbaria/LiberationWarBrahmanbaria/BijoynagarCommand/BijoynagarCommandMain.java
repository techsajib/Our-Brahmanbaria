package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.BijoynagarCommand;


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
public class BijoynagarCommandMain extends Fragment {

    ListView listView;
    ArrayList<BijoynagarCommandIDRegister> listOfBijoynagarCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public BijoynagarCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_bijoynagar_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.bijoynagarCommandListView);
        listOfBijoynagarCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.bijoynagarCommandLiniearLayout);
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
                name = " প্রার্থীর নাম: মোঃ তারা মিয়া ইপিআর";
                fatherName = " প্রার্থীর পিতার নাম: তৈয়ব আলী";
                address = " প্রার্থীর ঠিকানা: মিরাশানী, সিংগারবিল, বিজয়নগর";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: কোরবান আলী";
                fatherName = " প্রার্থীর পিতার নাম: হাজী নজম উদ্দিন";
                address = " প্রার্থীর ঠিকানা: নিদারাবাদ, হরষপুর, বিজয়নগর";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: খন্দকার রশিদ আহাম্মদ";
                fatherName = " প্রার্থীর পিতার নাম: মিন্নত আলী";
                address = " প্রার্থীর ঠিকানা: লক্ষীপুর, হরষপুর, বিজয়নগর";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: মুসা মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আঃ গফুর";
                address = " প্রার্থীর ঠিকানা: সাতগাঁও, চান্দুরা, বিজয়নগর";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: মোঃ সুলতান আহম্মদ";
                fatherName = " প্রার্থীর পিতার নাম: আঃ গফুর";
                address = " প্রার্থীর ঠিকানা: দাউদপুর, ইছাপুরা, বিজয়নগর";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: এম এ রহিম";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ ফুল মিঞা";
                address = " প্রার্থীর ঠিকানা: বিষ্ণপুর, বিজয়নগর";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সাংস্কৃতিক)";
                name = " প্রার্থীর নাম: মোহাম্মদ আঃ বাসির ভূইয়া";
                fatherName = " প্রার্থীর পিতার নাম: আঃ মালিক ভূইয়া";
                address = " প্রার্থীর ঠিকানা: মুকুন্দপুর, পাহাড়পুর, বিজয়নগর";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: মোঃ আব্দুল বারী";
                fatherName = " প্রার্থীর পিতার নাম: মালিম উদ্দিন";
                address = " প্রার্থীর ঠিকানা: সিংগারবিল, বিজয়নগর";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রাণ ও সমাজ কল্যাণ)";
                name = " প্রার্থীর নাম: মোঃ ফিরোজ মিঞা";
                fatherName = " প্রার্থীর পিতার নাম: মুহাম্মদ আহাম্মদ আলী";
                address = " প্রার্থীর ঠিকানা: মুকুন্দপুর, পাহাড়পুর, বিজয়নগর";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মোঃ হামদু চৌধুরী";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ হাফিজ মাস্টার চৌধুরী";
                address = " প্রার্থীর ঠিকানা: নুরপুর, চম্পকনগর,বিজয়নগর";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: তাহের মিঞা";
                fatherName = " প্রার্থীর পিতার নাম: ছিদ্দিক মিঞা";
                address = " প্রার্থীর ঠিকানা: আদমপুর, পত্তন, বিজয়নগর";
            }

            BijoynagarCommandIDRegister bijoynagarCommandIDRegister = new BijoynagarCommandIDRegister(id, designation, name, fatherName, address);
            listOfBijoynagarCommand.add(bijoynagarCommandIDRegister);
        }

            BijoynagarCommandAdapter bijoynagarCommandAdapter = new BijoynagarCommandAdapter(listOfBijoynagarCommand, getActivity());
            listView.setAdapter(bijoynagarCommandAdapter);
        return rootView;
    }

}
