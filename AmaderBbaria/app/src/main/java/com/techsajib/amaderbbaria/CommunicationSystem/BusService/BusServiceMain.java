package com.techsajib.amaderbbaria.CommunicationSystem.BusService;


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
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.LiberationWar.LiberationWarDetails;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusServiceMain extends Fragment {

    FragmentManager fragmentManager;

    Button bbtoDhaka, dhakatobb, bbtochittagong, chittagongtobb, bbtosylhet, sylhettobb;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public BusServiceMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.com_bus_service_main, container, false);

        //interstitial ads here // change your setAdunitAd ID, it's fake!
        interstitialAd = new InterstitialAd(getActivity());
        interstitialAd.setAdUnitId("ca-app-pub-8230275109768142/2069466350");
        AdRequest adRequest1 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest1);

        interstitialAd.setAdListener(new AdListener(){
                                         @Override
                                         public void onAdLoaded() {
                                             if (interstitialAd.isLoaded()){
                                                 interstitialAd.show();
                                             }
                                         }
                                     }

        );


        bbtoDhaka = (Button) rootView.findViewById(R.id.bbtodhakaBus);
        dhakatobb = (Button) rootView.findViewById(R.id.dhakatobb);
        bbtochittagong = (Button) rootView.findViewById(R.id.bbtochittagong);
        chittagongtobb = (Button) rootView.findViewById(R.id.chittagongtobb);
        bbtosylhet = (Button) rootView.findViewById(R.id.bbtosylhet);
        sylhettobb = (Button) rootView.findViewById(R.id.sylhettobb);

       /* //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.bbtodhakaLiniarLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(), R.anim.uptodown);
        first.setAnimation(uptodown);*/




        bbtoDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BbtoDhaka.class);
                BbtoDhaka bbtoDhaka = new BbtoDhaka();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bbtoDhaka, bbtoDhaka.getTag()).commit();
            }
        });

        dhakatobb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Dhakatobb.class);
                Dhakatobb dhakatobb = new Dhakatobb();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, dhakatobb, dhakatobb.getTag()).commit();
            }
        });

        bbtochittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BBtoChittagong.class);
                BBtoChittagong bBtoChittagong = new BBtoChittagong();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bBtoChittagong, bBtoChittagong.getTag()).commit();
            }
        });

        chittagongtobb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChittagongtoBB.class);
                ChittagongtoBB chittagongtoBB = new ChittagongtoBB();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, chittagongtoBB, chittagongtoBB.getTag()).commit();
            }
        });

        bbtosylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BBtoSylhet.class);
                BBtoSylhet bBtoSylhet = new BBtoSylhet();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bBtoSylhet, bBtoSylhet.getTag()).commit();
            }
        });

        sylhettobb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SylhettoBB.class);
                SylhettoBB sylhettoBB = new SylhettoBB();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sylhettoBB, sylhettoBB.getTag()).commit();
            }
        });

        return rootView;
    }

}
