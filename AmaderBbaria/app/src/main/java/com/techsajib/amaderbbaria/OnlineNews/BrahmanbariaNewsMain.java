package com.techsajib.amaderbbaria.OnlineNews;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BrahmanbariaNewsMain extends Fragment {

    Button amaderbrahmanbaria, dailybrahmanbaria, prothiknews, brahmanbarianews, dindarpon, ekusheralo, sarailnews, akhauranews, bijaynagarnews, bijaynagardotcom, ekattorkhobor, nabinagarnews;
    FragmentManager fragmentManager;

    public BrahmanbariaNewsMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.new_brahmanbaria_news_main, container, false);
        amaderbrahmanbaria = (Button) rootView.findViewById(R.id.amaderbrahmanbaria);
        dailybrahmanbaria = (Button) rootView.findViewById(R.id.dailybrahmanbaria);
        prothiknews = (Button) rootView.findViewById(R.id.pothiknews);
        brahmanbarianews = (Button) rootView.findViewById(R.id.brahmanbaria);
        dindarpon = (Button) rootView.findViewById(R.id.dindarpan);
        ekusheralo = (Button) rootView.findViewById(R.id.ekusheralo24);
        sarailnews = (Button) rootView.findViewById(R.id.sarailnews24);
        akhauranews = (Button) rootView.findViewById(R.id.akhaura);
        bijaynagarnews = (Button) rootView.findViewById(R.id.bijoynagarnews);
        bijaynagardotcom = (Button) rootView.findViewById(R.id.bijoynagarcom);
        ekattorkhobor = (Button) rootView.findViewById(R.id.ekattorkhobor);
        nabinagarnews = (Button) rootView.findViewById(R.id.nabinagarnews24);

        amaderbrahmanbaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AmaderBrahmanbaria.class);
                AmaderBrahmanbaria amaderBrahmanbaria = new AmaderBrahmanbaria();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, amaderBrahmanbaria, amaderBrahmanbaria.getTag()).commit();
            }
        });

        dailybrahmanbaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DailyBrahmanbaria.class);
                DailyBrahmanbaria dailyBrahmanbaria = new DailyBrahmanbaria();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, dailyBrahmanbaria, dailyBrahmanbaria.getTag()).commit();
            }
        });


        prothiknews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProthikNews.class);
                ProthikNews prothikNews = new ProthikNews();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, prothikNews, prothikNews.getTag()).commit();
            }
        });

        brahmanbarianews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BrahmanbariaNews.class);
                BrahmanbariaNews brahmanbariaNews = new BrahmanbariaNews();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, brahmanbariaNews, brahmanbariaNews.getTag()).commit();
            }
        });

        dindarpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DinDorpon.class);
                DinDorpon dinDorpon = new DinDorpon();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, dinDorpon, dinDorpon.getTag()).commit();
            }
        });

        ekusheralo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EkusherAlo.class);
                EkusherAlo ekusherAlo = new EkusherAlo();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ekusherAlo, ekusherAlo.getTag()).commit();
            }
        });

        sarailnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SarailNews24.class);
                SarailNews24 sarailNews24 = new SarailNews24();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sarailNews24, sarailNews24.getTag()).commit();
            }
        });

        akhauranews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AkhauraNews.class);
                AkhauraNews akhauraNews = new AkhauraNews();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, akhauraNews, akhauraNews.getTag()).commit();
            }
        });

        bijaynagarnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BijoynagarNews.class);
                BijoynagarNews bijoynagarNews = new BijoynagarNews();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bijoynagarNews, bijoynagarNews.getTag()).commit();
            }
        });

        bijaynagardotcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BijaynagarDotCom.class);
                BijaynagarDotCom bijaynagarDotCom = new BijaynagarDotCom();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bijaynagarDotCom, bijaynagarDotCom.getTag()).commit();
            }
        });

        ekattorkhobor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EkattorNews.class);
                EkattorNews ekattorNews = new EkattorNews();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ekattorNews, ekattorNews.getTag()).commit();
            }
        });

        nabinagarnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Nabinagarnews.class);
                Nabinagarnews nabinagarnews = new Nabinagarnews();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, nabinagarnews, nabinagarnews.getTag()).commit();
            }
        });

        return rootView;
    }

}
