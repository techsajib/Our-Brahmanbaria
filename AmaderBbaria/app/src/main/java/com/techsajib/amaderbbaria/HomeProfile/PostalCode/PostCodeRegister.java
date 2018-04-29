package com.techsajib.amaderbbaria.HomeProfile.PostalCode;

/**
 * Created by User on 12/27/2017.
 */

public class PostCodeRegister {

    private String postOfiice;
    private String postCode;
    private String thana;
    private int id;

    public PostCodeRegister(String postOfiice, String postCode, String thana, int id) {
        this.postOfiice = postOfiice;
        this.postCode = postCode;
        this.thana = thana;
        this.id = id;
    }



    public String getPostOfiice() {
        return postOfiice;
    }

    public void setPostOfiice(String postOfiice) {
        this.postOfiice = postOfiice;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
