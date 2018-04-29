package com.techsajib.amaderbbaria.HomeProfile.GeoGraphical;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeoGraphicalMain extends Fragment {

    LinearLayout first, second;
    Animation uptodown, downtoup;
    private InterstitialAd interstitialAd;

    private ExpandableListView mlistView;
    private ExpandableListAdapter mlistAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    private int lastExpandedPosition = -1;


    public GeoGraphicalMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.brahmanbaria_geo_graphical_history, container, false);
        mlistView = (ExpandableListView) rootView.findViewById(R.id.expandableID);
        initData();
        mlistAdapter = new GeoGraphicalAdapter(getActivity(), listDataHeader,listHash);
        mlistView.setAdapter(mlistAdapter);


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

        //for animation section
        /*second = (LinearLayout) rootView.findViewById(R.id.geographicalID);
        downtoup = AnimationUtils.loadAnimation(getActivity(),R.anim.downtoup);
        second.setAnimation(downtoup);*/


        mlistView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandedPosition !=-1 && groupPosition != lastExpandedPosition){
                    mlistView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });

        return rootView;
    }





    private void initData() {

        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("ভৌগলিক তথ্য");
        listDataHeader.add("ভৌগলিক সীমানা");
        listDataHeader.add("জনসংখ্যার তথ্য");
        listDataHeader.add("ভোটার পরিসংখ্যান");
        listDataHeader.add("জলবায়ু তথ্য");
        listDataHeader.add("রাজস্ব তথ্য");
        listDataHeader.add("সড়ক ও জনপথ তথ্য");
        listDataHeader.add("নদনদী সমূহ");


        List<String> countryData = new ArrayList<>();
        countryData.add("আয়তন == ১৯২৭.১১ কি. মি ");
        countryData.add("উপজেলা == ৯টি ");
        countryData.add("পৌরসভা == ৪টি");
        countryData.add("ইউনিয়ন == ১০০টি");
        countryData.add("গ্রাম == ১৩২৩টি");


        List<String> countryArea = new ArrayList<>();
        countryArea.add("উত্তরে == সিলেটের হবিগঞ্জ জেলা");
        countryArea.add("পূর্বে == ভারতের ত্রিপুরা রাজ্য");
        countryArea.add("দক্ষিণে == কুমিল্লা জেলা");
        countryArea.add("পশ্চিমে == নরসিংদী ও কিশোরগঞ্জ জেলা");



        List<String> population = new ArrayList<>();
        population.add("মোট জনসংখ্যা == ২৮,৪০,৪৯৮ জন");
        population.add("পুরুষ == ১৩,৬৬,৭১১ জন");
        population.add("নারী == ১৪,৭৬,৭৮৭ জন");
        population.add("পরিবার সংখ্যা == ৫,৩৮,৯৩৭ টি ");
        population.add("পরিবারের আকার == ৫.২৫ জন");
        population.add("স্বাক্ষরতার হার == ৪২.২৬% ");


        List<String> voter = new ArrayList<>();
        voter.add("মোট ভোটার সংখ্যা == ১৭,১২,৭৪৮ জন");
        voter.add("পুরুষ == ৮,৪৭,৩৩৪ জন");
        voter.add("মহিলা == ৮, ৬৫, ৪১৪ জন");


        List<String> environment = new ArrayList<>();
        environment.add("বৈশিষ্ট্য == আদ্র, নাতিশীতোষ্ণ, স্বাস্থ্যপ্রদ");
        environment.add("সর্বোচ্চ বৃষ্টিপাত == ১১৪.৬৫ ইঞ্চি");
        environment.add("সর্বনিম্ন বৃষ্টিপাত == ৫৬.৪৩ ইঞ্চি");
        environment.add("গড় বৃষ্টিপাত == ৭৮.০৬ ইঞ্চি ");


        List<String> govtData = new ArrayList<>();
        govtData.add("উপজেলা ভূমি অফিস == ৯টি");
        govtData.add("পৌর ভূমি অফিস == ১টি");
        govtData.add("ইউনিয়ন ভূমি অফিস == ৭৬টি");
        govtData.add("মৌজা == ৯১৩টি");
        govtData.add("ব্যবহৃত জমি == ১,৯২,৭৫৯.৫১ হেক্টর");
        govtData.add("অব্যবহৃত জমি == ৭,৫২৯.৯৩ হেক্টর");
        govtData.add("সরকারী ব্যবহৃত জমি == ৩,১৫৩.৭৫ হেক্টর");
        govtData.add("সরকারী অব্যবহৃত জমি == ৭.৫০ হেক্টর ");

        List<String> roadData = new ArrayList<>();
        roadData.add("জাতীয় মহাসড়ক == ৮২ কি.মি  ");
        roadData.add("আঞ্চলিক মহাসড়ক == ৮৩ কি.মি  (৭২ কি.মি  পাকা, ১১ কি.মি  কাঁচা)");
        roadData.add("জেলা সড়ক == ১০২ কি.মি (৯০ কি.মি পাকা, ১২ কি.মি কাঁচা)");
        roadData.add("উপজেলা সড়ক == ৪৫৬ কি.মি (২৬৯ কি.মি পাকা, ১৮৭ কি.মি কাঁচা)");
        roadData.add("ইউনিয়ন সড়ক == ৫৩৩ কি.মি (২৫৮ কি.মি পাকা, ২৭৫ কি.মি কাঁচা)");
        roadData.add("গ্রাম্য সড়ক == ১৭৭৬ কি.মি  (৩৩৩ কি.মি পাকা, ১৪৪২ কি.মি কাঁচা)");
        roadData.add("রেলপথ == ৭৫ কি.মি ");
        roadData.add("রেলস্টেশন == ১৪টি");
        roadData.add("রেল জংশন == ১টি");
        roadData.add("ব্রীজ == ১১৪টি");
        roadData.add("কালভার্ট == ১৭৯টি ");

        List<String> riverList = new ArrayList<>();
        riverList.add("তিতাস, মেঘনা, আউলিয়াজুরী, কালাছড়ি, খাস্তি, ছিনাইহানি, ডোলভাঙা, পুটিয়া, বলভদ্র, বলাক, বালিয়াজুড়ী, বালুয়া, বিজনা, বুড়ি, বেমালিয়া, মধ্যগঙ্গা, রোপা, লংঘুন, লাহুর, সোনাই, হাওড়া, হুরুল।");

        listHash.put(listDataHeader.get(0), countryData);
        listHash.put(listDataHeader.get(1), countryArea);
        listHash.put(listDataHeader.get(2), population);
        listHash.put(listDataHeader.get(3), voter);
        listHash.put(listDataHeader.get(4), environment);
        listHash.put(listDataHeader.get(5), govtData);
        listHash.put(listDataHeader.get(6), roadData);
        listHash.put(listDataHeader.get(7), riverList);

    }

}
