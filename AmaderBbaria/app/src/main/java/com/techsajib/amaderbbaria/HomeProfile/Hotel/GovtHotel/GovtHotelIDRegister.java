package com.techsajib.amaderbbaria.HomeProfile.Hotel.GovtHotel;

/**
 * Created by User on 1/1/2018.
 */

public class GovtHotelIDRegister {
    private int id;
    private int logo;
    private String hotelName;
    private String managementInstitute;
    private String location;

    public GovtHotelIDRegister(int id, int logo, String hotelName, String managementInstitute, String location) {
        this.id = id;
        this.logo = logo;
        this.hotelName = hotelName;
        this.managementInstitute = managementInstitute;
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

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getManagementInstitute() {
        return managementInstitute;
    }

    public void setManagementInstitute(String managementInstitute) {
        this.managementInstitute = managementInstitute;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
