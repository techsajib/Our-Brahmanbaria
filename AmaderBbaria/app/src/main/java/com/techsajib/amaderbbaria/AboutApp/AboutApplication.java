package com.techsajib.amaderbbaria.AboutApp;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutApplication extends Fragment {

    Button email;

    public AboutApplication() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.about_about_application, container, false);

        email = (Button)rootView.findViewById(R.id.aboutAppEmail);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"mimappsltd@gmail.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Complain/Comments for App!");
                    intent.putExtra(Intent.EXTRA_TEXT, "");
                    intent.setType("massage/efc822");
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(getActivity(), "Sorry! Please Install Your Email Application!", Toast.LENGTH_LONG).show();
                }
            }
        });

        return rootView;
    }

}
