package com.techsajib.amaderbbaria.EducationInstituteList;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.techsajib.amaderbbaria.EducationInstituteList.AliaMadrasa.AliaMadrasaMain;
import com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity.CollegeUniversityMain;
import com.techsajib.amaderbbaria.EducationInstituteList.EngineeringCollege.EngineeringCollegeMain;
import com.techsajib.amaderbbaria.EducationInstituteList.MedicalCollege.MedicalCollegeMain;
import com.techsajib.amaderbbaria.EducationInstituteList.QawmiMadrasa.QawmiMadrasaMain;
import com.techsajib.amaderbbaria.EducationInstituteList.SchoolInfo.SchoolInformationMain;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.DistrictDetails;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EducationInstituteMain extends Fragment implements View.OnClickListener{

    private CardView collegeCardView, medicalCardView, engineeringCardView, schoolCardView, qawmiMadrasaCardView, aliaMadrasaCardView;
    FragmentManager fragmentManager;
    private AdView adView;

    LinearLayout firstHome, secondHome, thirdHome;
    Animation uptodown1, downtoup1, uptodown2;

    public EducationInstituteMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.edu_education_institute_main, container, false);

        //Mobile Admob Ad
        MobileAds.initialize(getActivity(), "ca-app-pub-8230275109768142~9575231912");
        adView = (AdView) rootView.findViewById(R.id.instituteAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        collegeCardView = (CardView) rootView.findViewById(R.id.collegeUniversity_cardView);
        medicalCardView = (CardView) rootView.findViewById(R.id.medicalCollege_cardview);
        engineeringCardView = (CardView) rootView.findViewById(R.id.engineeringCollegeCardView);
        schoolCardView  = (CardView) rootView.findViewById(R.id.schoolCardView);
        qawmiMadrasaCardView  = (CardView) rootView.findViewById(R.id.qawmiMadrasaCardView);
        aliaMadrasaCardView  = (CardView) rootView.findViewById(R.id.aliaMadrasaCardView);


        //for Animation Sector here
        firstHome = (LinearLayout) rootView.findViewById(R.id.firstInstitute);
        secondHome = (LinearLayout) rootView.findViewById(R.id.secondInstitute);
        thirdHome = (LinearLayout) rootView.findViewById(R.id.thirdInstitute);

        uptodown1 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);
        downtoup1 = AnimationUtils.loadAnimation(getActivity(),R.anim.maindowntoup);
        uptodown2 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);

        firstHome.setAnimation(uptodown1);
        secondHome.setAnimation(downtoup1);
        thirdHome.setAnimation(uptodown2);

        //for clicking
        collegeCardView.setOnClickListener(this);
        medicalCardView.setOnClickListener(this);
        engineeringCardView.setOnClickListener(this);
        schoolCardView.setOnClickListener(this);
        qawmiMadrasaCardView.setOnClickListener(this);
        aliaMadrasaCardView.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.collegeUniversity_cardView : intent = new Intent(getActivity(), CollegeUniversityMain.class);
                CollegeUniversityMain collegeUniversityMain = new CollegeUniversityMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, collegeUniversityMain, collegeUniversityMain.getTag()).commit();
                break;

            case R.id.medicalCollege_cardview : intent = new Intent(getActivity(), MedicalCollegeMain.class);
                MedicalCollegeMain medicalCollegeMain = new MedicalCollegeMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, medicalCollegeMain, medicalCollegeMain.getTag()).commit();
                break;

            case R.id.engineeringCollegeCardView : intent = new Intent(getActivity(), EngineeringCollegeMain.class);
                EngineeringCollegeMain engineeringCollegeMain = new EngineeringCollegeMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, engineeringCollegeMain, engineeringCollegeMain.getTag()).commit();
                break;

            case R.id.schoolCardView : intent = new Intent(getActivity(), SchoolInformationMain.class);
                SchoolInformationMain schoolInformationMain = new SchoolInformationMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, schoolInformationMain, schoolInformationMain.getTag()).commit();
                break;

            case R.id.qawmiMadrasaCardView : intent = new Intent(getActivity(), QawmiMadrasaMain.class);
                QawmiMadrasaMain qawmiMadrasaMain = new QawmiMadrasaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, qawmiMadrasaMain, qawmiMadrasaMain.getTag()).commit();
                break;

            case R.id.aliaMadrasaCardView : intent = new Intent(getActivity(), AliaMadrasaMain.class);
                AliaMadrasaMain aliaMadrasaMain = new AliaMadrasaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, aliaMadrasaMain, aliaMadrasaMain.getTag()).commit();
                break;

        }

    }
}
