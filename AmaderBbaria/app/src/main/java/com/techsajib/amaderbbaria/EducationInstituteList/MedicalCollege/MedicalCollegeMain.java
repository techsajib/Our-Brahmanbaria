package com.techsajib.amaderbbaria.EducationInstituteList.MedicalCollege;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity.CollegeUniversityIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MedicalCollegeMain extends Fragment {

    ListView listView;
    ArrayList<MedicalCollegeIDRegister> listOfMedicalCollege;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public MedicalCollegeMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.edu_medical_college_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.medicalCollegeListView);
        listOfMedicalCollege = new ArrayList<>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.medicalCollegeLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<5; i++) {
            int id = i + 1;
            int logo = R.drawable.book;
            String college = "";
            String placed = "";
            String location = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.medicalicon;
                college = " ব্রাহ্মণবাড়িয়া মেডিকেল কলেজ";
                placed = " 01733-382317, 01733-382314";
                location = " ঘাটুরা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.medicalicon;
                college = " ইউনাইটেড কেয়ার ইন্সটিটিউট অব মেডিকেল টেকনোলজী";
                placed = " 01720-573646";
                location = " ঘাটুরা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.medicalicon;
                college = " ব্রাহ্মণবাড়িয়া হোমিওপ্যাথিক মেডিকেল কলেজ";
                placed = " ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.medicalicon;
                college = " গ্রীন হেলথ মালেক জোবেদা মেডিকেল কলেজ";
                placed = " ";
                location = " গোপীনাথপুর, কসবা।";
            }

            MedicalCollegeIDRegister medicalCollegeIDRegister = new MedicalCollegeIDRegister(id, logo, college, placed, location);
            listOfMedicalCollege.add(medicalCollegeIDRegister);
        }

            MedicalCollegeAdapter medicalCollegeAdapter = new MedicalCollegeAdapter(listOfMedicalCollege, getActivity());
            listView.setAdapter(medicalCollegeAdapter);

            return rootView;
    }

}
