package com.techsajib.amaderbbaria.SocialOrganization.Organization;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class QawmiBloodBank extends Fragment {

    ImageButton email, facebookGroup, facebookPage;
    private InterstitialAd interstitialAd;

    public QawmiBloodBank() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.social_qawmi_blood_bank, container, false);

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

        email = (ImageButton) rootView.findViewById(R.id.qawmiemail);
        facebookGroup = (ImageButton) rootView.findViewById(R.id.qawmifacebookGroup);
        facebookPage = (ImageButton) rootView.findViewById(R.id.qawmifacebookPage);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"qawmibloodbank@gmail.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Volunteer/Donor/Query for Qawmi Blood Bank!");
                    intent.putExtra(Intent.EXTRA_TEXT, "");
                    intent.setType("massage/efc822");
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(getActivity(), "Sorry! Please Install Your Email Application!", Toast.LENGTH_LONG).show();
                }
            }
        });

        facebookGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/groups/qawmibloodbank"));
                startActivity(intent);
            }
        });

        facebookPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/qawmibloodbank"));
                startActivity(intent);
            }
        });

        return rootView;
    }

}
