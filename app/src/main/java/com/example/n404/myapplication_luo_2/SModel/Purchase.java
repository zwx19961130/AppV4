package com.example.n404.myapplication_luo_2.SModel;

/**
 * Created by luo on 16-11-26.
 */

public class Purchase {
    public static int getCurrntMaxId() {
        return currntMaxId;
    }
    public  static  int currntMaxId;
    public int pid;
    public int price;
    public int salerId;
    public  int goodId;
    public String extraMessage;
    public static void setCurrntMaxId(int currntMaxId) {
        Purchase.currntMaxId = currntMaxId;
    }

    public String getExtraMessage() {
        return extraMessage;
    }

    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
