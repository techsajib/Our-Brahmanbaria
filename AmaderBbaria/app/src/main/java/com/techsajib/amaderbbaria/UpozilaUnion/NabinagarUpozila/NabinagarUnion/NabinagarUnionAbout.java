package com.techsajib.amaderbbaria.UpozilaUnion.NabinagarUpozila.NabinagarUnion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.techsajib.amaderbbaria.R;
import com.techsajib.amaderbbaria.UpozilaUnion.AsuganjUpozila.AshuganjUnion.AshuganjIDRegister;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NabinagarUnionAbout extends Fragment {


    ListView listView;
    ArrayList<NabinagarIDRegister> listOfNabinagarUnionData;

    public NabinagarUnionAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.union_nabinagar_union_main, container, false);

        listView = (ListView) rootView.findViewById(R.id.nabinagarUnionDataListView);
        listOfNabinagarUnionData = new ArrayList<>();

        for (int i =1; i<22; i++) {
            int id = i + 1;
            String union = "";
            String chairman = "";
            String address = "";

            if (i == 1){
                 id = i + 1;
                 union = " ইউনিয়ন: বড়াইল";
                 chairman = "  চেয়ারম্যান: মোঃ জাকির হোসেন";
                 address = " পোস্টাল ঠিকানা: বড়াইল, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 2){
                id = i + 1;
                union = " ইউনিয়ন: বীরগাও";
                chairman = "  চেয়ারম্যান: হাজী কবির আহমেদ";
                address = " পোস্টাল ঠিকানা: বীরগাও, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 3){
                id = i + 1;
                union = " ইউনিয়ন: কৃষ্ণনগর";
                chairman = "  চেয়ারম্যান: মোঃ মাশুকুর রহমান";
                address = " পোস্টাল ঠিকানা: কৃষ্ণনগর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 4){
                id = i + 1;
                union = " ইউনিয়ন: নাটঘর";
                chairman = "  চেয়ারম্যান: আবুল কাশেম";
                address = " পোস্টাল ঠিকানা: নাটঘর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 5){
                id = i + 1;
                union = " ইউনিয়ন: বিদ্যাকুট";
                chairman = "  চেয়ারম্যান: এনামুল হক";
                address = " পোস্টাল ঠিকানা: বিদ্যাকুট, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 6){
                id = i + 1;
                union = " ইউনিয়ন: নবীনগর পুর্ব";
                chairman = "  চেয়ারম্যান: মোহাম্মদ আবুল খায়ের";
                address = " পোস্টাল ঠিকানা: নবীনগর পুর্ব, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 7){
                id = i + 1;
                union = " ইউনিয়ন: নবীনগর পশ্চিম";
                chairman = "  চেয়ারম্যান: গোলাম কিবরিয়া";
                address = " পোস্টাল ঠিকানা: নবীনগর পশ্চিম, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 8){
                id = i + 1;
                union = " ইউনিয়ন: কাইতলা উত্তর";
                chairman = "  চেয়ারম্যান: মোহাম্মদ আবুল খায়ের";
                address = " পোস্টাল ঠিকানা: কাইতলা উত্তর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 9){
                id = i + 1;
                union = " ইউনিয়ন: কাইতলা দক্ষিণ";
                chairman = "  চেয়ারম্যান: আব্দুল মান্নান";
                address = " পোস্টাল ঠিকানা: কাইতলা দক্ষিণ, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 10){
                id = i + 1;
                union = " ইউনিয়ন: বিটঘর";
                chairman = "  চেয়ারম্যান: মোঃ সুলাইমান ভুঞা সোহাগ";
                address = " পোস্টাল ঠিকানা: বিটঘর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 11){
                id = i + 1;
                union = " ইউনিয়ন: শিবপুর";
                chairman = "  চেয়ারম্যান: শামসুল হক";
                address = " পোস্টাল ঠিকানা: শিবপুর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 12){
                id = i + 1;
                union = " ইউনিয়ন: শ্রীরামপুর";
                chairman = "  চেয়ারম্যান: ফাইজুর রহমান";
                address = " পোস্টাল ঠিকানা: শ্রীরামপুর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 13){
                id = i + 1;
                union = " ইউনিয়ন: লাউরফতেহপুর";
                chairman = "  চেয়ারম্যান: ফারুক আহম্মদ";
                address = " পোস্টাল ঠিকানা: লাউরফতেহপুর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 14){
                id = i + 1;
                union = " ইউনিয়ন: জিনোদপুর";
                chairman = "  চেয়ারম্যান: মোঃ ইউনুস মিয়া";
                address = " পোস্টাল ঠিকানা: জিনোদপুর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 15){
                id = i + 1;
                union = " ইউনিয়ন: ইব্রাহিমপুর";
                chairman = "  চেয়ারম্যান: মোঃ আবু মুছা";
                address = " পোস্টাল ঠিকানা: ইব্রাহিমপুর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 16){
                id = i + 1;
                union = " ইউনিয়ন: রসুল্লাবাদ";
                chairman = "  চেয়ারম্যান: মোঃ আলী আকবর";
                address = " পোস্টাল ঠিকানা: রসুল্লাবাদ, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 17){
                id = i + 1;
                union = " ইউনিয়ন: সাতমোড়া";
                chairman = "  চেয়ারম্যান: মোঃ ফরিদ উদ্দিন আহমেদ";
                address = " পোস্টাল ঠিকানা: সাতমোড়া, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 18){
                id = i + 1;
                union = " ইউনিয়ন: শ্যামগ্রাম";
                chairman = "  চেয়ারম্যান: নাছির উদ্দিন সরকার";
                address = " পোস্টাল ঠিকানা: শ্যামগ্রাম, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 19){
                id = i + 1;
                union = " ইউনিয়ন: বড়িকান্দি";
                chairman = "  চেয়ারম্যান: মোহাম্মদ শাহজাহান";
                address = " পোস্টাল ঠিকানা: বড়িকান্দি, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 20){
                id = i + 1;
                union = " ইউনিয়ন: ছলিমগঞ্জ";
                chairman = "  চেয়ারম্যান: মোঃ পরশ মিয়া";
                address = " পোস্টাল ঠিকানা: ছলিমগঞ্জ, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }else if (i == 21){
                id = i + 1;
                union = " ইউনিয়ন: রতনপুর";
                chairman = "  চেয়ারম্যান: রুহুল আমিন";
                address = " পোস্টাল ঠিকানা: রতনপুর, নবীনগর, ব্রাহ্মণবাড়িয়া।";
            }

            NabinagarIDRegister nabinagarIDRegister = new NabinagarIDRegister(id, union, chairman, address);
            listOfNabinagarUnionData.add(nabinagarIDRegister);
        }

            NabinagarAdapter nabinagarAdapter = new NabinagarAdapter(listOfNabinagarUnionData, getActivity());
            listView.setAdapter(nabinagarAdapter);
            return rootView;
    }

}
