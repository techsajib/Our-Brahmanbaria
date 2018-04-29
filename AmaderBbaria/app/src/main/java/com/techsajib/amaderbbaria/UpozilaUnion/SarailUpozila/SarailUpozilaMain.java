package com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila;


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
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion.SarailUnionAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class SarailUpozilaMain extends Fragment implements View.OnClickListener{

    private CardView sarailAbout, unionAbout;
    FragmentManager fragmentManager;

    public SarailUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_sarail_main, container, false);

        sarailAbout = (CardView) rootView.findViewById(R.id.sarail_about_LinearLayout);
        unionAbout = (CardView) rootView.findViewById(R.id.sarailunion_about_LinearLayout);


        sarailAbout.setOnClickListener(this);
        unionAbout.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.sarail_about_LinearLayout : intent = new Intent(getActivity(), GovtHospitalMain.class);
                SarailAbout sarailAbout = new SarailAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sarailAbout, sarailAbout.getTag()).commit();
                break;

            case R.id.sarailunion_about_LinearLayout : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                SarailUnionAbout sarailUnionAbout = new SarailUnionAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sarailUnionAbout, sarailUnionAbout.getTag()).commit();
                break;

        }
    }
}
