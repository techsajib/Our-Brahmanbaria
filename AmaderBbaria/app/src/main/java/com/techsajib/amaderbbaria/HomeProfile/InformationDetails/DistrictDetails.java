package com.techsajib.amaderbbaria.HomeProfile.InformationDetails;


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
import com.techsajib.amaderbbaria.HomeProfile.ArticleDetails.HistoryArticle;
import com.techsajib.amaderbbaria.HomeProfile.ArticleDetails.NameHistory;
import com.techsajib.amaderbbaria.HomeProfile.ArticleDetails.NaturalResourceArticle;
import com.techsajib.amaderbbaria.HomeProfile.GeoGraphical.GeoGraphicalMain;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.HomeProfile.Hotel.AHotelMain.HotelMain;
import com.techsajib.amaderbbaria.HomeProfile.Library.LibraryMain;
import com.techsajib.amaderbbaria.HomeProfile.PostalCode.PostalCodeDetails;
import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.ReligiousMain.ReligiousMain;
import com.techsajib.amaderbbaria.HomeProfile.TouristPlace.TouristPlaceDetails;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DistrictDetails extends Fragment {
    LinearLayout first;
    Animation  uptodown;


    ListView listView;
    ArrayList<District> listOfDistrict;
    android.support.v4.app.FragmentManager fragmentManager;

    public DistrictDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.district_details, container, false);


        listView = (ListView) rootView.findViewById(R.id.districtListView);
        listOfDistrict = new ArrayList<>();

        //for animation section

        first = (LinearLayout) rootView.findViewById(R.id.firstDistrictLayout);

        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);

        first.setAnimation(uptodown);



        for (int i =1; i<10; i++){
            int id = i+1;
            int logo = R.drawable.ic_menu_gallery;
            String text = "";
            int icon = R.drawable.bracket;

            if (i == 1){
                id = i+1;
                logo = R.drawable.name;
                text = "ব্রাহ্মণবাড়িয়ার নামকরণ";
                icon = R.drawable.bracket;
            }else  if (i == 2){
                id = i+1;
                logo = R.drawable.geographical;
                text = "ভৌগলিক পরিচিতি";
                icon = R.drawable.bracket;
            }else  if (i == 3){
                id = i+1;
                logo = R.drawable.history;
                text = "ইতিহাস ও ঐতিহ্য";
                icon = R.drawable.bracket;
            }else  if (i == 4){
                id = i+1;
                logo = R.drawable.natural;
                text = "প্রাকৃতিক সম্পদ ও শিল্প";
                icon = R.drawable.bracket;
            }else  if (i == 5){
                id = i+1;
                logo = R.drawable.touristplace;
                text = "দর্শনীয় স্থানসমূহ";
                icon = R.drawable.bracket;
            }else  if (i == 6){
                id = i+1;
                logo = R.drawable.relious;
                text = "ধর্মীয় স্থানসমূহ";
                icon = R.drawable.bracket;
            }else  if (i == 7){
                id = i+1;
                logo = R.drawable.postalcode;
                text = "পোস্টাল কোড";
                icon = R.drawable.bracket;
            }else  if (i == 8){
                id = i+1;
                logo = R.drawable.hotel;
                text = "হোটেল ও রেস্টুরেন্ট";
                icon = R.drawable.bracket;
            }else  if (i == 9){
                id = i+1;
                logo = R.drawable.bookshelf;
                text = "গ্রন্থাগারসমূহ";
                icon = R.drawable.bracket;
            }

            District district = new District(id, logo, text, icon);
            listOfDistrict.add(district);
        }

            DistrictAdapter districtAdapter = new DistrictAdapter(listOfDistrict,getActivity());
            listView.setAdapter(districtAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                District district = listOfDistrict.get(position);
                if (position == 0){
                    NameHistory nameHistory = new NameHistory();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, nameHistory, nameHistory.getTag()).commit();

                }else if (position == 1){
                    GeoGraphicalMain geoGraphicalMain = new GeoGraphicalMain();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, geoGraphicalMain, geoGraphicalMain.getTag()).commit();
                }else if (position == 2){
                    HistoryArticle historyArticle = new HistoryArticle();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, historyArticle, historyArticle.getTag()).commit();
                }else if (position == 3){
                    NaturalResourceArticle naturalResourceArticle = new NaturalResourceArticle();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, naturalResourceArticle, naturalResourceArticle.getTag()).commit();
                }else if (position == 4){
                    TouristPlaceDetails touristPlaceDetails = new TouristPlaceDetails();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, touristPlaceDetails, touristPlaceDetails.getTag()).commit();
                }else if (position == 5){
                    ReligiousMain religiousMain = new ReligiousMain();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, religiousMain, religiousMain.getTag()).commit();
                }else if (position == 6){
                    PostalCodeDetails postalCodeDetails = new PostalCodeDetails();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, postalCodeDetails, postalCodeDetails.getTag()).commit();
                }else if (position == 7){
                    HotelMain hotelMain = new HotelMain();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, hotelMain, hotelMain.getTag()).commit();
                }else if (position == 8){
                    LibraryMain libraryMain = new LibraryMain();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, libraryMain, libraryMain.getTag()).commit();
                }
            }
        });

        return rootView;
    }

}
