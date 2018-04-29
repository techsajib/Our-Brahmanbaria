package com.techsajib.amaderbbaria.OfficeBankList;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.OfficeBankList.BankList.BankListMain;
import com.techsajib.amaderbbaria.OfficeBankList.NGOList.NGOListMain;
import com.techsajib.amaderbbaria.OfficeBankList.OfficeList.OfficeListMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceCamp.PoliceCampMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceCircle.PoliceCircleMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceSuper.PoliceSuperMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceThana.PoliceThanaMain;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OfficeBankMain extends Fragment implements View.OnClickListener{

    private CardView bankListMainCardView, ngoListCardView, officeListCardView;
    FragmentManager fragmentManager;

    public OfficeBankMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.office_office_bank_main, container, false);

        bankListMainCardView = (CardView) rootView.findViewById(R.id.bankListMainCardView);
        ngoListCardView = (CardView) rootView.findViewById(R.id.ngoListCardView);
        officeListCardView = (CardView) rootView.findViewById(R.id.officeListCardView);

        bankListMainCardView.setOnClickListener(this);
        ngoListCardView.setOnClickListener(this);
        officeListCardView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {

            case R.id.bankListMainCardView:
                intent = new Intent(getActivity(), BankListMain.class);
                BankListMain bankListMain = new BankListMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, bankListMain, bankListMain.getTag()).commit();
                break;

            case R.id.ngoListCardView:
                intent = new Intent(getActivity(), NGOListMain.class);
                NGOListMain ngoListMain = new NGOListMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, ngoListMain, ngoListMain.getTag()).commit();
                break;


            case R.id.officeListCardView:
                intent = new Intent(getActivity(), OfficeListMain.class);
                OfficeListMain officeListMain = new OfficeListMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, officeListMain, officeListMain.getTag()).commit();
                break;


        }
    }
}
