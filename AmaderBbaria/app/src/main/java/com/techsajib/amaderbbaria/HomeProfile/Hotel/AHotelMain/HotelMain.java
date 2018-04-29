package com.techsajib.amaderbbaria.HomeProfile.Hotel.AHotelMain;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel.GovtHotelMain;
import com.techsajib.amaderbbaria.HomeProfile.Hotel.PrivateHotel.PrivateHotelMain;
import com.techsajib.amaderbbaria.HomeProfile.Hotel.Restaurant.RestaurantMain;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelMain extends Fragment {

    ListView listView;
    ArrayList<HotelIDRegister> listOfHotel;
    android.support.v4.app.FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;


    public HotelMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hotel_main, container, false);

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


        listView = (ListView) rootView.findViewById(R.id.hotelListView);
        listOfHotel = new ArrayList<>();

        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.hotelLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);


        for (int i =1; i<4; i++){
            int id = i+1;
            int logo = R.drawable.ic_menu_gallery;
            String text = "";

            if (i==1){
                id = i+1;
                logo = R.drawable.govtbuilding;
                text = "সরকারী হোটেল ও আবাসন";
            }else if (i==2){
                id = i+1;
                logo = R.drawable.privatebuilding;
                text = "বেসরকারী হোটেল ও আবাসন";
            }else if (i==3){
                id = i+1;
                logo = R.drawable.colorrestaurant;
                text = "ক্যাফে ও রেস্টুরেন্ট";
            }

            HotelIDRegister hotelIDRegister = new HotelIDRegister(id, logo, text);
            listOfHotel.add(hotelIDRegister);

        }

        HotelAdapter hotelAdapter = new HotelAdapter(listOfHotel, getActivity());
        listView.setAdapter(hotelAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               HotelIDRegister hotelIDRegister = listOfHotel.get(position);
               if (position == 0){
                   GovtHotelMain govtHotelMain = new GovtHotelMain();
                   fragmentManager = getActivity().getSupportFragmentManager();
                   fragmentManager.beginTransaction()
                           .add(new Home(), "About")
                           .addToBackStack("About")
                           .replace(R.id.content_main, govtHotelMain, govtHotelMain.getTag()).commit();
               }else if (position == 1){
                   PrivateHotelMain privateHotelMain = new PrivateHotelMain();
                   fragmentManager = getActivity().getSupportFragmentManager();
                   fragmentManager.beginTransaction()
                           .add(new Home(), "About")
                           .addToBackStack("About")
                           .replace(R.id.content_main, privateHotelMain, privateHotelMain.getTag()).commit();
               }else if (position == 2){
                   RestaurantMain restaurantMain = new RestaurantMain();
                   fragmentManager = getActivity().getSupportFragmentManager();
                   fragmentManager.beginTransaction()
                           .add(new Home(), "About")
                           .addToBackStack("About")
                           .replace(R.id.content_main, restaurantMain, restaurantMain.getTag()).commit();
               }

           }
       });

        return rootView;
    }

}
