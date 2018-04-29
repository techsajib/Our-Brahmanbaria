package com.techsajib.amaderbbaria.AboutApp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppContributor extends Fragment {


    public AppContributor() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.about_app_contributor, container, false);
    }

}
