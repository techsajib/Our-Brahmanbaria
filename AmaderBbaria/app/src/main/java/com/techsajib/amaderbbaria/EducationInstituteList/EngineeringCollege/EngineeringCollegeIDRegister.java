package com.techsajib.amaderbbaria.EducationInstituteList.EngineeringCollege;

/**
 * Created by Xubisoft on 2/7/2018.
 */

public class EngineeringCollegeIDRegister {

    private int id;
    private int logo;
    private String college;
    private String placed;
    private String location;

    public EngineeringCollegeIDRegister(int id, int logo, String college, String placed, String location) {
        this.id = id;
        this.logo = logo;
        this.college = college;
        this.placed = placed;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPlaced() {
        return placed;
    }

    public void setPlaced(String placed) {
        this.placed = placed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
