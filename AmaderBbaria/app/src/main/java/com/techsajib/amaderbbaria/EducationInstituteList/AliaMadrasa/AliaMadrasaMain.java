package com.techsajib.amaderbbaria.EducationInstituteList.AliaMadrasa;


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
import com.techsajib.amaderbbaria.EducationInstituteList.EngineeringCollege.EngineeringCollegeIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AliaMadrasaMain extends Fragment {

    ListView listView;
    ArrayList<AliaMadrasaIDRegister> listOfAliaMadrasa;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public AliaMadrasaMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.edu_alia_madrasa_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.aliaMadrasaListView);
            listOfAliaMadrasa = new ArrayList<AliaMadrasaIDRegister>();


            //for animation section
            first = (LinearLayout) rootView.findViewById(R.id.aliaMadrasaLinearLayout);
            uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
            first.setAnimation(uptodown);

            for (int i = 1; i<46; i++) {
                int id = i + 1;
                int logo = R.drawable.book;
                String college = "";
                String placed = "";
                String location = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ব্রাহ্মণবাড়িয়া ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ০১/০১/১৯৭৯ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ঘাটিয়ারা আলিম মাদ্রাসা";
                placed = " ০৫/০১/১৯৯৪ সালে প্রতিষ্ঠিত হয়।";
                location = " ঘাটিয়ারা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ব্রাহ্মণবাড়িয়া মডেল দাখিল মাদ্রাসা";
                placed = " ২০০৫ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ভাদুঘর ডি.এস.কামিল মাদ্রাসা";
                placed = " ০১/০১/১৯৬৪ সালে প্রতিষ্ঠিত হয়।";
                location = " ভাদুঘর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " কোড্ডা গাউছিয়া দাখিল মাদরাসা";
                placed = " ০৬/১১/১৯৯৩ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " বিরামপুর ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ফজলুল হক বহুমুখী দাখিল মাদ্রাসা";
                placed = " ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " মিফতাহুল ফালাহ কফিল উদ্দীন দাখিল মাদ্রাসা";
                placed = " ১৫/১০/২০০৪ সালে প্রতিষ্ঠিত হয়।";
                location = " সুলতানপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 9){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " বড়হরন ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ০১/০১/১৯৮৪ সালে প্রতিষ্ঠিত হয়।";
                location = " নাটাই, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 10){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " সরাইল রাহমাতুল্লিল আলামিন দাখিল মাদ্রাসা";
                placed = " ";
                location = " সরাইল, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 11){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " চরচারতলা আলিয়া মাদ্রাসা";
                placed = " ";
                location = " চরচারতলা, আশুগঞ্জ।";
            }else if (i == 12){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " আড়াইসিধা কামিল (এম,এ) মাদরাসা";
                placed = " ১৯৩২ সালে প্রতিষ্ঠিত হয়।";
                location = " আড়াইসিধা, আশুগঞ্জ।";
            }else if (i == 13){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " খোলাপাড়া উমেদ আলী শাহ দাখিল মাদ্রাসা";
                placed = " ১৫/০৬/১৯৯০ সালে প্রতিষ্ঠিত হয়।";
                location = " শরীফপুর, আশুগঞ্জ।";
            }else if (i == 14){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " তালশহর করিমিয়া ফাজিল মাদ্রাসা";
                placed = " ১৯৪৯  সালে প্রতিষ্ঠিত হয়। ";
                location = " তালশহর, আশুগঞ্জ।";
            }else if (i == 15){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " তারুয়া ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ২০০২ সালে প্রতিষ্ঠিত হয়।";
                location = " তারুয়া, আশুগঞ্জ।";
            }else if (i == 16){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ফান্দাউক মদিনাতুল উলুম দাখিল মাদ্রাসা";
                placed = " ";
                location = " ফান্দাউক, নাসিরনগর।";
            }else if (i == 17){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " দাতঁমন্ডল এরফানিয়া আলিম মাদ্রাসা";
                placed = " ১৯৫০ সালে প্রতিষ্ঠিত হয়।";
                location = " দাতঁমন্ডল, নাসিরনগর।";
            }else if (i == 18){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " হরিপুর সুন্নিয়া দাখিল মাদ্রাসা";
                placed = " ৯৭৪ সালে প্রতিষ্ঠিত হয়।";
                location = " হরিপুর, নাসিরনগর।";
            }else if (i == 19){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " ধরমন্ডল দ্রাখিল মাদ্রাসা";
                placed = " ";
                location = " ধরমন্ডল, নাসিরনগর।";
            }else if (i == 20){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " রতনপুর ফাজিলিয়া দাখিল মাদরাসা";
                placed = " ";
                location = " রতনপুর, চাতলপাড়, নাসিরনগর।";
            }else if (i == 21){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " কসবা মহিলা দাখিল মাদরাসা";
                placed = " ০১/০১/১৯৯৮ সালে প্রতিষ্ঠিত হয়।";
                location = " কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 22){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " মইনপুর মদিনাতুল উমুল দাখিল মাদ্রাসা";
                placed = " ১৯৮০ সালে প্রতিষ্ঠিত হয়।";
                location = " মইনপুর, কসবা।";
            }else if (i == 23){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " সোনারগাঁও জিলানীয়া আলিম মাদ্রাসা";
                placed = " ০১/০১/১৯৫৭ সালে প্রতিষ্ঠিত হয়।";
                location = " সোনারগাঁও, কসবা।";
            }else if (i == 24){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " শ্যামবাড়ী ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ০১/০১/১৯৯৭  সালে প্রতিষ্ঠিত হয়।";
                location = " শ্যামবাড়ী, কসবা।";
            }else if (i == 25){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " শ্রীপুর মদিনাতুল উমুল দাখিল মাদ্রাসা";
                placed = " ০১/০১/১৯৯০ সালে প্রতিষ্ঠিত হয়।";
                location = " শ্রীপুর, কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 26){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " শিমরাইল সাতপাড়া দাখিল মাদ্রাসা";
                placed = " ১৯৭৭ সালে প্রতিষ্ঠিত হয়।";
                location = " শিমরাইল, কসবা।";
            }else if (i == 27){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " মেহারী ওবাইদিয়া ফাযিল মাদ্রাসা";
                placed = " ১৯৮৬ সালে প্রতিষ্ঠিত হয়।";
                location = " কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 28){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " নেমতাবাদ ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ১৯৯০ সালে প্রতিষ্ঠিত হয়।";
                location = " কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 29){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " চৌবেপুর আলহাজ্ব শাহ আলম দাখিল মাদ্রাসা";
                placed = " ১৯৮৫ সালে প্রতিষ্ঠিত হয়। ";
                location = " কসবা, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 30){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " মোহলস্না এহইয়াউল উলুম ইসলামীয়া মাদ্রাসা";
                placed = " ১৯৮৪ সালে প্রতিষ্ঠিত হয়।";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 31){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " দৌলতপুর কাশেমুল উলুম আলিম মাদ্রাসা";
                placed = " ০৩/০৩/১৯৩৫ সালে প্রতিষ্ঠিত হয়।";
                location = " দৌলতপুর, নবীনগর।";
            }else if (i == 32){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " শিবপুর ইউনিয়ন ইসলামিয়া দাখিল মাদ্রাসা";
                placed = " ২০০১ সালে প্রতিষ্ঠিত হয়।";
                location = " শিবপুর, নবীনগর।";
            }else if (i == 33){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " সলিমগঞ্জ আব্দুল ওয়াহাব দাখিল মাদ্রাসা";
                placed = " ০১/০১/১৯৮০ সালে প্রতিষ্ঠিত হয়।";
                location = " সলিমগঞ্জ, নবীনগর।";
            }else if (i == 34){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " রছুল্লাবাদ দাখিল মাদ্রাসা";
                placed = " ১৯৯৮ সালে প্রতিষ্ঠিত হয়।";
                location = " রছুল্লাবাদ, নবীনগর।";
            }else if (i == 35){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " সাতমোড়া দাখিল মাদ্রাসা";
                placed = " ১৯৮৪ সালে প্রতিষ্ঠিত হয়।";
                location = " নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 36){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " কালিকাপুর রাহমানিয়া দাখিল মাদ্রাসা";
                placed = " ১৯৯৩ সালে প্রতিষ্ঠিত হয়।";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 37){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " রূপসদী আলিম মাদ্রাসা";
                placed = " ১৯৯৭ সালে প্রতিষ্ঠিত হয়।";
                location = " রূপসদী, বাঞ্ছারামপুর।";
            }else if (i == 38){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " মাদরাসা আকবার আল উলুম আলিম মাদ্রাসা";
                placed = " ১২/৩/১৯৭৬ সালে প্রতিষ্ঠিত হয়।";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 39){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " বাঞ্ছারামপুর সোবহানিয়া ইসলামিয়া আলিম মাদ্রাসা";
                placed = " ১৯৮১ সালে প্রতিষ্ঠিত হয়।";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 40){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " শাহ্ রাহাত আলী দাখিল মাদ্রাসা";
                placed = " ";
                location = " বাঞ্ছারামপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 41){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " তেজখালী কাজী এম এ মালেক দাখিল মাদ্রাসা";
                placed = " ১৯৯৯ সালে প্রতিষ্ঠিত হয়।";
                location = " তেজখালী, বাঞ্ছারামপুর।";
            }else if (i == 42){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " আলহাজ্ব আমেনা বেগম কোরআন দাখিল মাদ্রাসা";
                placed = " ২০০০ সালে প্রতিষ্ঠিত হয়।";
                location = " ইসলামপুর, বুধন্তী, বিজয়নগর।";
            }else if (i == 43){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " কেনা ইসলামী আলীম মাদ্রাসা";
                placed = " ১৯৯৪ সালে প্রতিষ্ঠিত হয়।";
                location = " কেনা, বুধন্তী, বিজয়নগর।";
            }else if (i == 44){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " শ্রীপুর ইসলামিয়া ফাজিল মাদ্রাসা";
                placed = " ০১/০১/১৯৯০ সালে প্রতিষ্ঠিত হয়।";
                location = " শ্রীপুর, বিজয়নগর।";
            }else if (i == 45){
                id = i+1;
                logo = R.drawable.aliaicon;
                college = " হাজীপুর ইসলামীয়া সুন্নিয়া দাখিল মাদরাসা";
                placed = " ";
                location = " বিজয়নগর, ব্রাহ্মণবাড়িয়া।";
            }

            AliaMadrasaIDRegister aliaMadrasaIDRegister = new AliaMadrasaIDRegister(id, logo, college, placed, location);
            listOfAliaMadrasa.add(aliaMadrasaIDRegister);

        }
            AliaMadrasaAdapter aliaMadrasaAdapter = new AliaMadrasaAdapter(listOfAliaMadrasa, getActivity());
            listView.setAdapter(aliaMadrasaAdapter);
            return rootView;
    }

}
