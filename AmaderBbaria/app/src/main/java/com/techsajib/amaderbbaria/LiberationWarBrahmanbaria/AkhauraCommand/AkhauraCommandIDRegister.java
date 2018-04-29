package com.techsajib.amaderbbaria.LiberationWarBrahmanbaria.AkhauraCommand;

/**
 * Created by Xubisoft on 2/5/2018.
 */

public class AkhauraCommandIDRegister {

    private int id;
    private String designationNameText;
    private String soldierNameText;
    private String soldierFatherNameText;
    private String soldierAddressText;

    public AkhauraCommandIDRegister(int id, String designationNameText, String soldierNameText, String soldierFatherNameText, String soldierAddressText) {
        this.id = id;
        this.designationNameText = designationNameText;
        this.soldierNameText = soldierNameText;
        this.soldierFatherNameText = soldierFatherNameText;
        this.soldierAddressText = soldierAddressText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignationNameText() {
        return designationNameText;
    }

    public void setDesignationNameText(String designationNameText) {
        this.designationNameText = designationNameText;
    }

    public String getSoldierNameText() {
        return soldierNameText;
    }

    public void setSoldierNameText(String soldierNameText) {
        this.soldierNameText = soldierNameText;
    }

    public String getSoldierFatherNameText() {
        return soldierFatherNameText;
    }

    public void setSoldierFatherNameText(String soldierFatherNameText) {
        this.soldierFatherNameText = soldierFatherNameText;
    }

    public String getSoldierAddressText() {
        return soldierAddressText;
    }

    public void setSoldierAddressText(String soldierAddressText) {
        this.soldierAddressText = soldierAddressText;
    }
}
