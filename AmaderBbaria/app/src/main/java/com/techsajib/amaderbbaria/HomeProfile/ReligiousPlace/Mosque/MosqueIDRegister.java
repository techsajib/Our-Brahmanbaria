package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Mosque;

/**
 * Created by User on 1/5/2018.
 */

public class MosqueIDRegister {
    private int id;
    private int logo;
    private String mosque;
    private String placed;
    private String location;

    public MosqueIDRegister(int id, int logo, String mosque, String placed, String location) {
        this.id = id;
        this.logo = logo;
        this.mosque = mosque;
        this.placed = placed;
        this.location = location;
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

    public String getMosque() {
        return mosque;
    }

    public void setMosque(String mosque) {
        this.mosque = mosque;
    }

    public String getPlaced() {
        return placed;
    }

    public void setPlaced(String placed) {
        this.placed = placed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
