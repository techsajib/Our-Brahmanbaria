package com.techsajib.amaderbbaria.PoliceStation;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techsajib.amaderbbaria.CommunicationSystem.BusService.BusServiceMain;
import com.techsajib.amaderbbaria.CommunicationSystem.TrainService.TrainServiceMain;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.PoliceStation.PoliceCamp.PoliceCampMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceCircle.PoliceCircleMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceSuper.PoliceSuperMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceThana.PoliceThanaMain;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PoliceStationMain extends Fragment implements View.OnClickListener{

    private CardView policeSuperCardView, policeCircleCardView, policeThanaCardView, policeCampCardView;
    FragmentManager fragmentManager;

    public PoliceStationMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.police_police_station_main, container, false);

        policeSuperCardView = (CardView) rootView.findViewById(R.id.policeSuperCardView);
        policeCircleCardView = (CardView) rootView.findViewById(R.id.policeCircleCardView);
        policeThanaCardView = (CardView) rootView.findViewById(R.id.policeThanaCardView);
        policeCampCardView = (CardView) rootView.findViewById(R.id.policeCampCardView);

        policeSuperCardView.setOnClickListener(this);
        policeCircleCardView.setOnClickListener(this);
        policeThanaCardView.setOnClickListener(this);
        policeCampCardView.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {

            case R.id.policeSuperCardView:
                intent = new Intent(getActivity(), PoliceSuperMain.class);
                PoliceSuperMain policeSuperMain = new PoliceSuperMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, policeSuperMain, policeSuperMain.getTag()).commit();
                break;

            case R.id.policeCircleCardView:
                intent = new Intent(getActivity(), PoliceCircleMain.class);
                PoliceCircleMain policeCircleMain = new PoliceCircleMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, policeCircleMain, policeCircleMain.getTag()).commit();
                break;

            case R.id.policeThanaCardView:
                intent = new Intent(getActivity(), PoliceThanaMain.class);
                PoliceThanaMain policeThanaMain = new PoliceThanaMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, policeThanaMain, policeThanaMain.getTag()).commit();
                break;


            case R.id.policeCampCardView:
                intent = new Intent(getActivity(), PoliceCampMain.class);
                PoliceCampMain policeCampMain = new PoliceCampMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, policeCampMain, policeCampMain.getTag()).commit();
                break;



        }
    }
}
