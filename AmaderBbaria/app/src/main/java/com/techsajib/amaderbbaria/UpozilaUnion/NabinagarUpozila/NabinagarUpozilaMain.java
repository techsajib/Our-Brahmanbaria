package com.techsajib.amaderbbaria.UpozilaUnion.NabinagarUpozila;


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
import com.techsajib.amaderbbaria.UpozilaUnion.NabinagarUpozila.NabinagarUnion.NabinagarUnionAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class NabinagarUpozilaMain extends Fragment implements View.OnClickListener{

    private CardView nabinagarAbout, unionAbout;
    FragmentManager fragmentManager;

    public NabinagarUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_nabinagar_main, container, false);

        nabinagarAbout = (CardView) rootView.findViewById(R.id.nabinagar_about_LinearLayout);
        unionAbout = (CardView) rootView.findViewById(R.id.nabinagar_union_about_LinearLayout);


        nabinagarAbout.setOnClickListener(this);
        unionAbout.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.nabinagar_about_LinearLayout : intent = new Intent(getActivity(), GovtHospitalMain.class);
                NabinagarAbout nabinagarAbout = new NabinagarAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nabinagarAbout, nabinagarAbout.getTag()).commit();
                break;

            case R.id.nabinagar_union_about_LinearLayout : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                NabinagarUnionAbout nabinagarUnionAbout = new NabinagarUnionAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nabinagarUnionAbout, nabinagarUnionAbout.getTag()).commit();
                break;

        }
    }
}
