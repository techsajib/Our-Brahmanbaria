package com.techsajib.amaderbbaria.HomeProfile.PostalCode;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.District;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostalCodeDetails extends Fragment {

    LinearLayout first;
    Animation uptodown;
    private InterstitialAd interstitialAd;

    ListView listView;
    ArrayList<PostCodeRegister> listOfPostalCode;


    public PostalCodeDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.postal_code_details, container, false);

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


        listView = (ListView) rootView.findViewById(R.id.postalCodeListView);
        listOfPostalCode = new ArrayList<>();


        first = (LinearLayout) rootView.findViewById(R.id.postalCodeLayout);

        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);

        first.setAnimation(uptodown);


        for (int i =1; i<28; i++){
            int id = i+1;
            String postOfficeData = "";
            String postCodeData = "";
            String thanaOfficeData = "";

            if (i==1){
                id = i+1;
                postOfficeData = "পোস্ট অফিস";
                postCodeData = "পোস্ট কোড";
                thanaOfficeData = "থানা";
            }else if (i==2){
                id = i+1;
                postOfficeData = "সদর";
                postCodeData = "৩৪০০";
                thanaOfficeData = "সদর";
            }else if (i==3){
                id = i+1;
                postOfficeData = "তালশহর";
                postCodeData = "৩৪০১";
                thanaOfficeData = "সদর";
            }else if (i==4){
                id = i+1;
                postOfficeData = "আশুগঞ্জ";
                postCodeData = "৩৪০২";
                thanaOfficeData = "সদর";
            }else if (i==5){
                id = i+1;
                postOfficeData = "আশুগঞ্জ শেয়ার";
                postCodeData = "৩৪০৩";
                thanaOfficeData = "সদর";
            }else if (i==6){
                id = i+1;
                postOfficeData = "পুনিয়াউট";
                postCodeData = "৩৪০৪";
                thanaOfficeData = "সদর";
            }else if (i== 7){
                id = i+1;
                postOfficeData = "নবীনগর";
                postCodeData = "৩৪১০";
                thanaOfficeData = "নবীনগর";
            }else if (i== 8){
                id = i+1;
                postOfficeData = "লাউরফতেহপুর";
                postCodeData = "৩৪১১";
                thanaOfficeData = "নবীনগর";
            }else if (i== 9){
                id = i+1;
                postOfficeData = "রছুল্লাবাদ";
                postCodeData = "৩৪১২";
                thanaOfficeData = "নবীনগর";
            }else if (i== 10){
                id = i+1;
                postOfficeData = "শ্যামগ্রাম";
                postCodeData = "৩৪১৩";
                thanaOfficeData = "নবীনগর";
            }else if (i== 11){
                id = i+1;
                postOfficeData = "রতনপুর";
                postCodeData = "৩৪১৪";
                thanaOfficeData = "নবীনগর";
            }else if (i== 12){
                id = i+1;
                postOfficeData = "শাহ্পুর";
                postCodeData = "৩৪১৫";
                thanaOfficeData = "নবীনগর";
            }else if (i== 13){
                id = i+1;
                postOfficeData = "কাইতলা";
                postCodeData = "৩৪১৭";
                thanaOfficeData = "নবীনগর";
            }else if (i== 14){
                id = i+1;
                postOfficeData = "সলিমগঞ্জ";
                postCodeData = "৩৪১৮";
                thanaOfficeData = "নবীনগর";
            }else if (i== 15){
                id = i+1;
                postOfficeData = "জীবনগঞ্জ";
                postCodeData = "৩৪১৯";
                thanaOfficeData = "নবীনগর";
            }else if (i== 16){
                id = i+1;
                postOfficeData = "বাঞ্ছারামপুর";
                postCodeData = "৩৪২০";
                thanaOfficeData = "বাঞ্ছারামপুর";
            }else if (i== 17){
                id = i+1;
                postOfficeData = "সরাইল";
                postCodeData = "৩৪৩০";
                thanaOfficeData = "সরাইল";
            }else if (i== 18){
                id = i+1;
                postOfficeData = "শাহবাজপুর";
                postCodeData = "৩৪৩১";
                thanaOfficeData = "সরাইল";
            }else if (i== 19){
                id = i+1;
                postOfficeData = "চান্দুরা";
                postCodeData = "৩৪৩২";
                thanaOfficeData = "সরাইল";
            }else if (i== 20){
                id = i+1;
                postOfficeData = "আখাউড়া";
                postCodeData = "৩৪৫০";
                thanaOfficeData = "আখাউড়া";
            }else if (i== 21){
                id = i+1;
                postOfficeData = "আজমপুর";
                postCodeData = "৩৪৫১";
                thanaOfficeData = "আখাউড়া";
            }else if (i== 22){
                id = i+1;
                postOfficeData = "গঙ্গাসাগর";
                postCodeData = "৩৪৫২";
                thanaOfficeData = "আখাউড়া";
            }else if (i== 23){
                id = i+1;
                postOfficeData = "কসবা";
                postCodeData = "৩৪৬০";
                thanaOfficeData = "কসবা";
            }else if (i== 24){
                id = i+1;
                postOfficeData = "কুটি";
                postCodeData = "৩৪৬১";
                thanaOfficeData = "কসবা";
            }else if (i== 25){
                id = i+1;
                postOfficeData = "চান্দিদ্বার";
                postCodeData = "৩৪৬২";
                thanaOfficeData = "কসবা";
            }else if (i== 26){
                id = i+1;
                postOfficeData = "চারগাছ";
                postCodeData = "৩৪৬৩";
                thanaOfficeData = "কসবা";
            }else if (i== 27){
                id = i+1;
                postOfficeData = "গোপীনাথপুর";
                postCodeData = "৩৪৬৪";
                thanaOfficeData = "কসবা";
            }

            PostCodeRegister postCodeRegister = new PostCodeRegister(postOfficeData, postCodeData, thanaOfficeData, id);
            listOfPostalCode.add(postCodeRegister);
        }

            PostCodeAdapter postCodeAdapter = new PostCodeAdapter(listOfPostalCode, getActivity());
            listView.setAdapter(postCodeAdapter);

        return rootView;
    }

}
