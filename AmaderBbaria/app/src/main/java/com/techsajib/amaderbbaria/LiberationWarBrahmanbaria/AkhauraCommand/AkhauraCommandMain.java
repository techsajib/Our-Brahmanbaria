package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand;


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
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AshuganjCommand.AshuganjCommandAdapter;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AshuganjCommand.AshuganjCommandIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AkhauraCommandMain extends Fragment {

    ListView listView;
    ArrayList<AkhauraCommandIDRegister> listOfAkhauraCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public AkhauraCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_akhaura_command_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.akhauraCommandListView);
        listOfAkhauraCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.akhauraCommandLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<= 11; i++){
            int id = i + 1;
            String designation = "";
            String name = "";
            String fatherName = "";
            String address = "";

            if (i == 1){
                id = i + 1;
                designation = " পদবী: ইউনিট কমান্ডার";
                name = " প্রার্থীর নাম: মোঃ আবু সাইয়িদ মিয়া";
                fatherName = " প্রার্থীর পিতার নাম: আঃ আজিজ";
                address = " প্রার্থীর ঠিকানা: আমোদাবাদ, আজমপুর, আখাউড়া";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: মোঃ মমিনুল হক মিন্টু";
                fatherName = " প্রার্থীর পিতার নাম: সফিউদ্দিন ভূইয়া";
                address = " প্রার্থীর ঠিকানা: মিনারকোট, কর্ণেল বাজার, আখাউড়া";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: মোঃ বাহার মিয়া মালদার";
                fatherName = " প্রার্থীর পিতার নাম: ফিরোজ মিয়া";
                address = " প্রার্থীর ঠিকানা: আখাউড়া";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: নায়েক অবঃ মোঃ দারুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: মাহতাব মুন্সী";
                address = " প্রার্থীর ঠিকানা: বচিয়ারা, গঙ্গাসাগর, আখাউড়া";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রাণ ও সমাজ কল্যাণ)";
                name = " প্রার্থীর নাম: মোঃ আব্দুল হান্নান";
                fatherName = " প্রার্থীর পিতার নাম: কফিল উদ্দিন";
                address = " প্রার্থীর ঠিকানা: টানমান্দাইল, গঙ্গাসাগর, আখাউড়া";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: মোঃ আব্দুল লতিফ ভূইয়া";
                fatherName = " প্রার্থীর পিতার নাম: আঃ রশিদ ভূইয়া";
                address = " প্রার্থীর ঠিকানা: বড় লৌহঘর, কর্ণেল বাজার, আখাউড়া";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সংস্কৃতি)";
                name = " প্রার্থীর নাম: মোঃ আব্দুল হান্নান";
                fatherName = " প্রার্থীর পিতার নাম: আব্দুস ছাত্তার";
                address = " প্রার্থীর ঠিকানা: চান্দপুর, ছতুরা শরীফ, আখাউড়া";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার(অর্থ)";
                name = " প্রার্থীর নাম: মোঃ নুরুল আলম বিলাল";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ রাজু মিয়া সরকার";
                address = " প্রার্থীর ঠিকানা: রাণীখার, ঘোলখার, আখাউড়া";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: মোঃ ফজলুর রহমান";
                fatherName = " প্রার্থীর পিতার নাম: আইদর আলী";
                address = " প্রার্থীর ঠিকানা: কুড়িপাইকা, হীরাপুর, আখাউড়া";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকারী সদস্য";
                name = " প্রার্থীর নাম: মীর মোশারফ ইউছুফ";
                fatherName = " প্রার্থীর পিতার নাম: মীর আঃ খালেক";
                address = " প্রার্থীর ঠিকানা: আখাউড়া";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকারী সদস্য";
                name = " প্রার্থীর নাম: মোঃ ইসমাইল ই পি আর";
                fatherName = " প্রার্থীর পিতার নাম: মোঃ ফুল মিয়া";
                address = " প্রার্থীর ঠিকানা: আখাউড়া";
            }

            AkhauraCommandIDRegister akhauraCommandIDRegister = new AkhauraCommandIDRegister(id, designation, name, fatherName, address);
            listOfAkhauraCommand.add(akhauraCommandIDRegister);

        }

        AkhauraCommandAdapter akhauraCommandAdapter  = new AkhauraCommandAdapter(listOfAkhauraCommand, getActivity());
        listView.setAdapter(akhauraCommandAdapter);

        return rootView;
    }

}
