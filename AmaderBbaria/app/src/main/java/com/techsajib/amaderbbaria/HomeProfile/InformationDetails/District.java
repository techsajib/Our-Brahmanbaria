package com.techsajib.amaderbbaria.HomeProfile.InformationDetails;

/**
 * Created by User on 12/23/2017.
 */

public class District {
    private int id;
    private int logo;
    private String text;
    private int icon;

    public District(int id, int logo, String text, int icon) {
        this.id = id;
        this.logo = logo;
        this.text = text;
        this.icon = icon;
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

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
