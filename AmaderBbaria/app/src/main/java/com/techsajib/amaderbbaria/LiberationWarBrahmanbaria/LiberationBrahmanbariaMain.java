package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand.AkhauraCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AshuganjCommand.AshuganjCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.BancharampurCommand.BancharampurCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.BijoynagarCommand.BijoynagarCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.KasbaCommand.KasbaCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.LiberationWar.LiberationWarDetails;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.NabinagarCommand.NabinagarCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.NasirnagarCommand.NasinagarCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SadarCommand.SadarCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.SarailCommand.SarailCommandMain;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.ZilaCommand.ZilaCommandCounsilMain;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.SadarUpozila.SadarUpozilaMain;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiberationBrahmanbariaMain extends Fragment {

    Button liberationWar, zilaCommand, sadarCommand, sarailCommand, ashuganjCommand, nasirnagarCommand, nabinagarCommand, kasbaCommand, bancharampurCommand, akhauraCommand, bijoynagarCommand;
    FragmentManager fragmentManager;

    LinearLayout first;
    Animation uptodown;

    public LiberationBrahmanbariaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.war_liberation_brahmanbaria_main, container, false);
        liberationWar = (Button) rootView.findViewById(R.id.liberationWarBrahmanbaria);
        zilaCommand = (Button) rootView.findViewById(R.id.zilaCommandWar);
        sadarCommand  = (Button) rootView.findViewById(R.id.sadarCommandWar);
        sarailCommand  = (Button) rootView.findViewById(R.id.sarailCommandWar);
        ashuganjCommand = (Button) rootView.findViewById(R.id.ashuganjCommandWar);
        nasirnagarCommand  = (Button) rootView.findViewById(R.id.nasirnagarCommandWar);
        nabinagarCommand = (Button) rootView.findViewById(R.id.nabinagarCommandWar);
        kasbaCommand = (Button) rootView.findViewById(R.id.kasbaCommandWar);
        bancharampurCommand = (Button) rootView.findViewById(R.id.bancharampurCommandWar);
        akhauraCommand = (Button) rootView.findViewById(R.id.akhauraCommandWar);
        bijoynagarCommand = (Button) rootView.findViewById(R.id.bijoynagarCommandWar);

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.liberationWarLinearlayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);




        liberationWar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LiberationWarDetails.class);
                LiberationWarDetails liberationWarDetails = new LiberationWarDetails();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, liberationWarDetails, liberationWarDetails.getTag()).commit();
            }
        });


        zilaCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ZilaCommandCounsilMain.class);
                ZilaCommandCounsilMain zilaCommandCounsilMain = new ZilaCommandCounsilMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, zilaCommandCounsilMain, zilaCommandCounsilMain.getTag()).commit();
            }
        });


        sadarCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SadarCommandMain.class);
                SadarCommandMain sadarCommandMain = new SadarCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sadarCommandMain, sadarCommandMain.getTag()).commit();
            }
        });


        sarailCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SarailCommandMain.class);
                SarailCommandMain sarailCommandMain =  new SarailCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sarailCommandMain, sarailCommandMain.getTag()).commit();
            }
        });


        ashuganjCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AshuganjCommandMain.class);
                AshuganjCommandMain ashuganjCommandMain =  new AshuganjCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ashuganjCommandMain, ashuganjCommandMain.getTag()).commit();
            }
        });


        nasirnagarCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NasinagarCommandMain.class);
                NasinagarCommandMain nasinagarCommandMain =  new NasinagarCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nasinagarCommandMain, nasinagarCommandMain.getTag()).commit();
            }
        });

        nabinagarCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NabinagarCommandMain.class);
                NabinagarCommandMain nabinagarCommandMain = new NabinagarCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nabinagarCommandMain, nabinagarCommandMain.getTag()).commit();
            }
        });

        kasbaCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KasbaCommandMain.class);
                KasbaCommandMain kasbaCommandMain = new KasbaCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, kasbaCommandMain, kasbaCommandMain.getTag()).commit();
            }
        });

        bancharampurCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BancharampurCommandMain.class);
                BancharampurCommandMain bancharampurCommandMain = new BancharampurCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bancharampurCommandMain, bancharampurCommandMain.getTag()).commit();
            }
        });

        akhauraCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AkhauraCommandMain.class);
                AkhauraCommandMain akhauraCommandMain = new AkhauraCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, akhauraCommandMain, akhauraCommandMain.getTag()).commit();
            }
        });

        bijoynagarCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BijoynagarCommandMain.class);
                BijoynagarCommandMain bijoynagarCommandMain = new BijoynagarCommandMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bijoynagarCommandMain, bijoynagarCommandMain.getTag()).commit();
            }
        });
        return rootView;
    }

}
