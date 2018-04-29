package com.techsajib.amaderbbaria.HomeProfile.ReligiousPlace.Orphange;

/**
 * Created by User on 1/10/2018.
 */

public class OrphangeIDRegister {

    private int id;
    private int logo;
    private String orphange;
    private String orphangeSeat;
    private String orphangeLocation;

    public OrphangeIDRegister(int id, int logo, String orphange, String orphangeSeat, String orphangeLocation) {
        this.id = id;
        this.logo = logo;
        this.orphange = orphange;
        this.orphangeSeat = orphangeSeat;
        this.orphangeLocation = orphangeLocation;
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

    public String getOrphange() {
        return orphange;
    }

    public void setOrphange(String orphange) {
        this.orphange = orphange;
    }

    public String getOrphangeSeat() {
        return orphangeSeat;
    }

    public void setOrphangeSeat(String orphangeSeat) {
        this.orphangeSeat = orphangeSeat;
    }

    public String getOrphangeLocation() {
        return orphangeLocation;
    }

    public void setOrphangeLocation(String orphangeLocation) {
        this.orphangeLocation = orphangeLocation;
    }
}
