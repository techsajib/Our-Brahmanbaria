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
public class CleanBrahmanbaria extends Fragment {

    ImageButton email, beAMember, facebookGroup, facebookPage;
    private InterstitialAd interstitialAd;

    public CleanBrahmanbaria() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.social_clean_brahmanbaria, container, false);

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

        email = (ImageButton) rootView.findViewById(R.id.cleanbrahmanbariaemail);
        beAMember = (ImageButton) rootView.findViewById(R.id.cleanbeAMember);
        facebookGroup = (ImageButton) rootView.findViewById(R.id.cleanfacebookGroup);
        facebookPage = (ImageButton) rootView.findViewById(R.id.cleanfacebookPage);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"cleanbrahmanbaria@gmail.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Volunteer/Query for Clean Brahmanbaria!");
                    intent.putExtra(Intent.EXTRA_TEXT, "");
                    intent.setType("massage/efc822");
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(getActivity(), "Sorry! Please Install Your Email Application!", Toast.LENGTH_LONG).show();
                }
            }
        });

        beAMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/aD2BTm"));
                startActivity(intent);
            }
        });


        facebookGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/groups/cleanbrahmanbaria2017"));
                startActivity(intent);
            }
        });

        facebookPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/cleanbrahmanbaria"));
                startActivity(intent);
            }
        });
        return rootView;
    }

}
