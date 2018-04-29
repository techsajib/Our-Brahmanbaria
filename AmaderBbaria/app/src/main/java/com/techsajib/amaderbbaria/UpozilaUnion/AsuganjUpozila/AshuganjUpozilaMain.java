package com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila;


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
import com.techsajib.amaderbbaria.UpozilaUnion.AkhauraUpozila.AkhauraAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.AkhauraUpozila.AkhauraUnion.AkhauraUnionAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion.AshuganjUnionAbout;

/**
 * A simple {@link Fragment} subclass.
 */
public class AshuganjUpozilaMain extends Fragment implements View.OnClickListener{
    private CardView ashuganjAbout, unionAbout;
    FragmentManager fragmentManager;

    public AshuganjUpozilaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_ashuganj_main, container, false);
        ashuganjAbout = (CardView) rootView.findViewById(R.id.ashuganj_about_CardView);
        unionAbout = (CardView) rootView.findViewById(R.id.ashuganj_union_about_CardView);

        ashuganjAbout.setOnClickListener(this);
        unionAbout.setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.ashuganj_about_CardView : intent = new Intent(getActivity(), GovtHospitalMain.class);
                AshuganjAbout  ashuganjAbout = new AshuganjAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ashuganjAbout, ashuganjAbout.getTag()).commit();
                break;

            case R.id.ashuganj_union_about_CardView : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                AshuganjUnionAbout ashuganjUnionAbout = new AshuganjUnionAbout();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ashuganjUnionAbout, ashuganjUnionAbout.getTag()).commit();
                break;

        }
    }
}
