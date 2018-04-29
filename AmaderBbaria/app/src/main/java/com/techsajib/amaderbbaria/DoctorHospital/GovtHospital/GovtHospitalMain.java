package com.techsajib.amaderbbaria.DoctorHospital.GovtHospital;


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
import com.techsajib.amaderbbaria.EducationInstituteList.AliaMadrasa.AliaMadrasaIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GovtHospitalMain extends Fragment {

    ListView listView;
    ArrayList<GovtHospitalIDRegister> listOfGovtHospital;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public GovtHospitalMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hos_govt_hospital_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.govtHospitalListView);
        listOfGovtHospital = new ArrayList<GovtHospitalIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.govtHospitalLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<9; i++) {
            int id = i + 1;
            int logo = R.drawable.book;
            String hospital = "";
            String seat = "";
            String doctor = "";
            String location = "";

            if (i == 1){
                 id = i + 1;
                 logo = R.drawable.hospitalmain;
                 hospital = " ব্রাহ্মণবাড়িয়া সদর হাসপাতাল";
                 seat = " ২৫০ শয্যা বিশিষ্ট।";
                 doctor = " প্রায় ৩৩ জন ডাক্তার কর্মরত আছেন।";
                 location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = " সরাইল উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ০৫ জন ডাক্তার কর্মরত আছেন।";
                location = " সরাইল, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = " নাছিরনগর উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ১১ জন ডাক্তার কর্মরত আছেন।";
                location = " নাছিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = " আশুগঞ্জ উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ০৪ জন ডাক্তার কর্মরত আছেন।";
                location = " আশুগঞ্জ , ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = " নবীনগর  উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ০৪ জন ডাক্তার কর্মরত আছেন।";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = " বাঞ্ছারামপুর  উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ১৩ জন ডাক্তার কর্মরত আছেন।";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 7){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = " কসবা  উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ০৫ জন ডাক্তার কর্মরত আছেন।";
                location = " কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 8){
                id = i + 1;
                logo = R.drawable.hospitalmain;
                hospital = "আখাউড়া উপজেলা স্বাস্থ্য কমপ্লেক্স";
                seat = " ৫০ শয্যা বিশিষ্ট।";
                doctor = " প্রায় ০৩ জন ডাক্তার কর্মরত আছেন।";
                location = " আখাউড়া, ব্রাহ্মণবাড়িয়া।";
            }

            GovtHospitalIDRegister govtHospitalIDRegister = new GovtHospitalIDRegister(id, logo, hospital, seat, doctor, location);
            listOfGovtHospital.add(govtHospitalIDRegister);
        }
            GovtHospitalAdapter govtHospitalAdapter = new GovtHospitalAdapter(listOfGovtHospital, getActivity());
            listView.setAdapter(govtHospitalAdapter);

        return rootView;
    }

}
