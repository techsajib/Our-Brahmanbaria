package com.techsajib.amaderbbaria.HomeProfile;


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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.techsajib.amaderbbaria.CommunicationSystem.CommunicationSystemMain;
import com.techsajib.amaderbbaria.DoctorHospital.DoctorHospitalMain;
import com.techsajib.amaderbbaria.EducationInstituteList.EducationInstituteMain;
import com.techsajib.amaderbbaria.FamousPeople.FamousPeopleMain;
import com.techsajib.amaderbbaria.FireService.FireServiceMain;
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.DistrictDetails;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.LiberationBrahmanbariaMain;
import com.techsajib.amaderbbaria.OfficeBankList.OfficeBankMain;
import com.techsajib.amaderbbaria.OnlineNews.BrahmanbariaNewsMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceStationMain;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadChairmanMain;
import com.techsajib.amaderbbaria.SocialOrganization.SocialOrganizationMain;
import com.techsajib.amaderbbaria.UpozilaUnion.UpozilaUnionMain;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements View.OnClickListener{

    FragmentManager fragmentManager;
    private InterstitialAd iinterstitialAd;

    LinearLayout firstHome, secondHome, thirdHome, forthHome, fithHome, sixthHome;
    Animation uptodown1, downtoup1, uptodown2, downtoup2, uptodown3, downtoup3;


     private CardView news, zelaCardView, upozilaCardView, sangshadCardView, warBrahmanbariaCardView, famousPeopleCardView, educationInstituteCardView, hospitalCardView, communicationCardView, thanaPoliceCardView, fireServiceCardView, officeBankCardView, socialOrganizationCardView;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.home_layout, container, false);


        //for Animation Sector here
        firstHome = (LinearLayout) rootView.findViewById(R.id.firstHome);
        secondHome = (LinearLayout) rootView.findViewById(R.id.secondHome);

        thirdHome = (LinearLayout) rootView.findViewById(R.id.thirdHome);
        forthHome = (LinearLayout) rootView.findViewById(R.id.forthHome);

        fithHome = (LinearLayout) rootView.findViewById(R.id.fithHome);
        sixthHome = (LinearLayout) rootView.findViewById(R.id.sixthHome);

        uptodown1 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);
        downtoup1 = AnimationUtils.loadAnimation(getActivity(),R.anim.maindowntoup);

        uptodown2 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);
        downtoup2 = AnimationUtils.loadAnimation(getActivity(),R.anim.maindowntoup);

        uptodown3 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);
        downtoup3 = AnimationUtils.loadAnimation(getActivity(),R.anim.maindowntoup);

        firstHome.setAnimation(uptodown1);
        secondHome.setAnimation(downtoup1);

        thirdHome.setAnimation(uptodown2);
        forthHome.setAnimation(downtoup2);

        fithHome.setAnimation(uptodown3);
        sixthHome.setAnimation(downtoup3);




        zelaCardView = (CardView) rootView.findViewById(R.id.zela_cardview);
        upozilaCardView = (CardView) rootView.findViewById(R.id.upozila_cardview);
        sangshadCardView = (CardView) rootView.findViewById(R.id.sangshadChairman);
        warBrahmanbariaCardView = (CardView) rootView.findViewById(R.id.liberationWarBrahmanbaria);
        famousPeopleCardView = (CardView) rootView.findViewById(R.id.famouspeople_cardview);
        educationInstituteCardView = (CardView) rootView.findViewById(R.id.educationInstitute_cardView);
        hospitalCardView = (CardView) rootView.findViewById(R.id.hospitalCardView);
        communicationCardView = (CardView) rootView.findViewById(R.id.communicationCardView);
        thanaPoliceCardView = (CardView) rootView.findViewById(R.id.thanaPoliceCardView);
        fireServiceCardView = (CardView) rootView.findViewById(R.id.fireServiceCardView);
        officeBankCardView = (CardView) rootView.findViewById(R.id.officeBankCardView);
        socialOrganizationCardView = (CardView) rootView.findViewById(R.id.socialOrganizationCardView);
        news = (CardView) rootView.findViewById(R.id.news);


        zelaCardView.setOnClickListener(this);
        upozilaCardView.setOnClickListener(this);
        sangshadCardView.setOnClickListener(this);
        warBrahmanbariaCardView.setOnClickListener(this);
        famousPeopleCardView.setOnClickListener(this);
        educationInstituteCardView.setOnClickListener(this);
        hospitalCardView.setOnClickListener(this);
        communicationCardView.setOnClickListener(this);
        thanaPoliceCardView.setOnClickListener(this);
        fireServiceCardView.setOnClickListener(this);
        officeBankCardView.setOnClickListener(this);
        socialOrganizationCardView.setOnClickListener(this);
        news.setOnClickListener(this);

        return rootView;
    }



    @Override
    public void onClick(View v) {
        Intent intent;


        switch (v.getId()){
            case R.id.zela_cardview : intent = new Intent(getActivity(), DistrictDetails.class);
                DistrictDetails districtDetails = new DistrictDetails();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, districtDetails, districtDetails.getTag()).commit();
                break;

            case R.id.upozila_cardview : intent = new Intent(getActivity(), UpozilaUnionMain.class);
                UpozilaUnionMain upozilaUnionMain = new UpozilaUnionMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, upozilaUnionMain, upozilaUnionMain.getTag()).commit();
                break;


            case R.id.sangshadChairman : intent = new Intent(getActivity(), SangshadChairmanMain.class);
                SangshadChairmanMain sangshadChairmanMain = new SangshadChairmanMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sangshadChairmanMain, sangshadChairmanMain.getTag()).commit();
                break;

            case R.id.liberationWarBrahmanbaria : intent = new Intent(getActivity(), LiberationBrahmanbariaMain.class);
                LiberationBrahmanbariaMain liberationBrahmanbariaMain = new LiberationBrahmanbariaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, liberationBrahmanbariaMain, liberationBrahmanbariaMain.getTag()).commit();
                break;

            case R.id.famouspeople_cardview : intent = new Intent(getActivity(), FamousPeopleMain.class);
                FamousPeopleMain famousPeopleMain = new FamousPeopleMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, famousPeopleMain, famousPeopleMain.getTag()).commit();
                break;

            case R.id.educationInstitute_cardView : intent = new Intent(getActivity(), EducationInstituteMain.class);
                EducationInstituteMain educationInstituteMain = new EducationInstituteMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, educationInstituteMain, educationInstituteMain.getTag()).commit();
                break;

            case R.id.hospitalCardView : intent = new Intent(getActivity(), DoctorHospitalMain.class);
                DoctorHospitalMain doctorHospitalMain = new DoctorHospitalMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, doctorHospitalMain, doctorHospitalMain.getTag()).commit();
                break;

            case R.id.communicationCardView : intent = new Intent(getActivity(), CommunicationSystemMain.class);
                CommunicationSystemMain communicationSystemMain = new CommunicationSystemMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, communicationSystemMain, communicationSystemMain.getTag()).commit();
                break;

            case R.id.thanaPoliceCardView : intent = new Intent(getActivity(), PoliceStationMain.class);
                PoliceStationMain policeStationMain = new PoliceStationMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, policeStationMain, policeStationMain.getTag()).commit();
                break;

            case R.id.fireServiceCardView : intent = new Intent(getActivity(), FireServiceMain.class);
                FireServiceMain fireServiceMain = new FireServiceMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, fireServiceMain, fireServiceMain.getTag()).commit();
                break;

            case R.id.officeBankCardView : intent = new Intent(getActivity(), OfficeBankMain.class);
                OfficeBankMain officeBankMain = new OfficeBankMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, officeBankMain, officeBankMain.getTag()).commit();
                break;

            case R.id.socialOrganizationCardView : intent = new Intent(getActivity(), SocialOrganizationMain.class);
                SocialOrganizationMain socialOrganizationMain = new SocialOrganizationMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, socialOrganizationMain, socialOrganizationMain.getTag()).commit();
                break;

            case R.id.news : intent = new Intent(getActivity(), BrahmanbariaNewsMain.class);
                BrahmanbariaNewsMain brahmanbariaNewsMain = new BrahmanbariaNewsMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, brahmanbariaNewsMain, brahmanbariaNewsMain.getTag()).commit();
                break;

        }
    }
}
