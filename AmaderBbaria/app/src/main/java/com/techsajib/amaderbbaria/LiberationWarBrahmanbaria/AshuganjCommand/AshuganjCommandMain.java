package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AshuganjCommand;


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
public class AshuganjCommandMain extends Fragment {

    ListView listView;
    ArrayList<AshuganjCommandIDRegister> listOfAshuganjCommand;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public AshuganjCommandMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_ashuganj_command_main, container, false);

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


        listView = (ListView) rootView.findViewById(R.id.ashuganjCommandListView);
        listOfAshuganjCommand = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.ashuganjCommandLiniearLayout);
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
                name = " প্রার্থীর নাম: মো: ইকবাল হোসাইন";
                fatherName = " প্রার্থীর পিতার নাম: মো : আলী";
                address = " প্রার্থীর ঠিকানা: চরচারতলা, আশুগঞ্জ";
            }else if (i == 2){
                id = i + 1;
                designation = " পদবী: ডেপুটি কমান্ডার";
                name = " প্রার্থীর নাম: আবুল হাসেম আজাদ";
                fatherName = " প্রার্থীর পিতার নাম: বন্দে আলী মিয়া";
                address = " প্রার্থীর ঠিকানা: সোনারামপুর, আশুগঞ্জ";
            }else if (i == 3){
                id = i + 1;
                designation = " পদবী: সহকারী ইউনিট কমান্ডার (সাংগঠনিক)";
                name = " প্রার্থীর নাম: মো: শেখ আজিজুর রহমান";
                fatherName = " প্রার্থীর পিতার নাম: শেখ আ: লতিফ";
                address = " প্রার্থীর ঠিকানা: আড়াইসিধা, আশুগঞ্জ";
            }else if (i == 4){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (পুনর্বাসন, ও যুদ্ধাহত)";
                name = " প্রার্থীর নাম: নূর আহাম্মদ";
                fatherName = " প্রার্থীর পিতার নাম: আলী আহাম্মদ";
                address = " প্রার্থীর ঠিকানা: মধুপুর, আড়াইসিধা, আশুগঞ্জ";
            }else if (i == 5){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (তথ্য ও প্রচার)";
                name = " প্রার্থীর নাম: একে এম ছাদির";
                fatherName = " প্রার্থীর পিতার নাম: মোছলেম উদ্দিন";
                address = " প্রার্থীর ঠিকানা: খোলাপাড়া, তারম্নয়া, আশুগঞ্জ";
            }else if (i == 6){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (অর্থ)";
                name = " প্রার্থীর নাম: মো: আলমগীর";
                fatherName = " প্রার্থীর পিতার নাম: আ: বারিক মাস্টার";
                address = " প্রার্থীর ঠিকানা: সোহাগপুর, আশুগঞ্জ";
            }else if (i == 7){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ক্রীড়া ও সাংস্কৃতিক)";
                name = " প্রার্থীর নাম: মো: শাহজাহান";
                fatherName = " প্রার্থীর পিতার নাম: হাজী কিতাব আলী";
                address = " প্রার্থীর ঠিকানা: বড়তলস্না, আশুগঞ্জ";
            }else if (i == 8){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (দপ্তর ও পাঠাগার)";
                name = " প্রার্থীর নাম: মো : সাহাদাত হোসেন";
                fatherName = " প্রার্থীর পিতার নাম: মো: মতিউর রহমান";
                address = " প্রার্থীর ঠিকানা: বগইর, আশুগঞ্জ";
            }else if (i == 9){
                id = i + 1;
                designation = " পদবী: সহকারী কমান্ডার (ত্রান ও সমাজ কল্যান)";
                name = " প্রার্থীর নাম: আবুল কাশেম";
                fatherName = " প্রার্থীর পিতার নাম: মো: আসিদ মুন্সী";
                address = " প্রার্থীর ঠিকানা: যাত্রাপুর, আশুগঞ্জ";
            }else if (i == 10){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মো: গিয়াস উদ্দিন";
                fatherName = " প্রার্থীর পিতার নাম: মো: ইউনুছ মিয়া";
                address = " প্রার্থীর ঠিকানা: চরচারতলা, আশুগঞ্জ";
            }else if (i == 11){
                id = i + 1;
                designation = " পদবী: কার্যকরী সদস্য";
                name = " প্রার্থীর নাম: মো : তাজুল ইসলাম";
                fatherName = " প্রার্থীর পিতার নাম: হাজী আলফত আলী";
                address = " প্রার্থীর ঠিকানা: তারম্নয়া, আশুগঞ্জ";
            }



            AshuganjCommandIDRegister ashuganjCommandIDRegister = new AshuganjCommandIDRegister(id, designation, name, fatherName, address);
            listOfAshuganjCommand.add(ashuganjCommandIDRegister);
        }

        AshuganjCommandAdapter ashuganjCommandAdapter = new AshuganjCommandAdapter(listOfAshuganjCommand, getActivity());
        listView.setAdapter(ashuganjCommandAdapter);

        return rootView;
    }

}
