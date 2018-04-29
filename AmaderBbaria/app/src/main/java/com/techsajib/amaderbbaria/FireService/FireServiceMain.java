package com.techsajib.amaderbbaria.FireService;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FireServiceMain extends Fragment {


    TextView bbfireService, asfireService, akfireService, ksfireService;
    private InterstitialAd interstitialAd;

    public FireServiceMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fire_fire_service_main, container, false);

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


        //website id
        bbfireService = (TextView) rootView.findViewById(R.id.bbfireService);
        asfireService = (TextView) rootView.findViewById(R.id.asfireService);
        akfireService = (TextView) rootView.findViewById(R.id.akfireService);
        ksfireService = (TextView) rootView.findViewById(R.id.ksfireService);




        //website connection system
        bbfireService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://fireservice.brahmanbaria.gov.bd"));
                startActivity(intent);
            }
        });

        asfireService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://fireservice.brahmanbaria.gov.bd"));
                startActivity(intent);
            }
        });


        akfireService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://fireservice.brahmanbaria.gov.bd"));
                startActivity(intent);
            }
        });


        ksfireService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://fireservice.brahmanbaria.gov.bd"));
                startActivity(intent);
            }
        });


        return rootView;
    }

}
