package com.techsajib.amaderbbaria.HomeProfile.TouristPlace;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.AkhauraArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.AshuganjArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.BancharampurArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.BijoynagarArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.KasbaArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.NabinagarArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.NasirnagarArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.SadarArticle;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.Article.SarailArticle;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TouristPlaceDetails extends Fragment {

    ListView listView;
    ArrayList<TouristIDRegister> listOfTourist;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public TouristPlaceDetails() {
         // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.brahmanbaria_tourist_place_details, container, false);


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


        first = (LinearLayout) rootView.findViewById(R.id.touristListViewID);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        listView = (ListView) rootView.findViewById(R.id.touristListView);
        listOfTourist = new ArrayList<>();

        for (int i = 1; i<10; i++){
            int id = i+1;
            String text = "";
            int icon = R.drawable.bracket;

            if (i == 1){
                id = i+1;
                text = "সদর উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 2){
                id = i+1;
                text = "সরাইল উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 3){
                id = i+1;
                text = "আশুগঞ্জ উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 4){
                id = i+1;
                text = "নাসিরনগর উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 5){
                id = i+1;
                text = "আখাউড়া উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 6){
                id = i+1;
                text = "বিজয়নগর উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 7){
                id = i+1;
                text = "কসবা উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 8){
                id = i+1;
                text = "নবীনগর উপজেলা";
                icon = R.drawable.bracketwhite;
            }else if (i == 9){
                id = i+1;
                text = "বাঞ্ছারামপুর উপজেলা";
                icon = R.drawable.bracketwhite;
            }

            TouristIDRegister touristIDRegister = new TouristIDRegister(id, text, icon);
            listOfTourist.add(touristIDRegister);
        }

            TouristAdapter touristAdapter = new TouristAdapter(listOfTourist, getActivity());
            listView.setAdapter(touristAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0){
                        SadarArticle sadarArticle = new SadarArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, sadarArticle, sadarArticle.getTag()).commit();

                    }else if (position == 1){
                        SarailArticle sarailArticle = new SarailArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, sarailArticle, sarailArticle.getTag()).commit();

                    }else if (position == 2){
                        AshuganjArticle ashuganjArticle = new AshuganjArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, ashuganjArticle, ashuganjArticle.getTag()).commit();

                    }else if (position == 3){
                       NasirnagarArticle nasirnagarArticle = new NasirnagarArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, nasirnagarArticle, nasirnagarArticle.getTag()).commit();

                    }else if (position == 4){
                        AkhauraArticle akhauraArticle = new AkhauraArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, akhauraArticle, akhauraArticle.getTag()).commit();

                    }else if (position == 5){
                        BijoynagarArticle bijoynagarArticle = new BijoynagarArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, bijoynagarArticle, bijoynagarArticle.getTag()).commit();

                    }else if (position == 6){
                        KasbaArticle kasbaArticle = new KasbaArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, kasbaArticle, kasbaArticle.getTag()).commit();

                    }else if (position == 7){
                        NabinagarArticle nabinagarArticle = new NabinagarArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, nabinagarArticle, nabinagarArticle.getTag()).commit();

                    }else if (position == 8){
                        BancharampurArticle bancharampurArticle = new BancharampurArticle();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, bancharampurArticle, bancharampurArticle.getTag()).commit();
                    }

                }
            });

        return rootView;
    }

}
