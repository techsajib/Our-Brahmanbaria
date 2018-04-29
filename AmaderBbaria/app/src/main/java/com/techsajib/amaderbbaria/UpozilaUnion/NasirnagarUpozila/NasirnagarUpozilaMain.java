package com.techsajib.amaderbbaria.UpozilaUnion.NasirnagarUpozila;


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
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion.AshuganjUnionAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.NasirnagarUpozila.NasirnagarAbout.NasirnagarUnionAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class NasirnagarUpozilaMain extends Fragment implements View.OnClickListener{

    private CardView nasirnagarAbout, nasirnagarUnionAbout;
    FragmentManager fragmentManager;


    public NasirnagarUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_nasirnagar_main, container, false);

        nasirnagarAbout = (CardView) rootView.findViewById(R.id.nasirnagar_about_LinearLayout);
        nasirnagarUnionAbout = (CardView) rootView.findViewById(R.id.nasirnagar_union_about_LinearLayout);

        nasirnagarAbout.setOnClickListener(this);
        nasirnagarUnionAbout.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.nasirnagar_about_LinearLayout : intent = new Intent(getActivity(), GovtHospitalMain.class);
                NasirNagarAbout nasirNagarAbout = new NasirNagarAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nasirNagarAbout, nasirNagarAbout.getTag()).commit();
                break;

            case R.id.nasirnagar_union_about_LinearLayout : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                NasirnagarUnionAbout nasirnagarunionaboutDetails = new NasirnagarUnionAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nasirnagarunionaboutDetails, nasirnagarunionaboutDetails.getTag()).commit();
                break;

        }
    }
}
