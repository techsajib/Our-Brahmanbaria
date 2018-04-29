package com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity;


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
import com.techsajib.amaderbbaria.HomeProfile.Library.LibraryIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CollegeUniversityMain extends Fragment {

    ListView listView;
    ArrayList<CollegeUniversityIDRegister> listOfCollegeUniversity;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public CollegeUniversityMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.edu_college_university_main, container, false);

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

        listView = (ListView) rootView.findViewById(R.id.collegeUniversityListView);
            listOfCollegeUniversity = new ArrayList<>();


            //for animation section
            first = (LinearLayout) rootView.findViewById(R.id.collegeUniversityLinearLayout);
            uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
            first.setAnimation(uptodown);

            for (int i = 1; i<36; i++) {
                int id = i + 1;
                int logo = R.drawable.book;
                String college = "";
                String placed = "";
                String location = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " ব্রাহ্মণবাড়িয়া সরকারি কলেজ";
                placed = " ০১/০৭/১৯৪৮ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " কাজী মোহাম্মদ শফিকুল ইসলাম মহাবিদ্যালয়";
                placed = " ১৯৯৬ সালে প্রতিষ্ঠিত হয়।";
                location = " ইসলামপুর, বুধন্তী,  বিজয়নগর।";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " ফিরোজ মিয়া বিশ্ব বিদ্যালয় কলেজ";
                placed = " ১৯/০৯/১৯৯২ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, আশুগঞ্জ।";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " ব্রাহ্মণবাড়িয়া সরকারি মহিলা কলেজ";
                placed = " ১৯৬৪ সালে প্রতিষ্ঠিত হয়। ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " উবায়দুল মুকতাদির মহিলা কলেজ।";
                placed = " ২০১৭";
                location = " রেইল গেইট রোড, সদর।";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " চাতলপাড় ডিগ্রী কলেজ";
                placed = " ১৯৯৫ সালে প্রতিষ্ঠিত হয়।";
                location = " চাতলপাড়, নাসিরনগর।";
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " ড. রওশন আলম কলেজ";
                placed = " ০১/০১/১৯৯৫ সালে প্রতিষ্ঠিত হয়।";
                location = " ফরদাবাদ, বাঞ্ছারামপুর।";
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " বায়েক আলহাজ্ব শাহ আলম কলেজ";
                placed = " ০১/০১/১৯৯৯  সালে প্রতিষ্ঠিত হয়।";
                location = " বায়েক, কসবা।";
            }else if (i == 9){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " বাঞ্ছারামপুর ডিগ্রী মহাবিদ্যালয়";
                placed = " ১৯৭৩ সালে প্রতিষ্ঠিত হয়।";
                location = " উপজেলা সদর, বাঞ্ছারামপুর।";
            }else if (i == 10){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " তাজুল ইসলাম আর্দশ কলেজ";
                placed = " ১০/০৪/১৯৮৭ সালে প্রতিষ্ঠিত হয়।";
                location = " দরিকান্দি, জীবনগঞ্জ বাজার, বাঞ্ছারামপুর";
            }else if (i == 11){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " সলিমগঞ্জ কলেজ";
                placed = " ১৯৯১ সালে প্রতিষ্ঠিত হয়।";
                location = " সলিমগঞ্জ, নবীনগর।";
            }else if (i == 12){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আব্বাস উদ্দিন খান সোহাগপুর মডেল কলেজ";
                placed = " ০৭/১২/২০০৪ সালে প্রতিষ্ঠিত হয়।";
                location = " সোহাগপুর, আশুগঞ্জ।";
            }else if (i == 13){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আলহ্জ্ব আব্দুর রাজ্জাক একাডেমী স্কুল এন্ড কলেজ";
                placed = " ০১/০১/২০০৪ সালে প্রতিষ্ঠিত হয়। ";
                location = " রাধানগর, নবীনগর।";
            }else if (i == 14){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " সুর সম্রাট আলাউদ্দিন খাঁ মহাবিদ্যালয়";
                placed = " ১৯৯৫ সালে প্রতিষ্ঠিত হয়।";
                location = " উপজেলা সদর, নবীনগর।";
            }else if (i == 15){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " মিয়া আব্দুল্লাহ ওয়াজেদ মহিলা ডিগ্রী কলেজ";
                placed = " ১৯৯৫ সালে প্রতিষ্ঠিত হয়।";
                location = " কুটি, কসবা।";
            }else if (i == 16){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আবদুস সাত্তার ডিগ্রী কলেজ";
                placed = " ১৯৯৪ সালে প্রতিষ্ঠিত হয়।";
                location = " অরুয়াইল, সরাইল।";
            }else if (i == 17){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " নাসিরনগর ডিগ্রী মহাবিদ্যালয়";
                placed = " ১৯৮৭ সালে প্রতিষ্ঠিত হয়।";
                location = " নাসিরনগর।";
            }else if (i == 18){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আলীম উদ্দীন জোবেদা ডিগ্রী কলেজ";
                placed = " ১৯৭২ সালে প্রতিষ্ঠিত হয়।";
                location = " কাইতলা, নবীনগর।";
            }else if (i == 19){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " সরাইল ডিগ্রী কলেজ";
                placed = " ";
                location = " কালীকচ্ছ, সরাইল।";
            }else if (i == 20){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " সুজন দুলু কলেজ";
                placed = " ২০০২ সালে প্রতিষ্ঠিত হয়।";
                location = " রুপসদী, বাঞ্ছারামপুর";
            }else if (i == 21){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " ব্রাহ্মণবাড়িয়া পৌর ডিগ্রী কলেজ";
                placed = " ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 22){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " চিনাইর বঙ্গবন্ধু শেখ মুজিব ডিগ্রী কলেজ";
                placed = " ";
                location = " চিনাইর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 23){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " এ. মোনেম কলেজ";
                placed = " ০১/০৭/১৯৯৪  সালে প্রতিষ্ঠিত হয়।";
                location = " বিজেশ্বর , ব্রাহ্মণবাড়িয়া।";
            }else if (i == 24){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " সুহিলপুর আলহাজ্ব হারুন আলরশিদ কলেজ";
                placed = " ";
                location = " সুহিলপুর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 25){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আলহাজ্ব বেগম নুরুন্নাহার কলেজ";
                placed = " ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 26){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " ব্রাহ্মণবাড়িয়া সিটি মডেল কলেজ";
                placed = " ২০০৯ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 27){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " লায়ন ফিরোজুর রহমান রেসিঃ একাডেমি";
                placed = " ";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 28){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " বাংলাদেশ গ্যাস ফিল্ড স্কুল এন্ড কলেজ";
                placed = " ";
                location = " বিরাসার, ব্রাহ্মণবাড়িয়া। ";
            }else if (i == 29){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আইডিয়াল রেসিডেন্সিয়াল স্কুল এন্ড কলেজ";
                placed = " ২০০৫ সালে প্রতিষ্ঠিত হয়।";
                location = " সদর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 30){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " আশুগঞ্জ সারকারখানা স্কুল এন্ড কলেজ";
                placed = " ";
                location = " আশুগঞ্জ।";
            }else if (i == 31){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " তিন্নি আনোয়ার মহিলা কলেজ";
                placed = " ২০০৯ সালে প্রতিষ্ঠিত হয়।";
                location = " আশুগঞ্জ।";
            }else if (i == 32){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " কসবা মহিলা বিশ্ববিদ্যালয় কলেজ";
                placed = " ১৯৯৯ সালে প্রতিষ্ঠিত হয়।";
                location = " কসবা।";
            }else if (i == 33){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " চারগাছ এন. আই. ভূইয়া ডিগ্রি কলেজ";
                placed = " ০১/০১/১৯৭৩ সালে প্রতিষ্ঠিত হয়।";
                location = " চারগাছ, কসবা।";
            }else if (i == 34){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " সৈয়দাবাদ আদর্শ মহাবিদ্যালয়";
                placed = " ১৯৬৯  সালে প্রতিষ্ঠিত হয়।";
                location = " কসবা।";
            }else if (i == 35){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " চম্পকনগর মডেল স্কুল এন্ড কলেজ";
                placed = " ";
                location = " চম্পকনগর , বিজয়নগর।";
            }else if (i == 36){
                id = i+1;
                logo = R.drawable.universityicon;
                college = " কসবা টি আলী বিশ্ববিদ্যালয় কলেজ";
                placed = " ০১/০৭/১৯৮৫ সালে প্রতিষ্ঠিত হয়।";
                location = " কসবা।";
            }

            CollegeUniversityIDRegister collegeUniversityIDRegister = new CollegeUniversityIDRegister(id, logo, college, placed, location);
            listOfCollegeUniversity.add(collegeUniversityIDRegister);

        }
            CollegeUniversityAdapter collegeUniversityAdapter = new CollegeUniversityAdapter(listOfCollegeUniversity, getActivity());
            listView.setAdapter(collegeUniversityAdapter);
        return rootView;
    }

}
