package com.techsajib.amaderbbaria.HomeProfile.Hotel.AHotelMain;

/**
 * Created by User on 12/31/2017.
 */

public class HotelIDRegister {
    private int id;
    private int logo;
    private String text;

    public HotelIDRegister(int id, int logo, String text) {
        this.id = id;
        this.logo = logo;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
