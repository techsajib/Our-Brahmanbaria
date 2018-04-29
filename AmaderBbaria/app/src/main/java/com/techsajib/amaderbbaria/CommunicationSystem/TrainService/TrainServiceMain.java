package com.techsajib.amaderbbaria.CommunicationSystem.TrainService;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.CommunicationSystem.BusService.BusServiceMain;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.DownTrainTimeSchedule.DownTrain.DownTrainMain;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.DownTrainTimeSchedule.DownTrainRent.DownTrainRentMain;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainMain;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainRent.UpTrainRentMain;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrainServiceMain extends Fragment implements View.OnClickListener{

    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    private CardView upTrainCardView, upTrainRentCardView, downTrainCardView, downTrainRentCardView;

    public TrainServiceMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.train_train_service_main, container, false);

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

        upTrainCardView = (CardView) rootView.findViewById(R.id.dhakaTrainCardView);
        upTrainRentCardView = (CardView) rootView.findViewById(R.id.upTrainRentCardView);
        downTrainCardView = (CardView) rootView.findViewById(R.id.downTrainCardView);
        downTrainRentCardView = (CardView) rootView.findViewById(R.id.downTrainRentCardView);


        upTrainCardView.setOnClickListener(this);
        upTrainRentCardView.setOnClickListener(this);
        downTrainCardView.setOnClickListener(this);
        downTrainRentCardView.setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {

            case R.id.dhakaTrainCardView:
                intent = new Intent(getActivity(), UpTrainMain.class);
                UpTrainMain upTrainMain = new UpTrainMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, upTrainMain, upTrainMain.getTag()).commit();
                break;

            case R.id.upTrainRentCardView:
                intent = new Intent(getActivity(), UpTrainRentMain.class);
                UpTrainRentMain upTrainRentMain = new UpTrainRentMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, upTrainRentMain, upTrainRentMain.getTag()).commit();
                break;

            case R.id.downTrainCardView:
                intent = new Intent(getActivity(), DownTrainMain.class);
                DownTrainMain downTrainMain = new DownTrainMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, downTrainMain, downTrainMain.getTag()).commit();
                break;

            case R.id.downTrainRentCardView:
                intent = new Intent(getActivity(), DownTrainRentMain.class);
                DownTrainRentMain downTrainRentMain = new DownTrainRentMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, downTrainRentMain, downTrainRentMain.getTag()).commit();
                break;



        }
    }

}

