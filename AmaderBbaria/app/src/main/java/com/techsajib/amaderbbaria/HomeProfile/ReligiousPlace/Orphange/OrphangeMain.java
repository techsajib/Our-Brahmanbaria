package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Orphange;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque.MosqueIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrphangeMain extends Fragment {

    ListView listView;
    ArrayList<OrphangeIDRegister> listOfOrphange;

    LinearLayout first;
    Animation uptodown;


    public OrphangeMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.orphange_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.orphangetListView);
        listOfOrphange = new ArrayList<>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.orphangeLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);


        for (int i =1; i<41; i++) {
            int id = i + 1;
            int logo = R.drawable.orphangeschool;
            String orphange = "";
            String seat = "";
            String location = "";
         if (i==1){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " সরকারী শিশু পরিবার";
             seat = " ১০০টি";
             location = " তিতাস পাড়া, সদর";
        }else if (i==2){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " চিলোকুট ইসলামিয়া মাদ্রাসা ও এতিমখানা";
             seat = " ৪০টি";
             location = " চিলোকুট, বড়াইল, সদর";
         }else if (i==3){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " মরহুম মাসুদ রানা এতিমখানা কমপ্লেক্স";
             seat = " ৪৫টি";
             location = " পূর্ব ফুলবাড়িয়া, পাগাচং, সদর";
         }else if (i==4){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " মোহাম্মদী (সাঃ) এতিমখানা";
             seat = " ০৫টি";
             location = " মসজিদ মার্কেট, সদর";
         }else if (i==5){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " উত্তর সুহিলপুর এতিমখানা কমপ্লেক্স";
             seat = " ০৬টি";
             location = " উত্তর সুহিলপুর, সুহিলপুর, সদর";
         }else if (i==6){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " নরসিংহসার আমেনা বেগম এতিমখানা";
             seat = " ১১টি";
             location = " নরসিংহসার, সদর";
         }else if (i==7){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " মালিহাতা ইসলামিয়া তাজুল উলুম এতিমখানা";
             seat = " ০৩টি";
             location = " মালিহাতা, বুধল, সদর";
         }else if (i==8){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " আলহাজ্ব আমেনা বেগম দারুস কোরআন আবাসিক এতিমখানা";
             seat = " ৫০টি";
             location = " ইসলামপুর, বিজয়নগর, সদর";
         }else if (i==9){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " মোহামম্মদপুর ফয়েজ আহাম্মদ এতিমখানা হেফজ খানা";
             seat = " ১০টি";
             location = " মোহাম্মদপুর মাদ্রাসা, সদর";
         }else if (i==10){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " ইব্রাহিমপুর সুফি আজমত উল্লাহ (রঃ) এতিমখানা";
             seat = " ২২টি";
             location = " ইব্রাহিমপুর, নবীনগর";
         }else if (i==11){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " গোপাল পুর সুফিয়া খোরশেদিয়া এতিমখানা";
             seat = " ১৩টি";
             location = " গোপালপুর, নবীনগর";
         }else if (i==12){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " গুজিয়াখাই হাফেজিয়া ফোরকানিয়া এতিমখানা";
             seat = " ০৯টি";
             location = " গুজিয়াখাই, অরুয়াইল, নাসিরনগর";
         }else if (i==13){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " আতুকোরা এতিমখানা কমপ্লেক্স";
             seat = " ০৫টি";
             location = " আতুকোরা, ফান্দাউক, নাসিরনগর";
         }else if (i==14){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " জামিয়া ইসলামিয়া এতিমখানা";
             seat = " ৩০টি";
             location = " চরলহনিয়া, ভুরভুরিয়া, বাঞ্ছারামপুর";
         }else if (i==15){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " রূপসদী দারুল উলুম এতিমখানা";
             seat = " ৪০টি";
             location = " রূপসদী, বাঞ্ছারামপুর";
         }else if (i==16){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " দারুস সালাম এতিমখানা";
             seat = " ১৫টি";
             location = " জগন্নাথপুর, বাঞ্ছারামপুর";
         }else if (i==17){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " বিঞ্চুরামপুর শাহ খবিবীয়া এতিমখানা";
             seat = " ১৮টি";
             location = " বিঞ্চুরামপুর, বাঞ্ছারামপুর";
         }else if (i==18){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " ডোমরাকান্দি সুফিয়া দায়েমীয়া মুসলিম এতিমখানা";
             seat = " ১৯টি";
             location = " ডোমরাকান্দি, বাঞ্ছারামপুর";
         }else if (i==19){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " বাহের চর দারুল উলুম এতিমখানা";
             seat = " ০৯টি";
             location = " বাহের চর, বাহের চর, বাঞ্ছারামপুর";
         }else if (i==20){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " সৈয়দা বাদ তৈয়বীয়া এতিমখানা";
             seat = " ০৭টি";
             location = " দড়ি ভেলানগর, ছয়ফুল্লাহ কান্দি, বাঞ্ছারামপুর";
         }else if (i==21){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " দরিয়া দৌলত উত্তর পাড়া এতিমখানা";
             seat = " ০২টি";
             location = " দরিয়া দৌলত, বাঞ্ছারামপুরম্ন";
         }else if (i==22){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " আড়াইবাড়ি ইসলামিয়া ছায়েদিয়া এতিমখানা";
             seat = " ৩৬টি";
             location = " আড়াইবাড়ি, কসবা, কসবা";
         }else if (i==23){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " খাড়েরা শুফি সদরিয়া খালেকিয়া এতিমখানা";
             seat = " ২৫টি";
             location = " খাড়েরা, কসবা";
         }else if (i==24){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " আলহাজ্ব আঙ্গুরা বাশার এতিমখানা";
             seat = " ২২টি";
             location = " জমসেরপুর, কসবা";
         }else if (i==25){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " বাড়াই কুতবিয়া এতিমখানা কমপ্লেক্স";
             seat = " ০৫টি";
             location = " বাড়াই, কসবা";
         }else if (i==26){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " পুরকুইল আলহাজ্ব হাবিব চিশতি এতিমখানা";
             seat = " ১১টি";
             location = " পুরকুইল, খেওড়া, কসবা";
         }else if (i==27){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " দারুস সুন্নাহ এতিমখানা";
             seat = " ১৪টি";
             location = " চাপিয়া, কসবা, কসবা";
         }else if (i==28){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " মনিচং চান্দাইসার সুন্নি হাফেজিয়া এতিমখানা";
             seat = " ১০টি";
             location = " মনিচং, চান্দাইসার, কসবা";
         }else if (i==29){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " খাড়েরা আল আমিন বাড়িয়া মরহুমা রহিমা খাতুন এতিমখানা";
             seat = " ০৭টি";
             location = " খাড়েরা, কসবা";
         }else if (i==30){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " নরসিংহপুর হাফিজিয়া মাদ্রাসা ও ফোরকানিয়া এতিমখানা";
             seat = " ১৮টি";
             location = " নরসিংহপুর, চুন্টা, সরাইল";
         }else if (i==31){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " পাক শিমূল ফোরকানিয়া ইসলামিয়া এতিমখানা";
             seat = " ১১টি";
             location = " পাকশিমূল, অরুয়াইল, সরাইল";
         }else if (i==32){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " টি-ঘর মহিউসুন্নাহ এতিমখানা";
             seat = " ১১টি";
             location = " টি ঘর, সরাইল";
         }else if (i==33){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " উচালিয়া পাড়া তাজবিদুল কোরআন হোসাইনিয়া এতিমখানা";
             seat = " ১০টি";
             location = " উচালিয়া পাড়া, সরাইল";
         }else if (i==34){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " হোসাইনিয়া মতিউল উলুম ফোরকানিয়া মাদ্রাসা ও এতিমখানা";
             seat = " ০৫টি";
             location = " তেরকান্দা, সরাইল";
         }else if (i==35){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " গুইস্বর হাফেজিয়া ফোরকানিয়া এতিমখানা";
             seat = " ০৯টি";
             location = " গুইস্বর, চুন্টা, সরাইল";
         }else if (i==36){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " দল্লা দারুন সালাম এতিমখানা";
             seat = " ০৯টি";
             location = " দল্লা, নোয়াগাও, সরাইল";
         }else if (i==37){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " আড়াই সিধা মান্নানিয়া হাফেজিয়া এতিমখানা";
             seat = " ২৯টি";
             location = " আড়াইসিধা, আশুগঞ্জ";
         }else if (i==38){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " সুফি আব্দুজ্জ জাহের এতিমখানা";
             seat = " ২৫টি";
             location = " আড়াইসিধা, আশুগঞ্জ";
         }else if (i==39){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " সোহাগপুর ফোরকানিয়া হাফেজিয়া এতিমখানা";
             seat = " ১৬টি";
             location = " সোহাগপুর, বাহাদুর পুর, আশুগঞ্জ";
         }else if (i==40){
             id = i + 1;
             logo = R.drawable.orphangeschool;
             orphange = " আল আমিন গাউছিয়া এতিমখানা";
             seat = " ০৭টি";
             location = " রানীখা, গোলখার, আখাউড়া";
         }


         OrphangeIDRegister orphangeIDRegister = new OrphangeIDRegister(id, logo, orphange, seat, location);
            listOfOrphange.add(orphangeIDRegister);
        }

        OrphangeAdapter orphangeAdapter = new OrphangeAdapter(listOfOrphange, getActivity());
        listView.setAdapter(orphangeAdapter);
        return rootView;
    }

}
