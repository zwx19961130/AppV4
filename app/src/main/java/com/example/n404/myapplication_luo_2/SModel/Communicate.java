package com.example.n404.myapplication_luo_2.SModel;

/**
 * Created by luo on 16-11-26.
 */

public class Communicate {
    public static  int currentMaxId;
    public  int speakerId;
    public  int listenerId;
    public  String conntent;

    public String getConntent() {
        return conntent;
    }

    public void setConntent(String conntent) {
        this.conntent = conntent;
    }

    public static int getCurrentMaxId() {
        return currentMaxId;
    }

    public static void setCurrentMaxId(int currentMaxId) {
        Communicate.currentMaxId = currentMaxId;
    }

    public int getListenerId() {
        return listenerId;
    }

    public void setListenerId(int listenerId) {
        this.listenerId = listenerId;
    }

    public int getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(int speakerId) {
        this.speakerId = speakerId;
    }

}

