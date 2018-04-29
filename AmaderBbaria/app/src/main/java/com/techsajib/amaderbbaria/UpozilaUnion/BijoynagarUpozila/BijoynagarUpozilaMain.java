package com.techsajib.amaderbbaria.UpozilaUnion.BijoynagarUpozila;


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
import com.techsajib.amaderbbaria.UpozilaUnion.BijoynagarUpozila.BijoynagarUnion.BIjoynagarUnionAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUnion.KasbaUnionAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class BijoynagarUpozilaMain extends Fragment implements View.OnClickListener{

    private CardView bijoynagarAbout, unionAbout;
    FragmentManager fragmentManager;

    public BijoynagarUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_bijoynagar_main, container, false);
        bijoynagarAbout = (CardView) rootView.findViewById(R.id.bijoynagar_about_LinearLayout);
        unionAbout = (CardView) rootView.findViewById(R.id.bijoynagar_union_about_LinearLayout);

        bijoynagarAbout.setOnClickListener(this);
        unionAbout.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.bijoynagar_about_LinearLayout : intent = new Intent(getActivity(), GovtHospitalMain.class);
                BijoynagarAbout bijoynagarAbout = new BijoynagarAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bijoynagarAbout, bijoynagarAbout.getTag()).commit();
                break;

            case R.id.bijoynagar_union_about_LinearLayout : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                BIjoynagarUnionAbout bIjoynagarUnionAbout = new BIjoynagarUnionAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bIjoynagarUnionAbout, bIjoynagarUnionAbout.getTag()).commit();
                break;

        }
    }
}
