package com.techsajib.amaderbbaria.CommunicationSystem.TrainService.UpTrainTimeSchedule;

/**
 * Created by Xubisoft on 2/13/2018.
 */

public class UpTrainIDRegister {

    private int id;
    private String trainnumber;
    private String train;
    private String trainOffDay;
    private String realTime;
    private String BbTime;
    private String noticed;


    public UpTrainIDRegister(int id, String trainnumber, String train, String trainOffDay, String realTime, String bbTime, String noticed) {
        this.id = id;
        this.trainnumber = trainnumber;
        this.train = train;
        this.trainOffDay = trainOffDay;
        this.realTime = realTime;
        BbTime = bbTime;
        this.noticed = noticed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainnumber() {
        return trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        this.trainnumber = trainnumber;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getTrainOffDay() {
        return trainOffDay;
    }

    public void setTrainOffDay(String trainOffDay) {
        this.trainOffDay = trainOffDay;
    }

    public String getRealTime() {
        return realTime;
    }

    public void setRealTime(String realTime) {
        this.realTime = realTime;
    }

    public String getBbTime() {
        return BbTime;
    }

    public void setBbTime(String bbTime) {
        BbTime = bbTime;
    }

    public String getNoticed() {
        return noticed;
    }

    public void setNoticed(String noticed) {
        this.noticed = noticed;
    }
}
