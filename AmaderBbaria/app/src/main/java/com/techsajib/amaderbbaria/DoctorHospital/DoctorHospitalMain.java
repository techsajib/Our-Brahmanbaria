package com.techsajib.amaderbbaria.DoctorHospital;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techsajib.amaderbbaria.DoctorHospital.GovtHospital.GovtHospitalMain;
import com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital.PrivateHospitalMain;
import com.techsajib.amaderbbaria.EducationInstituteList.AliaMadrasa.AliaMadrasaMain;
import com.techsajib.amaderbbaria.EducationInstituteList.CollegeUniversity.CollegeUniversityMain;
import com.techsajib.amaderbbaria.EducationInstituteList.EngineeringCollege.EngineeringCollegeMain;
import com.techsajib.amaderbbaria.EducationInstituteList.MedicalCollege.MedicalCollegeMain;
import com.techsajib.amaderbbaria.EducationInstituteList.QawmiMadrasa.QawmiMadrasaMain;
import com.techsajib.amaderbbaria.EducationInstituteList.SchoolInfo.SchoolInformationMain;
import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DoctorHospitalMain extends Fragment implements View.OnClickListener{

    private CardView govtHospitalCardView, privateHospitalCardView;
    FragmentManager fragmentManager;

    public DoctorHospitalMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hos_doctor_hospital_main, container, false);
        govtHospitalCardView = (CardView) rootView.findViewById(R.id.govtHospitalCardView);
        privateHospitalCardView = (CardView) rootView.findViewById(R.id.privateHospitalCardView);

        govtHospitalCardView.setOnClickListener(this);
        privateHospitalCardView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.govtHospitalCardView : intent = new Intent(getActivity(), GovtHospitalMain.class);
                GovtHospitalMain govtHospitalMain = new GovtHospitalMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, govtHospitalMain, govtHospitalMain.getTag()).commit();
                break;

            case R.id.privateHospitalCardView : intent = new Intent(getActivity(), PrivateHospitalMain.class);
                PrivateHospitalMain privateHospitalMain = new PrivateHospitalMain();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(new Home(), "About")
                        .addToBackStack("About")
                        .replace(R.id.content_main, privateHospitalMain, privateHospitalMain.getTag()).commit();
                break;

        }

    }
    }

