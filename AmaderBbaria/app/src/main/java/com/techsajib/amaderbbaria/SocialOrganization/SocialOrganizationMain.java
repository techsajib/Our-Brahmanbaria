package com.techsajib.amaderbbaria.SocialOrganization;


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

import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.ShahjahanSiddiki;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.DistrictDetails;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.BloodForBrahmanbaria;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.CleanBrahmanbaria;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.KhataKolomFoundation;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.KisorBondoFoundation;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.NCTFBrahmanbaria;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.ObiramFoundation;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.QawmiBloodBank;
import com.techsajib.amaderbbaria.SocialOrganization.Organization.ShotoKuriFoundation;

/**
 * A simple {@link Fragment} subclass.
 */
public class SocialOrganizationMain extends Fragment implements View.OnClickListener{

    private CardView khataKolomCardView, QawmiBloodBankCardView, kisorBondoFoundationCardView, cleanBrahmanbariaCardView, obiramFoundationCardView, nctfBrahmanbariaCardView, bloodForBrahmanbariaCardView, shotoKuriFoundation;
    FragmentManager fragmentManager;

    LinearLayout firstHome, secondHome, thirdHome, forthHome;
    Animation uptodown1, downtoup1, uptodown2, downtoup2;

    public SocialOrganizationMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.social_social_organization_main, container, false);

        khataKolomCardView = (CardView) rootView.findViewById(R.id.khataKolomCardView);
        obiramFoundationCardView = (CardView) rootView.findViewById(R.id.obiramFoundationCardView);
        QawmiBloodBankCardView = (CardView) rootView.findViewById(R.id.QawmiBloodBankCardView);
        bloodForBrahmanbariaCardView = (CardView) rootView.findViewById(R.id.bloodForBrahmanbariaCardView);
        cleanBrahmanbariaCardView = (CardView) rootView.findViewById(R.id.cleanBrahmanbariaCardView);
        shotoKuriFoundation = (CardView) rootView.findViewById(R.id.shotoKuriFoundation);
        nctfBrahmanbariaCardView = (CardView) rootView.findViewById(R.id.nctfBrahmanbariaCardView);
        kisorBondoFoundationCardView = (CardView) rootView.findViewById(R.id.kisorBondoFoundationCardView);


        //for Animation Sector here
        firstHome = (LinearLayout) rootView.findViewById(R.id.firstSocial);
        secondHome = (LinearLayout) rootView.findViewById(R.id.secondSocial);

        thirdHome = (LinearLayout) rootView.findViewById(R.id.thirdSocial);
        forthHome = (LinearLayout) rootView.findViewById(R.id.forthSocial);



        uptodown1 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);
        downtoup1 = AnimationUtils.loadAnimation(getActivity(),R.anim.maindowntoup);

        uptodown2 = AnimationUtils.loadAnimation(getActivity(),R.anim.mainuptodown);
        downtoup2 = AnimationUtils.loadAnimation(getActivity(),R.anim.maindowntoup);


        firstHome.setAnimation(uptodown1);
        secondHome.setAnimation(downtoup1);

        thirdHome.setAnimation(uptodown2);
        forthHome.setAnimation(downtoup2);



        khataKolomCardView.setOnClickListener(this);
        obiramFoundationCardView.setOnClickListener(this);
        QawmiBloodBankCardView.setOnClickListener(this);
        bloodForBrahmanbariaCardView.setOnClickListener(this);
        cleanBrahmanbariaCardView.setOnClickListener(this);
        shotoKuriFoundation.setOnClickListener(this);
        nctfBrahmanbariaCardView.setOnClickListener(this);
        kisorBondoFoundationCardView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {

            case R.id.khataKolomCardView : intent = new Intent(getActivity(), KhataKolomFoundation.class);
                KhataKolomFoundation khataKolomFoundation = new KhataKolomFoundation();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, khataKolomFoundation, khataKolomFoundation.getTag()).commit();
                break;

            case R.id.obiramFoundationCardView : intent = new Intent(getActivity(), ObiramFoundation.class);
                ObiramFoundation obiramFoundation = new ObiramFoundation();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, obiramFoundation, obiramFoundation.getTag()).commit();
                break;

            case R.id.QawmiBloodBankCardView : intent = new Intent(getActivity(), QawmiBloodBank.class);
                QawmiBloodBank qawmiBloodBank = new QawmiBloodBank();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, qawmiBloodBank, qawmiBloodBank.getTag()).commit();
                break;

            case R.id.bloodForBrahmanbariaCardView : intent = new Intent(getActivity(), BloodForBrahmanbaria.class);
                BloodForBrahmanbaria bloodForBrahmanbaria = new BloodForBrahmanbaria();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bloodForBrahmanbaria, bloodForBrahmanbaria.getTag()).commit();
                break;

            case R.id.cleanBrahmanbariaCardView : intent = new Intent(getActivity(), CleanBrahmanbaria.class);
                CleanBrahmanbaria cleanBrahmanbaria = new CleanBrahmanbaria();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, cleanBrahmanbaria, cleanBrahmanbaria.getTag()).commit();
                break;

            case R.id.shotoKuriFoundation : intent = new Intent(getActivity(), ShotoKuriFoundation.class);
                ShotoKuriFoundation shotoKuriFoundation = new ShotoKuriFoundation();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, shotoKuriFoundation, shotoKuriFoundation.getTag()).commit();
                break;

            case R.id.nctfBrahmanbariaCardView : intent = new Intent(getActivity(), NCTFBrahmanbaria.class);
                NCTFBrahmanbaria nctfBrahmanbaria = new NCTFBrahmanbaria();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nctfBrahmanbaria, nctfBrahmanbaria.getTag()).commit();
                break;

            case R.id.kisorBondoFoundationCardView : intent = new Intent(getActivity(), KisorBondoFoundation.class);
                KisorBondoFoundation kisorBondoFoundation = new KisorBondoFoundation();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, kisorBondoFoundation, kisorBondoFoundation.getTag()).commit();
                break;
        }
    }
}
