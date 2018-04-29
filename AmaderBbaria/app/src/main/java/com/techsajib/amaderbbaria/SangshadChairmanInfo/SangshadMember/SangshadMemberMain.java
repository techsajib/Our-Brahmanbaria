package com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember;


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
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SangshadMemberMain extends Fragment {

    ListView listView;
    ArrayList<SangshadIDRegister> listOfParlamentMember;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;


    public SangshadMemberMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.sangshad_member_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.sangshadListView);
        listOfParlamentMember = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.sangshadLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<7; i++) {
            int id = i + 1;
            int logo = R.drawable.ic_menu_gallery;
            String name = "";
            String designation = "";
            String seatNumber = "";
            String electionPlaced = "";
            String electionParty = "";

            if (i == 1){
                 id = i + 1;
                 logo = R.drawable.mp1;
                 name = "নাম: বি এম ফরহাদ হোসেন সংগ্রাম";
                 designation = "পদবী: সংসদ সদস্য";
                 seatNumber = "আসন নাম্বার: ২৪৩";
                 electionPlaced = "নির্বাচনী এলাকা: ব্রাহ্মণবাড়িয়া-১(নাসিরনগর উপজেলা)";
                 electionParty = "রাজনৈতিক দল: বাংলাদেশ আওয়ামী লীগ";
            }else if (i == 2){
                id = i + 1;
                logo = R.drawable.mp2;
                name = "নাম: মোঃ জিয়াউল হক মৃধা";
                designation = "পদবী: সংসদ সদস্য";
                seatNumber = "আসন নাম্বার: ২৪৪";
                electionPlaced = "নির্বাচনী এলাকা: ব্রাহ্মণবাড়িয়া-২(আশুগঞ্জ উপজেলা ও সরাইল উপজেলা)";
                electionParty = "রাজনৈতিক দল: জাতীয় পার্টি";
            }else if (i == 3){
                id = i + 1;
                logo = R.drawable.mp3;
                name = "নাম: র,আ,ম উবায়দুল মোকতাদির চৌধুরী";
                designation = "পদবী: সংসদ সদস্য";
                seatNumber = "আসন নাম্বার: ২৪৫";
                electionPlaced = "নির্বাচনী এলাকা: ব্রাহ্মণবাড়িয়া-৩(সদর উপজেলা ও বিজয়নগর উপজেলা)";
                electionParty = "রাজনৈতিক দল: বাংলাদেশ আওয়ামী লীগ";
            }else if (i == 4){
                id = i + 1;
                logo = R.drawable.mp4;
                name = "নাম: আনিসুল হক";
                designation = "পদবী: মন্ত্রী, আইন, বিচার ও সংসদ বিষয়ক মন্ত্রণালয়";
                seatNumber = "আসন নাম্বার: ২৪৬";
                electionPlaced = "নির্বাচনী এলাকা: ব্রাহ্মণবাড়িয়া-৪(আখাউড়া উপজেলা ও কসবা উপজেলা)";
                electionParty = "রাজনৈতিক দল: বাংলাদেশ আওয়ামী লীগ";
            }else if (i == 5){
                id = i + 1;
                logo = R.drawable.mp5;
                name = "নাম: ফয়জুর রহমান";
                designation = "পদবী: সংসদ সদস্য";
                seatNumber = "আসন নাম্বার: ২৪৭";
                electionPlaced = "নির্বাচনী এলাকা: ব্রাহ্মণবাড়িয়া-৫(নবীনগর উপজেলা)";
                electionParty = "রাজনৈতিক দল: বাংলাদেশ আওয়ামী লীগ";
            }else if (i == 6){
                id = i + 1;
                logo = R.drawable.mp6;
                name = "নাম: এ বি তাজুল ইসলাম";
                designation = "পদবী: সংসদ সদস্য";
                seatNumber = "আসন নাম্বার: ২৪৮";
                electionPlaced = "নির্বাচনী এলাকা: ব্রাহ্মণবাড়িয়া-৬(বাঞ্ছারামপুর ও নবীনগর উপজেলার অংশবিশেষ)";
                electionParty = "রাজনৈতিক দল: বাংলাদেশ আওয়ামী লীগ";
            }

            SangshadIDRegister sangshadIDRegister = new SangshadIDRegister(id, logo, name, designation, seatNumber, electionPlaced, electionParty);
            listOfParlamentMember.add(sangshadIDRegister);
        }

        SangshadAdapter sangshadAdapter = new SangshadAdapter(listOfParlamentMember, getActivity());
        listView.setAdapter(sangshadAdapter);
        return rootView;
    }

}
