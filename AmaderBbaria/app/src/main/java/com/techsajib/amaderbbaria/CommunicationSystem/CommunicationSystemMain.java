package com.techsajib.amaderbbaria.CommunicationSystem;


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
import com.techsajib.amaderbbaria.HomeProfile.InformationDetails.DistrictDetails;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommunicationSystemMain extends Fragment implements View.OnClickListener{

    FragmentManager fragmentManager;

    private CardView trainCardView, busCardView;

    public CommunicationSystemMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.com_communication_system_main, container, false);

        trainCardView = (CardView) rootView.findViewById(R.id.trainServiceCardView);
        busCardView = (CardView) rootView.findViewById(R.id.busServiceCardView);

        trainCardView.setOnClickListener(this);
        busCardView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {

            case R.id.trainServiceCardView:
                intent = new Intent(getActivity(), TrainServiceMain.class);
                TrainServiceMain trainServiceMain = new TrainServiceMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, trainServiceMain, trainServiceMain.getTag()).commit();
                break;

            case R.id.busServiceCardView:
                intent = new Intent(getActivity(), BusServiceMain.class);
                BusServiceMain busServiceMain = new BusServiceMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, busServiceMain, busServiceMain.getTag()).commit();
                break;

        }
    }
}
