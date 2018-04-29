package com.techsajib.amaderbbaria.HomeProfile.Library;


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
import com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel.GovtHotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LibraryMain extends Fragment {

    ListView listView;
    ArrayList<LibraryIDRegister> listOfLibrary;
    private InterstitialAd interstitialAd;


    LinearLayout first;
    Animation uptodown;

    public LibraryMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.library_main, container, false);

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


        listView = (ListView) rootView.findViewById(R.id.libraryListView);
        listOfLibrary = new ArrayList<>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.libraryLinearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        for (int i = 1; i<33; i++){
             int id = i+1;
             int logo = R.drawable.book;
             String library = "";
             String placed = "";
             String book = "";
             String location = "";

            if (i == 1){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " ব্রাহ্মণবাড়িয়া পাবলিক লাইব্রেরি";
                placed = " ১৯৬৫ সাল";
                book = " ৭৪৫৪টি বই";
                location = " ফারুকী পার্ক, মৌড়াইল, সদর";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " সমাজ উন্নয়ন পাঠাগার";
                placed = " ১১/১১/২০১৬";
                book = " ৯৫০টি বই";
                location = " ১৮, সবুজবাগ, মেড্ডা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " তিতাস সংস্কৃতি সংগঠন ও পাঠাগার";
                placed = " ০৫/০৭/২০১৬";
                book = " ৮৭০টি বই";
                location = " ২২৭, মেড্ডা, ব্রাহ্মণবাড়িয়া";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " লাইট হাউজ";
                placed = " ২০১৩ সাল";
                book = " ২০০০টি বই";
                location = " পশ্চিম পাইকপাড়া, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " রিপন গণগ্রন্থাগার";
                placed = " ২৫/০২/২০০৮";
                book = " ১৫০০টি বই";
                location = " উচালিয়া পাড়া মোড়, সরাইল";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " পাবলিক লাইব্রেরি";
                placed = " ০২/০৬/১৯৮০";
                book = " ১৫০০টি বই";
                location = " সরাইল উপজেলা চত্তর, সরাইল";
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আলহাজ্ব আজদু মিয়া স্মৃতি পাঠাগার";
                placed = " ২১/০১/২০০৮";
                book = " ৫১৮টি বই";
                location = " পশ্চিম কুট্টাপাড়া, সরাইল";
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " সংস্কৃতি চর্চা কেন্দ্র";
                placed = " ০১/০১/২০১১";
                book = " ৫০০টি বই";
                location = " কাচারি পাড়া, সরাইল";
            }else if (i == 9){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " রশিদুলস্নাহ গণগ্রন্থাগার";
                placed = " ২৫/১০/২০০৪";
                book = " ১০৮৪টি বই";
                location = " কালিগচ্ছ বাজার, সরাইল";
            }else if (i == 10){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " শহীদ রঙ্গুমিয়া স্মৃতি পাঠাগার";
                placed = " ১০/০৮/২০১১";
                book = " ১২০টি বই";
                location = " শাহজাদাপুর, পশ্চিমপাড়া,সরাইল";
            }else if (i == 11){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " রহমান-মোবারক গণগ্রন্থাগার";
                placed = " ০১/০১/২০০৯";
                book = " ২০০০টি বই";
                location = " চুন্টাবাজার, সরাইল";
            }else if (i == 12){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " হারম্ন ডাক্তার স্মৃতি পাঠাগার";
                placed = " ২৬/১২/২০১০";
                book = " ৬৫০টি বই";
                location = " বড় দেওয়ান পাড়া, সরাইল";
            }else if (i == 13){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " সুফেরা বেগম স্মৃতি পাঠাগার";
                placed = " ১৫/০৪/২০১০";
                book = " ১২৫৭টি বই";
                location = " নোয়াগাঁও, সরাইল";
            }else if (i == 14){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " হাজী সানুমোলস্না স্মৃতি পাঠাগার";
                placed = " ২১/০১/২০১০";
                book = " ৬০০টি বই";
                location = " হাসপাতাল রোড, সরাইল";
            }else if (i == 15){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " ফিরোজ আলম মৃধা স্মৃতি পাঠাগার";
                placed = " ০৭/০৪/২০১০";
                book = " ৬০০টি বই";
                location = " উচালিয়া পাড়া, মৃধা বাড়ি, সরাইল";
            }else if (i == 16){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আব্দুর নূর স্মৃতি পাঠাগার";
                placed = " ১০/১০/২০১০";
                book = " ৭৫০টি বই";
                location = " সূর্যকান্দী, কালিকচ্ছ, সরাইল";
            }else if (i == 17){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আফজালুর রহমান গণপাঠাগার";
                placed = " ২১/০৬/২০০৯";
                book = " ৫৫০টি বই";
                location = " বাড়িউড়া, মজলিশপুর, সরাইল";
            }else if (i == 18){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আব্দুল মালেক স্মৃতি গণপাঠাগার";
                placed = " ০১/০১/২০১২";
                book = " ৫০০টি বই";
                location = " মনিরবাগ, কালিকচ্ছ, সরাইল";
            }else if (i == 19){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আদর্শ গণগ্রন্থাগার";
                placed = " ০৩/০৭/২০০৭";
                book = " ১২০০টি বই";
                location = " উচালিয়া পাড়া, সরাইল";
            }else if (i == 20){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আশুগঞ্জ পাবলিক লাইব্রেরি";
                placed = " ০৩/১০/১৯৯৭";
                book = " ১৯৪২টি বই";
                location = " আশুগঞ্জ, ব্রাহ্মণবাড়িয়া";
            }else if (i == 21){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " ইসলামিয়া পাঠাগার";
                placed = " ১৩/১১/১৯৭৮";
                book = " ৬৬৭টি বই";
                location = " সোহাগপুর, আশুগঞ্জ";
            }else if (i == 22){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " আতাউর রহমান স্মৃতি পাঠাগার";
                placed = " ০৬/০৪/১৯৯৯";
                book = " ৭৫০টি বই";
                location = " বাহাদুরপুর, আশুগঞ্জ";
            }else if (i == 23){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " খান্দুরা প্রতিভা সেবা সংঘ গ্রন্থাগার";
                placed = " ২০০১ সাল";
                book = " ৫০০টি বই";
                location = " খান্দুরা, ছাতিয়াইন, নাসিরনগর";
            }else if (i == 24){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " হরিশচন্দ্র বিশ্বাস স্মৃতি পাঠাগার";
                placed = " ২৬/০৬/২০১৬";
                book = " ১৫০০টি বই";
                location = " ভলাকুট, নাসিরনগর";
            }else if (i == 25){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " দি খড়মপুর রিডিং ক্লাব";
                placed = " ০১/০৪/১৯৩৮";
                book = " ৫০০টি বই";
                location = " খড়মপুর, আখাউড়া";
            }else if (i == 26){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " রাবিয়া খাতুন স্মৃতি পাঠাগার";
                placed = " ১৭/০৩/২০১৩";
                book = " ৮৮৭টি বই";
                location = " আখাউড়া চেকপোস্ট, আখাউড়া";
            }else if (i == 27){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " ধীরেন্দ্রনাথ দত্ত গণগ্রন্থাগার";
                placed = " ২০০২ সাল";
                book = " ৮৫০টি বই";
                location = " মির্জাপুর, বিজয়নগর";
            }else if (i == 28){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " মনেইম মাষ্টার পাবলিক লাইব্রেরি";
                placed = " ১২/১২/২০১২";
                book = " ৫২০টি বই";
                location = " হরষপুর, বিজয়নগর";
            }else if (i == 29){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " রামুটিয়া আদর্শ যুব সংঘ ও গণপাঠাগার";
                placed = " ২০১০ সাল";
                book = " ৫০০টি বই";
                location = " রামুটিয়া মুকুন্দপুর, বিজয়নগর";
            }else if (i == 30){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " নববিকাশ পাঠাগার";
                placed = " ০৩/০৮/২০০৮";
                book = " ৫৫০টি বই";
                location = " ভেলানগরম রূপসদী, বাঞ্ছারামপুর";
            }else if (i == 31){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " বর্ণী মেধাবিকাশ গণপাঠাগার";
                placed = " ০১/০১/২০০৬";
                book = " ২১০০টি বই";
                location = " বর্ণী,জামশেদপুর,কসবা";
            }else if (i == 32){
                id = i+1;
                logo = R.drawable.bookshelf;
                library = " রহমানিয়া সুফী ফাউন্ডেশন লাইব্রেরী";
                placed = " ০১/১০/২০০৮";
                book = " ৫৭০টি বই";
                location = " বীরগাঁও, নবীনগর";
            }

            LibraryIDRegister libraryIDRegister = new LibraryIDRegister(id, logo, library, placed, book, location);
            listOfLibrary.add(libraryIDRegister);

        }

        LibraryAdapter libraryAdapter = new LibraryAdapter(listOfLibrary,getActivity());
        listView.setAdapter(libraryAdapter);

        return rootView;
    }

}
