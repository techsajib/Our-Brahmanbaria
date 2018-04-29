package com.techsajib.amaderbbaria.UpozilaUnion.SarailUpozila.SarailUnion;

/**
 * Created by User on 1/12/2018.
 */

public class SarailIDRegister {

    private int id;
    private String union;
    private String chairman;
    private String chairmanAddress;

    public SarailIDRegister(int id, String union, String chairman, String chairmanAddress) {
        this.id = id;
        this.union = union;
        this.chairman = chairman;
        this.chairmanAddress = chairmanAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnion() {
        return union;
    }

    public void setUnion(String union) {
        this.union = union;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public String getChairmanAddress() {
        return chairmanAddress;
    }

    public void setChairmanAddress(String chairmanAddress) {
        this.chairmanAddress = chairmanAddress;
    }
}
