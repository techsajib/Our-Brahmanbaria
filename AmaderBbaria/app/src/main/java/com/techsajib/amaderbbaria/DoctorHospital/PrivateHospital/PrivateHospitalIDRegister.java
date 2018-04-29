package com.techsajib.amaderbbaria.DoctorHospital.PrivateHospital;

/**
 * Created by Xubisoft on 2/8/2018.
 */

public class PrivateHospitalIDRegister {

    private int id;
    private int logo;
    private String hospital;
    private String owner;
    private String location;

    public PrivateHospitalIDRegister(int id, int logo, String hospital, String owner, String location) {
        this.id = id;
        this.logo = logo;
        this.hospital = hospital;
        this.owner = owner;
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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
