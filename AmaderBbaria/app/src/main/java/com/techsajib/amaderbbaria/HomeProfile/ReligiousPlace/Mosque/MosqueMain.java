package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MosqueMain extends Fragment {

    ListView listView;
    ArrayList<MosqueIDRegister> listOfMosque;

    LinearLayout first;
    Animation uptodown;

    public MosqueMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.mosque_main, container, false);
        listView = (ListView) rootView.findViewById(R.id.mosquetListView);
            listOfMosque = new ArrayList<>();


            //for animation section
            first = (LinearLayout) rootView.findViewById(R.id.mosqueLiniearLayout);
            uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
            first.setAnimation(uptodown);


            for (int i =1; i<68; i++){
                int id = i+1;
                int logo = R.drawable.mosqueicon;
                String library = "";
                String placed = "";
                String location = "";

            if (i == 1){
                 id = i+1;
                 logo = R.drawable.mosque;
                 library = " জেলা জামে মসজিদ";
                 placed = " ";
                 location = " মসজিদরোড, সদর";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.mosque;
                library = " মার্কাজ নুর জামে মসজিদ";
                placed = " ১৪১৮ হিজরী";
                location = " পশ্চিমমেড্ডা, মার্কাজপাড়া, সদর";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.mosque;
                library = " আনসার মুক্তার বাড়ি জামে মসজিদ";
                placed = " ১৩৩৩ হিজরী";
                location = " পশ্চিমমেড্ডা, আনসার মুক্তার বাড়ি, সদর";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বায়তুস সালাম জামে মসজিদ";
                placed = " ১৯৪৯ খ্রিঃ";
                location = " পূর্বমেড্ডা, সদর";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.mosque;
                library = " সৈয়দ সিরাজ শাহাবউদ্দিন জামে মসজিদ";
                placed = " ১৭৮৯ খ্রিঃ";
                location = " শেরপুর";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.mosque;
                library = " থানা আরেফিয়া জামে মসজিদ";
                placed = " ১৮০৫ খ্রিঃ";
                location = " থানা পাড়া, সদর";
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কাছারী মসজিদ";
                placed = " ১৯০৫ খ্রিঃ";
                location = " কাছারী পাড়, সদর";
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নয়নপুর জামে মসজিদ";
                placed = " ১৯১০ খ্রিঃ";
                location = " নয়নপুর, সদর";
            }else if (i == 9){
                id = i+1;
                logo = R.drawable.mosque;
                library = " পুনিয়াউট পুরাতন জামে মসজিদ";
                placed = " ১৮১০ খ্রিঃ";
                location = " নয়নপুর, সদর";
            }else if (i == 10){
                id = i+1;
                logo = R.drawable.mosque;
                library = " স্টেশন পুরাতন জামে মসজিদ";
                placed = " ১৯১০ খ্রিঃ";
                location = " মৌড়াইল, সদর";
            }else if (i == 11){
                id = i+1;
                logo = R.drawable.mosque;
                library = " জামে ইউনুসিয়া মাদ্রাসা মসজিদ";
                placed = " ১৯১৪ খ্রিঃ";
                location = " কান্দিপাড়া, সদর";
            }else if (i == 12){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কান্দিপাড়া জামে মসজিদ";
                placed = " ১৯০০ খ্রিঃ";
                location = " কান্দিপাড়া, সদর";
            }else if (i == 13){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বায়তুল কারিম জামে মসজিদ";
                placed = " ১৯০১খ্রিঃ";
                location = " পশ্চিমমেড্ডা, বড়বাড়ি, সদর";
            }else if (i == 14){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কাউতলী জামে মসজিদ";
                placed = " ১৯১৭ খ্রিঃ";
                location = " কাউতলী, সদর";
            }else if (i == 15){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ভাদুঘর শাহী জামে মসজিদ";
                placed = " ১৬৬৩ খ্রিঃ";
                location = " ভাদুঘর মধ্যপাড়া";
            }else if (i == 16){
                id = i+1;
                logo = R.drawable.mosque;
                library = " সরাইল শাহী জামে মসজিদ";
                placed = " ১৬৭০ খ্রিঃ";
                location = " উপজেলা বাজার, সরাইল";
            }else if (i == 17){
                id = i+1;
                logo = R.drawable.mosque;
                library = " আড়িফাইল মসজিদ";
                placed = " ১৬৬২ সাল";
                location = " আড়িফাইল, সরাইল";
            }else if (i == 18){
                id = i+1;
                logo = R.drawable.mosque;
                library = " সরাইল হাটখোলা মসজিদ";
                placed = " ১৬৬২ খ্রিঃ";
                location = " উপজেলা চত্বর, সরাইল";
            }else if (i == 19){
                id = i+1;
                logo = R.drawable.mosque;
                library = " উচালিয়াপাড়া জামে মসজিদ";
                placed = "";
                location = " উচালিয়াপাড়া, সরাইল";
            }else if (i == 20){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কুট্টাপাড়া বড় মসজিদ";
                placed = "";
                location = " কুট্টাপাড়া, সরাইল";
            }else if (i == 21){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কদমতলী জামে মসজিদ";
                placed = "";
                location = " কদমতলী, পূর্বভাগ, নাসিরনগর";
            }else if (i == 22){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বেলুয়া জামে মসজিদ";
                placed = "";
                location = " বেলুয়া, পূর্বভাগ, নাসিরনগর";
            }else if (i == 23){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ভুবন মাদ্রসা জামে মসজিদ";
                placed = "";
                location = " ভুবন,পূর্বভাগ, নাসিরনগর";
            }else if (i == 24){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নোয়াগাওঁ জামে মসজিদ";
                placed = "";
                location = " নোয়াগাওঁ, গোয়ালনগর, নাসিরনগর";
            }else if (i == 25){
                id = i+1;
                logo = R.drawable.mosque;
                library = " সোনাতুলা জামে মসজিদ";
                placed = "";
                location = " সোনাতুলা, গোয়ালনগর, নাসিরনগর";
            }else if (i == 26){
                id = i+1;
                logo = R.drawable.mosque;
                library = " গাড়াউক জামে মসজিদ";
                placed = "";
                location = " চাপরতলা, নাসিরনগর";
            }else if (i == 27){
                id = i+1;
                logo = R.drawable.mosque;
                library = " খান্দুরা  জামে মসজিদ";
                placed = "";
                location = " খান্দুরা, চাপরতলা, নাসিরনগর";
            }else if (i == 28){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ডিঘর জামে মসজিদ";
                placed = "";
                location = " ডিঘর, নাসিরনগর";
            }else if (i == 29){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ব্রাহ্মণশশান বয়তুল আকসাদ জামে মসজিদ";
                placed = "";
                location = " ব্রাহ্মণশশান, নাসিরনগর";
            }else if (i == 30){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কুন্ডা পুরাতন বাজার মসজিদ";
                placed = "";
                location = " কুন্ডা, নাসিরনগর";
            }else if (i == 31){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কসবা  কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " কসবা";
            }else if (i == 32){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নেয়ামতপুর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " নেয়ামতপুর, কসবা";
            }else if (i == 33){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নিবড়া কেন্দ্রীয় জামে মসিজদ";
                placed = "";
                location = " নিবড়া, কসবা";
            }else if (i == 34){
                id = i+1;
                logo = R.drawable.mosque;
                library = " শেরপুর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " চারগাছ, কসবা";
            }else if (i == 35){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কোল্লাপাথর জামে মসজিদ";
                placed = "";
                location = " কোল্লাপাথর, কসবা";
            }else if (i == 36){
                id = i+1;
                logo = R.drawable.mosque;
                library = " জয়পুর জামে মসজিদ";
                placed = "";
                location = " জয়পুর, কসবা";
            }else if (i == 37){
                id = i+1;
                logo = R.drawable.mosque;
                library = " চারগাছ কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " চারগাছ, কসবা";
            }else if (i == 38){
                id = i+1;
                logo = R.drawable.mosque;
                library = " মাওলাগঞ্জ বাজার জামে মসজিদ";
                placed = "";
                location = " মাওলাগঞ্জ, বাঞ্ছারামপুর";
            }else if (i == 39){
                id = i+1;
                logo = R.drawable.mosque;
                library = " দূর্গারামপুর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " দূর্গারামপুর, বাঞ্ছারামপুর";
            }else if (i == 40){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাঞ্ছারামপুর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " বাঞ্ছারামপুর";
            }else if (i == 41){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাঞ্ছারামপুর মডেল থানা জামে মসজিদ";
                placed = "";
                location = " বাঞ্ছারামপুর";
            }else if (i == 42){
                id = i+1;
                logo = R.drawable.mosque;
                library = " আলীপুর জামে মসজিদ";
                placed = "";
                location = " আলীপুর, বাঞ্ছারামপুর";
            }else if (i == 43){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ইমান নগর জামে মসজিদ";
                placed = "";
                location = " ইমান নগর, বাঞ্ছারামপুর";
            }else if (i == 44){
                id = i+1;
                logo = R.drawable.mosque;
                library = " জয়কালীপুর জামে মসজিদ";
                placed = "";
                location = " জয়কালীপুর, বাঞ্ছারামপুর";
            }else if (i == 45){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাইতুন আমান মসজিদ";
                placed = "";
                location = " দরিয়া দৌলত, বাঞ্ছারামপুর";
            }else if (i == 46){
                id = i+1;
                logo = R.drawable.mosque;
                library = " সোনারামপুর কেন্দ্রীয় মসজিদ";
                placed = "";
                location = " সোনারামপুর, বাঞ্ছারামপুর";
            }else if (i == 47){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ইমাম নগর বড় মসজিদ";
                placed = "";
                location = " দরিকান্দি, বাঞ্ছারামপুর";
            }else if (i == 48){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ফরদাবাদ বাজার মসজিদ";
                placed = "";
                location = " ফরদাবাদ, বাঞ্ছারামপুর";
            }else if (i == 49){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাইতুল জান্নাত জামে মসজিদ";
                placed = "";
                location = " মোগড়া, আখাউড়া";
            }else if (i == 50){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাইতুল মামুর জামে মসজিদ";
                placed = "";
                location = " মোগড়া, আখাউড়া";
            }else if (i == 51){
                id = i+1;
                logo = R.drawable.mosque;
                library = " মোগড়া কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " মোগড়া, আখাউড়া";
            }else if (i == 52){
                id = i+1;
                logo = R.drawable.mosque;
                library = " আদমপুর জামে মসজিদ";
                placed = "";
                location = " মোগড়া, আখাউড়া";
            }else if (i == 53){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাউতলা কেন্দ্রিয় জামে মসজিদ";
                placed = "";
                location = " মোগড়া, আখাউড়া";
            }else if (i == 54){
                id = i+1;
                logo = R.drawable.mosque;
                library = " জিকোন্টিয়া জামে মসজিদ";
                placed = "";
                location = " ধরখার, আখাউড়া";
            }else if (i == 55){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নুরপুর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " আখাউড়া দক্ষিন ইউনিয়ন";
            }else if (i == 56){
                id = i+1;
                logo = R.drawable.mosque;
                library = " আলিফ লাম জামে মসজিদ";
                placed = "";
                location = " আখাউড়া পৌরসভা";
            }else if (i == 57){
                id = i+1;
                logo = R.drawable.mosque;
                library = " খরমপুর মাজার জামে মসজিদ";
                placed = "";
                location = " আখাউড়া পৌরসভা";
            }else if (i == 58){
                id = i+1;
                logo = R.drawable.mosque;
                library = " তারাগন কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " আখাউড়া পৌরসভা";
            }else if (i == 59){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কাইতলা বাহার জামে মসজিদ";
                placed = "";
                location = " কাইতলা, নবীনগর";
            }else if (i == 60){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নীলনগর জামে মসজিদ";
                placed = "";
                location = " জিনোদপুর, নবীনগর";
            }else if (i == 61){
                id = i+1;
                logo = R.drawable.mosque;
                library = " কুড়িঘর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " নাটঘর, নবীনগর";
            }else if (i == 62){
                id = i+1;
                logo = R.drawable.mosque;
                library = " নাটঘর কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " নাটঘর, নবীনগর";
            }else if (i == 63){
                id = i+1;
                logo = R.drawable.mosque;
                library = " বাউচাইল কেন্দ্রীয় জামে মসজিদ";
                placed = "";
                location = " রতনপুর, নবীনগর";
            }else if (i == 64){
                id = i+1;
                logo = R.drawable.mosque;
                library = " শাহপুর জামে মসজিদ";
                placed = "";
                location = " রতনপুর, নবীনগর";
            }else if (i == 65){
                id = i+1;
                logo = R.drawable.mosque;
                library = " চম্পকনগর বাজার জামে মসজিদ";
                placed = "";
                location = " চম্পকনগর, বিজয়নগর";
            }else if (i == 66){
                id = i+1;
                logo = R.drawable.mosque;
                library = " সাতবর্গ শাহজালাল জামে মসজিদ";
                placed = "";
                location = " সাতবর্গ, বিজয়নগর";
            }else if (i == 67){
                id = i+1;
                logo = R.drawable.mosque;
                library = " ইসলামপুর কলেজ মসজিদ";
                placed = "";
                location = " ইসলামপুর, বিজয়নগর";
            }


            MosqueIDRegister mosqueIDRegister = new MosqueIDRegister(id, logo, library, placed, location);
            listOfMosque.add(mosqueIDRegister);
        }

        MosqueAdapter mosqueAdapter = new MosqueAdapter(listOfMosque, getActivity());
        listView.setAdapter(mosqueAdapter);

        return rootView;
    }

}
