package com.techsajib.amaderbbaria.AboutApp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.techsajib.amaderbbaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutSajib extends Fragment {

    ImageButton facebook, twitter, linkedin, instagram, youtube;

    public AboutSajib() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.about_about_sajib, container, false);

        facebook = (ImageButton) rootView.findViewById(R.id.facebook);
        twitter = (ImageButton) rootView.findViewById(R.id.twitter);
        linkedin = (ImageButton) rootView.findViewById(R.id.linkedin);
        instagram = (ImageButton) rootView.findViewById(R.id.instagram);
        youtube = (ImageButton) rootView.findViewById(R.id.youtube);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/techsajib"));
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://twitter.com/techsajib"));
                startActivity(intent);
            }
        });


        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.linkedin.com/in/techsajib"));
                startActivity(intent);
            }
        });



        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/techsajib"));
                startActivity(intent);
            }
        });



        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/AnQ5KN"));
                startActivity(intent);
            }
        });

        return rootView;
    }

}
