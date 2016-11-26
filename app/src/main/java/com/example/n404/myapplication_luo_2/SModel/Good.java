package com.example.n404.myapplication_luo_2.SModel;

/**
 * Created by luo on 16-11-26.
 */

public class Good {
    public static int currentMaxId;


    public int gid;
    public int price;
    public int salerId;
    public  String picResUrl;
    public  String extraMessage;
    public static int getCurrentMaxId() {
        return currentMaxId;
    }

    public static void setCurrentMaxId(int currentMaxId) {
        Good.currentMaxId = currentMaxId;
    }

    public String getExtraMessage() {
        return extraMessage;
    }

    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getPicResUrl() {
        return picResUrl;
    }

    public void setPicResUrl(String picResUrl) {
        this.picResUrl = picResUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalerId() {
        return salerId;
    }

    public void setSalerId(int salerId) {
        this.salerId = salerId;
    }

}
