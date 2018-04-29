package com.techsajib.amaderbbaria.SangshadChairmanInfo.UpozilaChairman;

/**
 * Created by User on 1/14/2018.
 */

public class UpozilaChairmanIDRegister {

    private int id;
    private String upozilaName;
    private String chairmanName;
    private String viceChairmanName;
    private String womanViceChairmanName;
    private String mayorName;

    public UpozilaChairmanIDRegister(int id, String upozilaName, String chairmanName, String viceChairmanName, String womanViceChairmanName, String mayorName) {
        this.id = id;
        this.upozilaName = upozilaName;
        this.chairmanName = chairmanName;
        this.viceChairmanName = viceChairmanName;
        this.womanViceChairmanName = womanViceChairmanName;
        this.mayorName = mayorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpozilaName() {
        return upozilaName;
    }

    public void setUpozilaName(String upozilaName) {
        this.upozilaName = upozilaName;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public String getViceChairmanName() {
        return viceChairmanName;
    }

    public void setViceChairmanName(String viceChairmanName) {
        this.viceChairmanName = viceChairmanName;
    }

    public String getWomanViceChairmanName() {
        return womanViceChairmanName;
    }

    public void setWomanViceChairmanName(String womanViceChairmanName) {
        this.womanViceChairmanName = womanViceChairmanName;
    }

    public String getMayorName() {
        return mayorName;
    }

    public void setMayorName(String mayorName) {
        this.mayorName = mayorName;
    }
}
