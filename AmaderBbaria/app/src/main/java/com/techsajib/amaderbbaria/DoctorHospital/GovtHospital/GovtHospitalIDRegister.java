package com.techsajib.amaderbbaria.DoctorHospital.GovtHospital;

/**
 * Created by Xubisoft on 2/8/2018.
 */

public class GovtHospitalIDRegister {

    private int id;
    private int logo;
    private String hospital;
    private String seat;
    private String doctor;
    private String location;

    public GovtHospitalIDRegister(int id, int logo, String hospital, String seat, String doctor, String location) {
        this.id = id;
        this.logo = logo;
        this.hospital = hospital;
        this.seat = seat;
        this.doctor = doctor;
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
