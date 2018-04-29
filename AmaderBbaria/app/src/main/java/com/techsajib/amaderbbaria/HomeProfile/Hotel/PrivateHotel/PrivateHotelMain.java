package com.techsajib.amaderbbaria.HomeProfile.Hotel.PrivateHotel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel.GovtHotelIDRegister;
import com.techsajib.amaderbbaria.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrivateHotelMain extends Fragment {

    ListView listView;
    ArrayList<PrivateHotelIDRegister> listOfPrivateHotel;

    LinearLayout first;
    Animation uptodown;

    public PrivateHotelMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hotel_private, container, false);
        listView = (ListView) rootView.findViewById(R.id.privateHotelListView);
        listOfPrivateHotel = new ArrayList<>();


        //for animation section
        first = (LinearLayout) rootView.findViewById(R.id.privateHotelLiniearLayout);
        uptodown = AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        first.setAnimation(uptodown);


        for (int i =0; i<16; i++){
            int id = i+1;
            int logo = R.drawable.colorrestaurant;
            String hotelName = "";
            String phoneNumber = "";
            String location = "";

            if (i == 0){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল গ্রান্ড এ মালেক";
                phoneNumber = " 01715-410753";
                location = " মসজিদ রোড, ব্রাহ্মণবাড়িয়া ";
            }else if (i == 1){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল অনুরাগ ইন্টারন্যাশনাল";
                phoneNumber = " 01713-462045";
                location = " কোর্ট রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 2){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল বি, আর";
                phoneNumber = " 01720-108810";
                location = " কোর্ট রোড, ব্রাহ্মণবাড়িয়া ";
            }else if (i == 3){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল আরাফাত";
                phoneNumber = " 01711-588699";
                location = " কোর্ট রোড, ব্রাহ্মণবাড়িয়া ";
            }else if (i == 4){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল অর্কিড";
                phoneNumber = " 01715-332929";
                location = " কোর্ট রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 5){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল আল মাহির";
                phoneNumber = " 01711-522518";
                location = " কোর্ট রোড, ব্রাহ্মণবাড়িয়া ";
            }else if (i == 6){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল চন্দ্রীমা";
                phoneNumber = " 01720-655842";
                location = " স্টেশন রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 7){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল ইউনুছিয়া";
                phoneNumber = " 01712-529986";
                location = " স্টেশন রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 8){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল নিরাপদ";
                phoneNumber = " 01712-577593";
                location = " স্টেশন রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 9){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল গ্রীন লাইন";
                phoneNumber = " 01552-342613";
                location = " নিউ সিনেমা রোড, ব্রাহ্মণবাড়িয়া ";
            }else if (i == 10){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল রৌশন";
                phoneNumber = " 01819-130328";
                location = " নিউ সিনেমা রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 11){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল নাজ";
                phoneNumber = " 01711-887592";
                location = " কুমারশীল মোড়, ব্রাহ্মণবাড়িয়া";
            }else if (i == 12){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল মুক্তা";
                phoneNumber = " 01824-406036";
                location = " টি.এ রোড, ব্রাহ্মণবাড়িয়া";
            }else if (i == 13){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল উজান ভাটি ও রিসোর্ট";
                phoneNumber = " 01711-561158";
                location = " আশুগঞ্জ পুলিশ স্টেশনের পাশে।";
            }else if (i == 14){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল রাজমণি";
                phoneNumber = " 01737-173470";
                location = " আশুগঞ্জ পুলিশ স্টেশনের পাশে।";
            }else if (i == 15){
                id = i+1;
                logo = R.drawable.privatebuilding;
                hotelName = " হোটেল হোয়াইট হাউজ";
                phoneNumber = " 01711-586220";
                location = " ফেরীঘাট, আশুগঞ্জ";
            }

            PrivateHotelIDRegister privateHotelIDRegister = new PrivateHotelIDRegister(id,logo,hotelName,phoneNumber,location);
            listOfPrivateHotel.add(privateHotelIDRegister);
        }

        PrivateHotelAdapter privateHotelAdapter = new PrivateHotelAdapter(listOfPrivateHotel, getActivity());
        listView.setAdapter(privateHotelAdapter);

        return rootView;
    }

}
