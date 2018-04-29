package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.ReligiousMain;


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
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Church.ChurchMain;
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque.MosqueMain;
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Orphange.OrphangeMain;
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Temple.TempleMain;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReligiousMain extends Fragment {

    ListView listView;
    ArrayList<ReligiousIDRegister> listOfReligious;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;


    public ReligiousMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.religious_main, container, false);

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



        listView = (ListView) rootView.findViewById(R.id.religiousListView);
        listOfReligious = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.religiousPlaceLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i =1; i<5; i++){
            int id = i+1;
            int logo = R.drawable.ic_menu_gallery;
            String text = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.mosque;
                text = "বিখ্যাত মসজিদসমূহ";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.temple;
                text = "বিখ্যাত মন্দিরসমূহ";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.church;
                text = "ব্রাহ্মণবাড়িয়া ব্যাপ্টিস্ট চার্চ";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.orphangeschool;
                text = "এতিমখানা";
            }

            ReligiousIDRegister religiousIDRegister = new ReligiousIDRegister(id, logo, text);
            listOfReligious.add(religiousIDRegister);
        }

            ReligiousAdapter religiousAdapter = new ReligiousAdapter(listOfReligious, getActivity());
            listView.setAdapter(religiousAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ReligiousIDRegister religiousIDRegister = listOfReligious.get(position);
                    if (position == 0){
                        MosqueMain mosqueMain = new MosqueMain();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, mosqueMain, mosqueMain.getTag()).commit();
                    }if (position == 1){
                        TempleMain templeMain = new TempleMain();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, templeMain, templeMain.getTag()).commit();
                    }if (position == 2){
                        ChurchMain churchMain = new ChurchMain();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, churchMain, churchMain.getTag()).commit();
                    }if (position == 3){
                        OrphangeMain orphangeMain = new OrphangeMain();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .add(new Home(), "About")
                                .addToBackStack("About")
                                .replace(R.id.content_main, orphangeMain, orphangeMain.getTag()).commit();
                    }
                }
            });
        return rootView;
    }

}
