package com.techsajib.amaderbbaria.SplashScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.techsajib.amaderbbaria.HomeProfile.Home;
import com.techsajib.amaderbbaria.MainAmaderBbaria;
import com.techsajib.amaderbbaria.R;

public class SplashScreen extends AppCompatActivity {

    ImageView splashScreenImage;
    TextView splashScreenText;
    Animation uptodown, downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        splashScreenImage = (ImageView) findViewById(R.id.splashScreenImage);
        splashScreenText = (TextView) findViewById(R.id.splashScreenText);

        uptodown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.downtoup);

        splashScreenImage.setAnimation(uptodown);
        splashScreenText.setAnimation(downtoup);

        //for Splash screen Timing
        new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    startActivity(new Intent(SplashScreen.this, MainAmaderBbaria.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
