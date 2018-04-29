package com.techsajib.amaderbbaria.SangshadChairmanInfo;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.PoliceStation.PoliceCamp.PoliceCampMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceCircle.PoliceCircleMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceSuper.PoliceSuperMain;
import com.techsajib.amaderbbaria.PoliceStation.PoliceThana.PoliceThanaMain;
import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember.SangshadMemberMain;
import com.techsajib.amaderbbaria.SangshadChairmanInfo.UpozilaChairman.UpozilaChairmanMain;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjAbout;
import com.techsajib.amaderbbaria.UpozilaUnion.UpozilaUnionMain;

/**
 * A simple {@link Fragment} subclass.
 */
public class SangshadChairmanMain extends Fragment implements View.OnClickListener{

    private CardView parlamentMember, upozilaChairman, unionChairman;
    FragmentManager fragmentManager;

    public SangshadChairmanMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.sangshad_sangshad_chairman_main, container, false);
        parlamentMember = (CardView) rootView.findViewById(R.id.parliamentMember);
        upozilaChairman = (CardView) rootView.findViewById(R.id.upozilaChairman);
        unionChairman = (CardView) rootView.findViewById(R.id.unionChairman);


        parlamentMember.setOnClickListener(this);
        upozilaChairman.setOnClickListener(this);
        unionChairman.setOnClickListener(this);

        return rootView;

    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()) {

            case R.id.parliamentMember:
                intent = new Intent(getActivity(), SangshadMemberMain.class);
                SangshadMemberMain sangshadMemberMain = new SangshadMemberMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, sangshadMemberMain, sangshadMemberMain.getTag()).commit();
                break;

            case R.id.upozilaChairman:
                intent = new Intent(getActivity(), UpozilaChairmanMain.class);
                UpozilaChairmanMain upozilaChairmanMain = new UpozilaChairmanMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, upozilaChairmanMain, upozilaChairmanMain.getTag()).commit();
                break;


            case R.id.unionChairman:
                intent = new Intent(getActivity(), UpozilaUnionMain.class);
                UpozilaUnionMain upozilaUnionMain = new UpozilaUnionMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, upozilaUnionMain, upozilaUnionMain.getTag()).commit();
                break;


        }
    }
}
