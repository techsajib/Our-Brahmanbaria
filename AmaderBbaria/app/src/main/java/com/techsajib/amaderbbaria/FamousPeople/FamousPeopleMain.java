package com.techsajib.amaderbbaria.FamousPeople;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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
import com.techsajib.amaderbbaria.FamousPeople.Ashuganj.AbdulKadir;
import com.techsajib.amaderbbaria.FamousPeople.Bancharampur.AbulKalamMohammadJakaria;
import com.techsajib.amaderbbaria.FamousPeople.Bancharampur.AhmedAkborSubhan;
import com.techsajib.amaderbbaria.FamousPeople.Bancharampur.MohammadAsraful;
import com.techsajib.amaderbbaria.FamousPeople.Bancharampur.SirajulIslam;
import com.techsajib.amaderbbaria.FamousPeople.Bijoynagar.OliAhad;
import com.techsajib.amaderbbaria.FamousPeople.Kasba.AbdulHadi;
import com.techsajib.amaderbbaria.FamousPeople.Kasba.AnoarHosen;
import com.techsajib.amaderbbaria.FamousPeople.Kasba.MonirAhmedKhan;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.AbdusSattar;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.AbedHosenKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.AlauddinKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.AliAkborKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.AyetAliKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.BahadurAliKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.FojolSahabuddin;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.GuljarUddinAhmed;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.JulfikarHaidar;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.MirKasemKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.MobarokHosenKha;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.MofajjolHosen;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.MonmohonDotto;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.OtindroMohonRay;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.SadiKhan;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.ShahjahanSiddiki;
import com.techsajib.amaderbbaria.FamousPeople.Nabinagar.TusharAbdullah;
import com.techsajib.amaderbbaria.FamousPeople.Nasirnagar.Nasirnagar.AbdurRosol;
import com.techsajib.amaderbbaria.FamousPeople.Nasirnagar.Nasirnagar.MTajulIslam;
import com.techsajib.amaderbbaria.FamousPeople.Nasirnagar.Nasirnagar.MotiulIslam;
import com.techsajib.amaderbbaria.FamousPeople.Nasirnagar.Nasirnagar.SamsulHuda;
import com.techsajib.amaderbbaria.FamousPeople.Nasirnagar.Nasirnagar.SayedulIslam;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.AbdulKoddosMakhon;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.AbuSalehMohammadNasim;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.AlMahmud;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.AsrafAhmed;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.DirendronathDotto;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.KabirChowdhury;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.MuftiAmini;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.OdoitoMollobormon;
import com.techsajib.amaderbbaria.FamousPeople.Sadar.SakilAhmed;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.AhmedurRahman;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.AkborHosenBokol;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.HabiburRahmanMilon;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.IsaKha;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.NurulAmin;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.ObinashKumar;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.PayelThakur;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.PobitroKor;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.SheikhAbuHamed;
import com.techsajib.amaderbbaria.FamousPeople.Sarail.Sarail.UllashKorDotto;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FamousPeopleMain extends Fragment {

    ListView listView;
    ArrayList<FamousIDRegister> listOfFamousPeople;
    FragmentManager fragmentManager;
    private InterstitialAd interstitialAd;

    LinearLayout first;
    Animation uptodown;

    public FamousPeopleMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.famous_people_main, container, false);

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

        first = (LinearLayout) rootView.findViewById(R.id.famousLiniarLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);

        listView = (ListView) rootView.findViewById(R.id.famousListView);
        listOfFamousPeople = new ArrayList<>();

        for (int i = 0; i<50; i++) {
            int id = i + 1;
            int logo = R.drawable.man;
            String text = "";
            int icon = R.drawable.bracket;

            if (i == 0){
                id = i+1;
                logo = R.drawable.man;
                text = "ফখরে বাঙ্গাল তাজুল ইসলাম রহ.";
                icon = R.drawable.bracketwhite;
            }else if (i == 1){
                id = i+1;
                logo = R.drawable.man;
                text = "আল্লামা সিরাজুল ইসলাম";
                icon = R.drawable.bracketwhite;
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.man;
                text = "মুফতি ফজলুল হক আমিনী";
                icon = R.drawable.bracketwhite;
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.man;
                text = "অদ্বৈত মল্লবর্মণ";
                icon = R.drawable.bracketwhite;
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.man;
                text = "ধীরেন্দ্রনাথ দত্ত";
                icon = R.drawable.bracketwhite;
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.man;
                text = "আবদুল কুদ্দুস মাখন";
                icon = R.drawable.bracketwhite;
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.man;
                text = "কবীর চৌধুরী";
                icon = R.drawable.bracketwhite;
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.man;
                text = "আল মাহমুদ";
                icon = R.drawable.bracketwhite;
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.man;
                text = "আবু সালেহ মোহাম্মদ নাসিম";
                icon = R.drawable.bracketwhite;
            }else if (i == 9){
                id = i+1;
                logo = R.drawable.man;
                text = "জেনারেল শাকিল আহমেদ";
                icon = R.drawable.bracketwhite;
            }else if (i == 10){
                id = i+1;
                logo = R.drawable.man;
                text = "ড. আশরাফ আহমেদ";
                icon = R.drawable.bracketwhite;
            }else if (i == 11){
                id = i+1;
                logo = R.drawable.man;
                text = "ঈশা খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 12){
                id = i+1;
                text = "নুরুল আমিন";
                icon = R.drawable.bracketwhite;
            }else if (i == 13){
                id = i+1;
                logo = R.drawable.man;
                text = "উল্লাসকর দত্ত";
                icon = R.drawable.bracketwhite;
            }else if (i == 14){
                id = i+1;
                logo = R.drawable.man;
                text = "শেখ আবু হামেদ";
                icon = R.drawable.bracketwhite;
            }else if (i == 15){
                id = i+1;
                logo = R.drawable.man;
                text = "ডক্টর অবিনাশ চন্দ্র সেন";
                icon = R.drawable.bracketwhite;
            }else if (i == 16){
                id = i+1;
                logo = R.drawable.man;
                text = "পায়েল ঠাকুর";
                icon = R.drawable.bracketwhite;
            }else if (i == 17){
                id = i+1;
                logo = R.drawable.man;
                text = "হাবিবুর রহমান মিলন";
                icon = R.drawable.bracketwhite;
            }else if (i == 18){
                id = i+1;
                logo = R.drawable.man;
                text = "আহমেদুর রহমান";
                icon = R.drawable.bracketwhite;
            }else if (i == 19){
                id = i+1;
                logo = R.drawable.man;
                text = "সৈয়দ আকবর হোসেন";
                icon = R.drawable.bracketwhite;
            }else if (i == 20){
                id = i+1;
                logo = R.drawable.man;
                text = "পবিত্র কর";
                icon = R.drawable.bracketwhite;
            }else if (i == 21){
                id = i+1;
                logo = R.drawable.man;
                text = "আবদুল কাদির";
                icon = R.drawable.bracketwhite;
            }else if (i == 22){
                id = i+1;
                logo = R.drawable.man;
                text = "নবাব সৈয়দ শামসুল হুদা";
                icon = R.drawable.bracketwhite;
            }else if (i == 23){
                id = i+1;
                logo = R.drawable.man;
                text = "ব্যারিস্টার আব্দুর রসুল";
                icon = R.drawable.bracketwhite;
            }else if (i == 24){
                id = i+1;
                logo = R.drawable.man;
                text = "মতিউল ইসলাম";
                icon = R.drawable.bracketwhite;
            }else if (i == 25){
                id = i+1;
                logo = R.drawable.man;
                text = "মোহাম্মদ ছায়েদুল হক";
                icon = R.drawable.bracketwhite;
            }else if (i == 26){
                id = i+1;
                logo = R.drawable.man;
                text = "অলি আহাদ";
                icon = R.drawable.bracketwhite;
            }else if (i == 27){
                id = i+1;
                logo = R.drawable.man;
                text = "আবুল কালাম মোহাম্মদ যাকারিয়া";
                icon = R.drawable.bracketwhite;
            }else if (i == 28){
                id = i+1;
                logo = R.drawable.man;
                text = "মোহাম্মদ আশরাফুল";
                icon = R.drawable.bracketwhite;
            }else if (i == 29){
                id = i+1;
                logo = R.drawable.man;
                text = "আহমেদ আকবর সোবহান";
                icon = R.drawable.bracketwhite;
            }else if (i == 30){
                id = i+1;
                logo = R.drawable.man;
                text = "সৈয়দ আব্দুল হাদী";
                icon = R.drawable.bracketwhite;
            }else if (i == 31){
                id = i+1;
                logo = R.drawable.man;
                text = "আনোয়ার হোসেন";
                icon = R.drawable.bracketwhite;
            }else if (i == 32){
                id = i+1;
                logo = R.drawable.man;
                text = "মনির আহমেদ খান";
                icon = R.drawable.bracketwhite;
            }else if (i == 33){
                id = i+1;
                logo = R.drawable.man;
                text = "আলাউদ্দিন খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 34){
                id = i+1;
                logo = R.drawable.man;
                text = "আলী আকবর খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 35){
                id = i+1;
                logo = R.drawable.man;
                text = "আয়েত আলী খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 36){
                id = i+1;
                logo = R.drawable.man;
                text = "বাহাদুর হোসেন খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 37){
                id = i+1;
                logo = R.drawable.man;
                text = "আবেদ হোসেন খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 38){
                id = i+1;
                logo = R.drawable.man;
                text = "মোবারক হোসেন খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 39){
                id = i+1;
                logo = R.drawable.man;
                text = "মীর কাশেম খাঁ";
                icon = R.drawable.bracketwhite;
            }else if (i == 40){
                id = i+1;
                logo = R.drawable.man;
                text = "শেখ সাদী খান";
                icon = R.drawable.bracketwhite;
            }else if (i == 41){
                id = i+1;
                logo = R.drawable.man;
                text = "মনমোহন দত্ত";
                icon = R.drawable.bracketwhite;
            }else if (i == 42){
                id = i+1;
                logo = R.drawable.man;
                text = "সুফী জুলফিকার হায়দার";
                icon = R.drawable.bracketwhite;
            }else if (i == 43){
                id = i+1;
                logo = R.drawable.man;
                text = "অতীন্দ্রমোহন রায়";
                icon = R.drawable.bracketwhite;
            }else if (i == 44){
                id = i+1;
                logo = R.drawable.man;
                text = "আব্দুস সাত্তার খান";
                icon = R.drawable.bracketwhite;
            }else if (i == 45){
                id = i+1;
                logo = R.drawable.man;
                text = "শাহজাহান সিদ্দিকী";
                icon = R.drawable.bracketwhite;
            }else if (i == 46){
                id = i+1;
                logo = R.drawable.man;
                text = "মোফাজ্জল হোসেন";
                icon = R.drawable.bracketwhite;
            }else if (i == 47){
                id = i+1;
                logo = R.drawable.man;
                text = "ফজল শাহাবুদ্দীন";
                icon = R.drawable.bracketwhite;
            }else if (i == 48){
                id = i+1;
                logo = R.drawable.man;
                text = "তুষার আব্দুল্লাহ";
                icon = R.drawable.bracketwhite;
            }else if (i == 49){
                id = i+1;
                logo = R.drawable.man;
                text = "গুলজার উদ্দিন আহমেদ";
                icon = R.drawable.bracketwhite;
            }


            FamousIDRegister famousIDRegister = new FamousIDRegister(id, logo, text, icon);
            listOfFamousPeople.add(famousIDRegister);
        }
            FamousAdapter famousAdapter = new FamousAdapter(listOfFamousPeople, getActivity());
            listView.setAdapter(famousAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0){
                    MTajulIslam mTajulIslam = new MTajulIslam();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, mTajulIslam, mTajulIslam.getTag()).commit();

                }else if (position == 1){
                    SirajulIslam sirajulIslam = new SirajulIslam();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, sirajulIslam, sirajulIslam.getTag()).commit();

                }else if (position == 2){
                    MuftiAmini muftiAmini = new MuftiAmini();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, muftiAmini, muftiAmini.getTag()).commit();

                }else if (position == 3){
                    OdoitoMollobormon odoitoMollobormon = new OdoitoMollobormon();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, odoitoMollobormon, odoitoMollobormon.getTag()).commit();

                }else if (position == 4){
                    DirendronathDotto direndronathDotto = new DirendronathDotto();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, direndronathDotto, direndronathDotto.getTag()).commit();

                }else if (position == 5){
                    AbdulKoddosMakhon abdulKoddosMakhon = new AbdulKoddosMakhon();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abdulKoddosMakhon, abdulKoddosMakhon.getTag()).commit();

                }else if (position == 6){
                    KabirChowdhury kabirChowdhury = new KabirChowdhury();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, kabirChowdhury, kabirChowdhury.getTag()).commit();

                }else if (position == 7){
                    AlMahmud alMahmud = new AlMahmud();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, alMahmud, alMahmud.getTag()).commit();

                }else if (position == 8){
                    AbuSalehMohammadNasim abuSalehMohammadNasim = new AbuSalehMohammadNasim();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abuSalehMohammadNasim, abuSalehMohammadNasim.getTag()).commit();

                }else if (position == 9){
                    SakilAhmed sakilAhmed = new SakilAhmed();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, sakilAhmed, sakilAhmed.getTag()).commit();

                }else if (position == 10){
                    AsrafAhmed asrafAhmed = new AsrafAhmed();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, asrafAhmed, asrafAhmed.getTag()).commit();

                }else if (position == 11){
                    IsaKha isaKha = new IsaKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, isaKha, isaKha.getTag()).commit();

                }else if (position == 12){
                    NurulAmin nurulAmin = new NurulAmin();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, nurulAmin, nurulAmin.getTag()).commit();

                }else if (position == 13){
                    UllashKorDotto ullashKorDotto = new UllashKorDotto();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, ullashKorDotto, ullashKorDotto.getTag()).commit();

                }else if (position == 14){
                    SheikhAbuHamed sheikhAbuHamed = new SheikhAbuHamed();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, sheikhAbuHamed, sheikhAbuHamed.getTag()).commit();

                }else if (position == 15){
                    ObinashKumar obinashKumar = new ObinashKumar();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, obinashKumar, obinashKumar.getTag()).commit();

                }else if (position == 16){
                    PayelThakur payelThakur = new PayelThakur();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, payelThakur, payelThakur.getTag()).commit();

                }else if (position == 17){
                    HabiburRahmanMilon habiburRahmanMilon = new HabiburRahmanMilon();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, habiburRahmanMilon, habiburRahmanMilon.getTag()).commit();

                }else if (position == 18){
                    AhmedurRahman ahmedurRahman = new AhmedurRahman();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, ahmedurRahman, ahmedurRahman.getTag()).commit();

                }else if (position == 19){
                    AkborHosenBokol akborHosenBokol = new AkborHosenBokol();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, akborHosenBokol, akborHosenBokol.getTag()).commit();

                }else if (position == 20){
                    PobitroKor pobitroKor = new PobitroKor();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, pobitroKor, pobitroKor.getTag()).commit();

                }else if (position == 21){
                    AbdulKadir abdulKadir = new AbdulKadir();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abdulKadir, abdulKadir.getTag()).commit();

                }else if (position == 22){
                    SamsulHuda samsulHuda = new SamsulHuda();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, samsulHuda, samsulHuda.getTag()).commit();

                }else if (position == 23){
                    AbdurRosol abdurRosol = new AbdurRosol();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abdurRosol, abdurRosol.getTag()).commit();

                }else if (position == 24){
                    MotiulIslam motiulIslam = new MotiulIslam();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, motiulIslam, motiulIslam.getTag()).commit();

                }else if (position == 25){
                    SayedulIslam sayedulIslam = new SayedulIslam();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, sayedulIslam, sayedulIslam.getTag()).commit();

                }else if (position == 26){
                    OliAhad oliAhad = new OliAhad();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, oliAhad, oliAhad.getTag()).commit();

                }else if (position == 27){
                    AbulKalamMohammadJakaria abulKalamMohammadJakaria = new AbulKalamMohammadJakaria();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abulKalamMohammadJakaria, abulKalamMohammadJakaria.getTag()).commit();

                }else if (position == 28){
                    MohammadAsraful mohammadAsraful = new MohammadAsraful();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, mohammadAsraful, mohammadAsraful.getTag()).commit();

                }else if (position == 29){
                    AhmedAkborSubhan ahmedAkborSubhan = new AhmedAkborSubhan();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, ahmedAkborSubhan, ahmedAkborSubhan.getTag()).commit();

                }else if (position == 30){
                    AbdulHadi abdulHadi = new AbdulHadi();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abdulHadi, abdulHadi.getTag()).commit();

                }else if (position == 31){
                    AnoarHosen anoarHosen = new AnoarHosen();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, anoarHosen, anoarHosen.getTag()).commit();

                }else if (position == 32){
                    MonirAhmedKhan monirAhmedKhan = new MonirAhmedKhan();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, monirAhmedKhan, monirAhmedKhan.getTag()).commit();

                }else if (position == 33){
                    AlauddinKha alauddinKha = new AlauddinKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, alauddinKha, alauddinKha.getTag()).commit();

                }else if (position == 34){
                    AliAkborKha aliAkborKha = new AliAkborKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, aliAkborKha, aliAkborKha.getTag()).commit();

                }else if (position == 35){
                    AyetAliKha ayetAliKha = new AyetAliKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, ayetAliKha, ayetAliKha.getTag()).commit();

                }else if (position == 36){
                    BahadurAliKha bahadurAliKha = new BahadurAliKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, bahadurAliKha, bahadurAliKha.getTag()).commit();

                }else if (position == 37){
                    AbedHosenKha abedHosenKha = new AbedHosenKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abedHosenKha, abedHosenKha.getTag()).commit();

                }else if (position == 38){
                    MobarokHosenKha mobarokHosenKha = new MobarokHosenKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, mobarokHosenKha, mobarokHosenKha.getTag()).commit();

                }else if (position == 39){
                    MirKasemKha mirKasemKha = new MirKasemKha();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, mirKasemKha, mirKasemKha.getTag()).commit();

                }else if (position == 40){
                    SadiKhan sadiKhan = new SadiKhan();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, sadiKhan, sadiKhan.getTag()).commit();

                }else if (position == 41){
                    MonmohonDotto monmohonDotto = new MonmohonDotto();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, monmohonDotto, monmohonDotto.getTag()).commit();

                }else if (position == 42){
                    JulfikarHaidar julfikarHaidar = new JulfikarHaidar();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, julfikarHaidar, julfikarHaidar.getTag()).commit();

                }else if (position == 43){
                    OtindroMohonRay otindroMohonRay = new OtindroMohonRay();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, otindroMohonRay, otindroMohonRay.getTag()).commit();

                }else if (position == 44){
                    AbdusSattar abdusSattar = new AbdusSattar();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, abdusSattar, abdusSattar.getTag()).commit();

                }else if (position == 45){
                    ShahjahanSiddiki shahjahanSiddiki = new ShahjahanSiddiki();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, shahjahanSiddiki, shahjahanSiddiki.getTag()).commit();

                }else if (position == 46){
                    MofajjolHosen mofajjolHosen = new MofajjolHosen();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, mofajjolHosen, mofajjolHosen.getTag()).commit();

                }else if (position == 47){
                    FojolSahabuddin fojolSahabuddin = new FojolSahabuddin();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, fojolSahabuddin, fojolSahabuddin.getTag()).commit();

                }else if (position == 48){
                    TusharAbdullah tusharAbdullah = new TusharAbdullah();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, tusharAbdullah, tusharAbdullah.getTag()).commit();

                }else if (position == 49){
                    GuljarUddinAhmed guljarUddinAhmed = new GuljarUddinAhmed();
                    fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .add(new Home(), "About")
                            .addToBackStack("About")
                            .replace(R.id.content_main, guljarUddinAhmed, guljarUddinAhmed.getTag()).commit();
                }


            }
        });

            return rootView;
    }

}
