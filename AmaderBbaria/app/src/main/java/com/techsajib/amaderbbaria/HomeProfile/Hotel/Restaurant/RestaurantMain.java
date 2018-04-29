package com.techsajib.amaderbbaria.HomeProfile.Hotel.Restaurant;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.HomeProfile.Hotel.PrivateHotel.PrivateHotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantMain extends Fragment {

    ListView listView;
    ArrayList<RestaurantIDResgister> listOfRestaurant;

    LinearLayout first;
    Animation uptodown;

    public RestaurantMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.restaurant_main, container, false);
        listView = (ListView) rootView.findViewById(R.id.reataurantListView);
        listOfRestaurant = new ArrayList<>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.restaurantLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);


        for (int i = 1; i<11; i++) {
            int id = i + 1;
            int logo = R.drawable.hotel;
            String hotelName = "";
            String phoneNumber = "";
            String location = "";

            if (i == 1){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " হোটেল উজান ভাটি";
                phoneNumber = " 01711-561158";
                location = " আশুগঞ্জ পুলিশ স্টেশনের পাশে।";
            }else  if (i == 2){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " হোটেল গ্রান্ড এ মালেক";
                phoneNumber = " 01715-410753";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 3){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " সিলভার ফর্ক চাইনিজ রেস্টুরেন্ট";
                phoneNumber = " 01680-800790";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 4){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " রাঁধুনি হোটেল ও রেস্টুরেন্ট";
                phoneNumber = " 01926-617128";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 5){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " স্নো ফিয়েস্তা";
                phoneNumber = " 01611-343782";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 6){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " ক্যাফে আবদুল্লাহ হোটেল এন্ড রেস্টুরেন্ট";
                phoneNumber = " 01709-102741";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 7){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " রেড চিলি থাই এন্ড চাইনিজ";
                phoneNumber = " 01748-220046";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 8){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " দিল্লী দরবার রেস্টুরেন্ট";
                phoneNumber = " 01834-429822";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 9){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " গাও গেরাম রেস্টুরেন্ট";
                phoneNumber = " 01765-321218";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }else  if (i == 10){
                id = i + 1;
                logo = R.drawable.colorrestaurant;
                hotelName = " শাহীন হোটেল এন্ড রেস্টুরেন্ট";
                phoneNumber = " 01922-054472";
                location = " সদর, ব্রাহ্মণবাড়িয়া";
            }

            RestaurantIDResgister restaurantIDResgister = new RestaurantIDResgister(id, logo, hotelName, phoneNumber, location);
            listOfRestaurant.add(restaurantIDResgister);
        }

            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(listOfRestaurant, getActivity());
            listView.setAdapter(restaurantAdapter);

        return rootView;
    }

}
