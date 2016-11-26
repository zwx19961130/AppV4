package com.example.n404.myapplication_luo_2.SModel;

/**
 * Created by luo on 16-11-26.
 */

public class Trade {

    public  static  int currentMaxId;
    public  int tid;
    public  int purchaseId;

    public static int getCurrentMaxId() {
        return currentMaxId;
    }

    public static void setCurrentMaxId(int currentMaxId) {
        Trade.currentMaxId = currentMaxId;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

}
