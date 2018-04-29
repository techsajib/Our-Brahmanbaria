package com.techsajib.amaderbbaria.OfficeBankList.NGOList;


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
import com.techsajib.amaderbbaria.DoctorHospital.GovtHospital.GovtHospitalIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NGOListMain extends Fragment {

    ListView listView;
    ArrayList<NGOIDRegister> listOfNGO;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public NGOListMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.ngo_ngo_list_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.ngoListView);
        listOfNGO = new ArrayList<NGOIDRegister>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.ngoLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<28; i++) {
            int id = i + 1;
            String ngoName = "";
            String director = "";
            String phone = "";
            String location = "";

            if (i == 1){
                 id = i + 1;
                 ngoName = " সংস্থার নাম: ব্রাক";
                 director = " ব্র্যাক জেলা প্রতিনিধি: দীপক বাবু";
                 phone = " 01730-350305";
                 location = " বিরাসার, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i + 1;
                ngoName = " সংস্থার নাম: শাপলা মানবিক উন্নয়ণ সংস্থা";
                director = " নির্বাহী পরিচালক: এস, এম, শাহীন";
                phone = " 01712-887325";
                location = " অস্তাচল নিবাস, মেড্ডা বাসষ্ট্যান্ড, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i + 1;
                ngoName = " সংস্থার নাম: প্রশিকা";
                director = " সমন্বয়কারী: হুমায়ুন কবীর";
                phone = " 01712-211198";
                location = " হালদারপাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i + 1;
                ngoName = " সংস্থার নাম: টি আই বি";
                director = " সমন্বয়কারী: খোদেজা বেগম";
                phone = " 01714-092841";
                location = " হালদারপাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i + 1;
                ngoName = " সংস্থার নাম: আশা";
                director = " ব্যবস্থাপক: শফিকুল ইসলাম";
                phone = " 01730-065059";
                location = " পশ্চিম মেড্ডা (ল’কলেজ সংলগ্ন) ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i + 1;
                ngoName = " সংস্থার নাম: গণ কল্যাণ কেন্দ্র";
                director = " নির্বাহী পরিচালক: মোহাম্মদ জয়নুল আলম";
                phone = " 01711-812841";
                location = " পশ্চিম মেড্ডা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 7){
                id = i + 1;
                ngoName = " সংস্থার নাম: পাঞ্জেরী সমাজ উন্নয়ণ সংস্থা";
                director = " নির্বাহী পরিচালক: মোঃ ইসহাক মিয়া";
                phone = " 01819-951932";
                location = " ওয়াপদা রোড, আশুগঞ্জ,ব্রাহ্মণবাড়িয়া।";
            }else if (i == 8){
                id = i + 1;
                ngoName = " সংস্থার নাম: শিখা সমাজ কল্যাণ সংস্থা";
                director = " নির্বাহী পরিচালক: রাজিয়া সুলতানা";
                phone = " 01729-879449";
                location = " কুন্ডা, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 9){
                id = i + 1;
                ngoName = " সংস্থার নাম: লাঙ্গলধর সমাজ কল্যাণ সংস্থা";
                director = " নির্বাহী পরিচালক: আজহারুল হক";
                phone = " 01711-894001";
                location = " নুরপুর, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 10){
                id = i + 1;
                ngoName = " সংস্থার নাম: সৃজন মানব কল্যান সংস্থা";
                director = " নির্বাহী পরিচালক: মানিক রতন শর্মা";
                phone = " 01717-461672";
                location = " ৫০১, মধ্যপাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 11){
                id = i + 1;
                ngoName = " সংস্থার নাম: ওয়াল্ড কনর্সান বাংলাদেশ";
                director = " নির্বাহী পরিচালক: লিল্টু বৈদ্য";
                phone = " 01718-565347";
                location = " রামরাইল, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 12){
                id = i + 1;
                ngoName = " সংস্থার নাম: স্বদেশি";
                director = " নির্বাহী পরিচালক: সৈয়দ আজিজুর রহমান";
                phone = " 01718-063631";
                location = " মেড্ডা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 13){
                id = i + 1;
                ngoName = " সংস্থার নাম: হ্যাবিট্যাড ব্রাহ্মণবাড়িয়া";
                director = " নির্বাহী পরিচালক: তমাস তুহিন দাস";
                phone = " 01711-052072";
                location = " ৩৯৬ মধ্যপাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i ==14 ){
                id = i + 1;
                ngoName = " সংস্থার নাম: তিতাস";
                director = " নির্বাহী পরিচালক: এমদাদুল বারী";
                phone = " 01711-052072";
                location = " আলিয়াবাদ নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 15){
                id = i + 1;
                ngoName = " সংস্থার নাম: নবীনগর পশ্চিম কল্যাণ সমিতি";
                director = " নির্বাহী পরিচালক: আশিকুর রহমান";
                phone = " 01714-228120";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া। ";
            }else if (i == 16){
                id = i + 1;
                ngoName = " সংস্থার নাম: পল্লী বিকাশ কেন্দ্র";
                director = " নির্বাহী পরিচালক: হুমাযুন কবীর";
                phone = " 01712-191783";
                location = " আটিয়ারা, শিবপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 17){
                id = i + 1;
                ngoName = " সংস্থার নাম: এসোসিয়েশন ফর রুরাল ডেভেলপমেন্ট";
                director = " নির্বাহী পরিচালক: ইয়াসমিন জাহান";
                phone = " 01726-319944";
                location = " ২৮০ মুন্সেফ পাড়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 18){
                id = i + 1;
                ngoName = " সংস্থার নাম: ঈশা সমাজ কল্যাণ সংস্থা";
                director = " নির্বাহী পরিচালক: এস. সি তাপসী রায়";
                phone = " 01815-201749";
                location = " ভলাকুট, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 19){
                id = i + 1;
                ngoName = " সংস্থার নাম: নিরাপদ ইসলামী গ্রাম উন্নয়ন সংস্থা";
                director = " নির্বাহী পরিচালক: নূরে আলম সিদ্দিকী";
                phone = " 01712-248957";
                location = " শাহবাজপুর, সরাইল, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 20){
                id = i + 1;
                ngoName = " সংস্থার নাম: ব্রীজ";
                director = " নির্বাহী পরিচালক: দেলেয়ার হোসেন";
                phone = " 01716-217177";
                location = " কুটি বাজার, কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 21){
                id = i + 1;
                ngoName = " সংস্থার নাম: ব্রাহ্মণবাড়িয়া পরিবেশ উন্নয়ন সোসাইটি";
                director = " নির্বাহী পরিচালক: আলমগীর তালুকদার";
                phone = " 01711-978989";
                location = " বাগানবাড়ি,  ব্রাহ্মণবাড়িয়া।";
            }else if (i == 22){
                id = i + 1;
                ngoName = " সংস্থার নাম: মানব কল্যাণ সংস্থা";
                director = " নির্বাহী পরিচালক: আব্দুল আউয়াল";
                phone = " 01711-894033";
                location = " সলিমাবাদ, বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 23){
                id = i + 1;
                ngoName = " সংস্থার নাম: সমাজ প্রগতি সংস্থা";
                director = " নির্বাহী পরিচালক: শফিউল আলম";
                phone = " 01712-514002";
                location = " নোয়াগাঁও কালিকচ্ছ, সরাইল,ব্রাহ্মণবাড়িয়া।";
            }else if (i == 24){
                id = i + 1;
                ngoName = " সংস্থার নাম: সমাজ  উন্নয়ণ কেন্দ্র ";
                director = " নির্বাহী পরিচালক: মোঃ মমিন হোসেন";
                phone = " 01711-456813";
                location = " বুড্ডা পাড়া, সরাইল, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 25){
                id = i + 1;
                ngoName = " সংস্থার নাম: পূবালী সমাজ উন্নয়ণ সংস্থা";
                director = " নির্বাহী পরিচালক: মোঃ জাকির হোসেন";
                phone = " 01710-669940";
                location = " গাজারিয়া, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 26){
                id = i + 1;
                ngoName = " সংস্থার নাম: জণকল্যাণ সংস্থা";
                director = " নির্বাহী পরিচালক: শরিফউদ্দিন মোল্লা";
                phone = " 01715-257340";
                location = " সরাইল বাজার, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 27){
                id = i + 1;
                ngoName = " সংস্থার নাম: ভাটি উন্নয়ণ সংস্থা";
                director = " নির্বাহী পরিচালক: আমিনুল ইসলাম";
                phone = " 01712-408140";
                location = " চাতলপাড়া, নাসিরনগর, ব্রাহ্মণবাড়িয়া।";
            }

            NGOIDRegister ngoidRegister = new NGOIDRegister(id, ngoName, director, phone, location);
            listOfNGO.add(ngoidRegister);
        }

            NGOAdapter ngoAdapter = new NGOAdapter(listOfNGO, getActivity());
            listView.setAdapter(ngoAdapter);
            return rootView;
    }

}
