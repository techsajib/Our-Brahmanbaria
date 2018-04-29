package com.techsajib.amaderbbaria.UpozilaUnion.SadarUpozila;


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
import com.techsajib.amaderbbaria.UpozilaUnion.SadarUpozila.SadarUnion.UnionSadarAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class SadarUpozilaMain extends Fragment implements View.OnClickListener{

    private CardView sadarAbout, unionAbout;
    FragmentManager fragmentManager;

    public SadarUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_sadar_main, container, false);

            sadarAbout = (CardView) rootView.findViewById(R.id.sadar_about_LinearLayout);
            unionAbout = (CardView) rootView.findViewById(R.id.union_about_LinearLayout);

        sadarAbout.setOnClickListener(this);
        unionAbout.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.sadar_about_LinearLayout : intent = new Intent(getActivity(), GovtHospitalMain.class);
                SadarAbout sadarAbout = new SadarAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sadarAbout, sadarAbout.getTag()).commit();
                break;

            case R.id.union_about_LinearLayout : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                UnionSadarAbout unionSadarAbout = new UnionSadarAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, unionSadarAbout, unionSadarAbout.getTag()).commit();
                break;

        }
    }
}
