package com.techsajib.amaderbbaria;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.techsajib.amaderbbaria.AboutApp.AboutApplication;
import com.techsajib.amaderbbaria.AboutApp.AboutSajib;
import com.techsajib.amaderbbaria.AboutApp.AppContributor;
import com.techsajib.amaderbbaria.AboutApp.IdeaSuggestion;
import com.techsajib.amaderbbaria.AboutApp.Website;
import com.techsajib.amaderbbaria.HomeProfile.Home;

public class MainAmaderBbaria extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amader_bbaria);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*interstitialAd = new InterstitialAd(getApplicationContext());
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        AdRequest adRequest1 = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        interstitialAd.loadAd(adRequest1);

        interstitialAd.setAdListener(new AdListener(){
                                         @Override
                                         public void onAdLoaded() {
                                             if (interstitialAd.isLoaded()){
                                                 interstitialAd.show();
                                             }
                                         }
                                     }

        );*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        showHome();
    }


    /*<item android:id="@+id/action_search"
    android:icon="@android:drawable/ic_menu_search"
    android:title="@string/action_search"
    app:actionViewClass="android.support.v7.widget.SearchView"
    app:showAsAction="always|collapseActionView" />*/

        private  void showHome(){
            MainAmaderBbaria mainAmaderBbaria = new MainAmaderBbaria();
            Home home = new Home();

            if (mainAmaderBbaria != null){
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_main, home, home.getTag()).commit();
            }
        }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_search) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.aboutApplication) {
            // Handle the camera action
            AboutApplication aboutApplication = new AboutApplication();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .add(new Home(), "About")
                    .addToBackStack("About")
                    .replace(R.id.content_main, aboutApplication, aboutApplication.getTag()).commit();

        } else if (id == R.id.ideaSuggestion) {
            IdeaSuggestion ideaSuggestion = new IdeaSuggestion();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .add(new Home(), "About")
                    .addToBackStack("About")
                    .replace(R.id.content_main, ideaSuggestion, ideaSuggestion.getTag()).commit();

        } else if (id == R.id.contributor) {
            AppContributor appContributor = new AppContributor();
            fragmentManager.beginTransaction()
                    .add(new Home(), "About")
                    .addToBackStack("About")
                    .replace(R.id.content_main, appContributor, appContributor.getTag()).commit();

        } else if (id == R.id.aboutMe) {
            AboutSajib aboutSajib = new AboutSajib();
            fragmentManager.beginTransaction()
                    .add(new Home(), "About")
                    .addToBackStack("About")
                    .replace(R.id.content_main, aboutSajib, aboutSajib.getTag()).commit();

        }else if (id == R.id.detailsApp) {
            Website website = new Website();
            fragmentManager.beginTransaction()
                    .add(new Home(), "About")
                    .addToBackStack("About")
                    .replace(R.id.content_main, website, website.getTag()).commit();
            //Toast.makeText(getApplicationContext(), "Make Sure Your Internet Connection!", Toast.LENGTH_LONG).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
