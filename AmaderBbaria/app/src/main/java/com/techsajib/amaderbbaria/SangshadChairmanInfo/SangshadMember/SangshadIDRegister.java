package com.techsajib.amaderbbaria.SangshadChairmanInfo.SangshadMember;

/**
 * Created by User on 1/14/2018.
 */

public class SangshadIDRegister {

    private int id;
    private int logo;
    private String name;
    private String designation;
    private String seatNumber;
    private String electionPlaced;
    private String electionParty;

    public SangshadIDRegister(int id, int logo, String name, String designation, String seatNumber, String electionPlaced, String electionParty) {
        this.id = id;
        this.logo = logo;
        this.name = name;
        this.designation = designation;
        this.seatNumber = seatNumber;
        this.electionPlaced = electionPlaced;
        this.electionParty = electionParty;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getElectionPlaced() {
        return electionPlaced;
    }

    public void setElectionPlaced(String electionPlaced) {
        this.electionPlaced = electionPlaced;
    }

    public String getElectionParty() {
        return electionParty;
    }

    public void setElectionParty(String electionParty) {
        this.electionParty = electionParty;
    }
}
