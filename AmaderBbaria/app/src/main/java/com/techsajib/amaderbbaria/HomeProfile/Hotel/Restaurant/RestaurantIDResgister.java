package com.techsajib.amaderbbaria.HomeProfile.Hotel.Restaurant;

/**
 * Created by User on 1/2/2018.
 */

public class RestaurantIDResgister {
    private int id;
    private int logo;
    private String hotelName;
    private String phoneNumber;
    private String location;

    public RestaurantIDResgister(int id, int logo, String hotelName, String phoneNumber, String location) {
        this.id = id;
        this.logo = logo;
        this.hotelName = hotelName;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
