package com.techsajib.amaderbbaria.UpozilaUnion.AkhauraUpozila;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.techsajib.amaderbbaria.DoctorHospital.GovtHospital.GovtHospitalMain;
import com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital.PrivateHospitalMain;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.AkhauraUpozila.AkhauraUnion.AkhauraUnionAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUnion.KasbaUnionAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class AkhauraUpozilaMain extends Fragment implements View.OnClickListener{

    private CardView akhauraAbout, unionAbout;
    FragmentManager fragmentManager;

    public AkhauraUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_akhaura_main, container, false);
        akhauraAbout = (CardView) rootView.findViewById(R.id.akhaura_about_CardView);
        unionAbout = (CardView) rootView.findViewById(R.id.akhaura_union_about_CardView);


        akhauraAbout.setOnClickListener(this);
        unionAbout.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.akhaura_about_CardView : intent = new Intent(getActivity(), GovtHospitalMain.class);
                AkhauraAbout akhauraAbout = new AkhauraAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, akhauraAbout, akhauraAbout.getTag()).commit();
                break;

            case R.id.akhaura_union_about_CardView : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                AkhauraUnionAbout akhauraUnionAbout = new AkhauraUnionAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, akhauraUnionAbout, akhauraUnionAbout.getTag()).commit();
                break;

        }
    }
}
