package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule.UpTrainRent;

/**
 * Created by Xubisoft on 2/14/2018.
 */

public class UpTrainRentIDRegister {

    private int id;
    private String train;
    private String aCSeat;
    private String snigdaAC;
    private String firstClass;
    private String shovonChair;
    private String shovon;
    private String sulob;
    private String notice;

    public UpTrainRentIDRegister(int id, String train, String aCSeat, String snigdaAC, String firstClass, String shovonChair, String shovon, String sulob, String notice) {
        this.id = id;
        this.train = train;
        this.aCSeat = aCSeat;
        this.snigdaAC = snigdaAC;
        this.firstClass = firstClass;
        this.shovonChair = shovonChair;
        this.shovon = shovon;
        this.sulob = sulob;
        this.notice = notice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getaCSeat() {
        return aCSeat;
    }

    public void setaCSeat(String aCSeat) {
        this.aCSeat = aCSeat;
    }

    public String getSnigdaAC() {
        return snigdaAC;
    }

    public void setSnigdaAC(String snigdaAC) {
        this.snigdaAC = snigdaAC;
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    public String getShovonChair() {
        return shovonChair;
    }

    public void setShovonChair(String shovonChair) {
        this.shovonChair = shovonChair;
    }

    public String getShovon() {
        return shovon;
    }

    public void setShovon(String shovon) {
        this.shovon = shovon;
    }

    public String getSulob() {
        return sulob;
    }

    public void setSulob(String sulob) {
        this.sulob = sulob;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
