package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.ReligiousMain;

/**
 * Created by User on 1/4/2018.
 */

public class ReligiousIDRegister {
    private int id;
    private int logo;
    private String text;

    public ReligiousIDRegister(int id, int logo, String text) {
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
