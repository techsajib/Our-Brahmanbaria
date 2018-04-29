package com.techsajib.amaderbbaria.OfficeBankList.NGOList;

/**
 * Created by Xubisoft on 2/21/2018.
 */

public class NGOIDRegister {

    private int id;
    private String ngoName;
    private String director;
    private String phone;
    private String location;

    public NGOIDRegister(int id, String ngoName, String director, String phone, String location) {
        this.id = id;
        this.ngoName = ngoName;
        this.director = director;
        this.phone = phone;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
