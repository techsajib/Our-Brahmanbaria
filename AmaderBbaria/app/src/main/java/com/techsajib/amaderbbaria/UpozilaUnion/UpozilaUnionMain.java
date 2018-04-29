package com.techsajib.amaderbbaria.UpozilaUnion;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.DistrictDetails;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.AkhauraUpozila.AkhauraUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.BancharampurUpozila.BancharampurUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.BijoynagarUpozila.BijoynagarUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.KasbaUpozila.KasbaUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.NabinagarUpozila.NabinagarUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.NasirnagarUpozila.NasirnagarUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.SadarUpozila.SadarUpozilaMain;
import com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUpozilaMain;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpozilaUnionMain extends Fragment {

    Button sadarUpozila, ashuganjUpozila, sarailUpozila, nasirnagarUpozila, nabinagarUpozila, kasbaUpozila, bancharampurUpozila, akhauraUpozila, bijoynagarUpozila;
    FragmentManager fragmentManager;


    public UpozilaUnionMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upozila_union_main, container, false);

        sadarUpozila = (Button) rootView.findViewById(R.id.sadar_upozila);
        ashuganjUpozila = (Button) rootView.findViewById(R.id.ashuganj_upozila);
        sarailUpozila = (Button) rootView.findViewById(R.id.sarail_upozila);
        nasirnagarUpozila = (Button) rootView.findViewById(R.id.nasirnagar_upozila);
        nabinagarUpozila = (Button) rootView.findViewById(R.id.nabinagar_upozila);
        kasbaUpozila = (Button) rootView.findViewById(R.id.kasba_upozila);
        bancharampurUpozila = (Button) rootView.findViewById(R.id.bancharampur_upozila);
        akhauraUpozila  = (Button) rootView.findViewById(R.id.akhaura_upozila);
        bijoynagarUpozila = (Button) rootView.findViewById(R.id.bijaynagar_upozila);


        sadarUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SadarUpozilaMain.class);
                SadarUpozilaMain sadarUpozilaMain = new SadarUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sadarUpozilaMain, sadarUpozilaMain.getTag()).commit();
            }
        });


        sarailUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SarailUpozilaMain.class);
                SarailUpozilaMain sarailUpozilaMain = new SarailUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sarailUpozilaMain, sarailUpozilaMain.getTag()).commit();
            }
        });


        ashuganjUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AshuganjUpozilaMain.class);
                AshuganjUpozilaMain  ashuganjUpozilaMain = new AshuganjUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ashuganjUpozilaMain, ashuganjUpozilaMain.getTag()).commit();
            }
        });


        nasirnagarUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NasirnagarUpozilaMain.class);
                NasirnagarUpozilaMain  nasirnagarUpozilaMain = new NasirnagarUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nasirnagarUpozilaMain, nasirnagarUpozilaMain.getTag()).commit();
            }
        });

        nabinagarUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NabinagarUpozilaMain.class);
                NabinagarUpozilaMain  nabinagarUpozilaMain = new NabinagarUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nabinagarUpozilaMain, nabinagarUpozilaMain.getTag()).commit();
            }
        });

        kasbaUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KasbaUpozilaMain.class);
                KasbaUpozilaMain kasbaUpozilaMain = new KasbaUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, kasbaUpozilaMain, kasbaUpozilaMain.getTag()).commit();
            }
        });

        bancharampurUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BancharampurUpozilaMain.class);
                BancharampurUpozilaMain bancharampurUpozilaMain = new BancharampurUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bancharampurUpozilaMain, bancharampurUpozilaMain.getTag()).commit();
            }
        });

        akhauraUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AkhauraUpozilaMain.class);
                AkhauraUpozilaMain akhauraUpozilaMain = new AkhauraUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, akhauraUpozilaMain, akhauraUpozilaMain.getTag()).commit();
            }
        });

        bijoynagarUpozila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BijoynagarUpozilaMain.class);
                BijoynagarUpozilaMain bijoynagarUpozilaMain = new BijoynagarUpozilaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bijoynagarUpozilaMain, bijoynagarUpozilaMain.getTag()).commit();
            }
        });


        return rootView;
    }

}
