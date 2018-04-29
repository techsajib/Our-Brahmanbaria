package com.techsajib.amaderbbaria.HomeProfile.TouristPlace;

/**
 * Created by User on 12/29/2017.
 */

public class TouristIDRegister {
    private int id;
    private String text;
    private int icon;

    public TouristIDRegister(int id, String text, int icon) {
        this.id = id;
        this.text = text;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
