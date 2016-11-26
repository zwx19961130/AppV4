package com.example.n404.myapplication_luo_2.SModel;

/**
 * Created by luo on 16-11-26.
 */

public class User {
    private static int currrntMax;
    public int stuId;
    public int legalFlag;
    public String nickName;
    public String phone;
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getLegalFlag() {
        return legalFlag;
    }

    public void setLegalFlag(int legalFlag) {
        this.legalFlag = legalFlag;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getCurrrntMax() {
        return currrntMax;
    }

    public static void setCurrrntMax(int currrntMax) {
        User.currrntMax = currrntMax;
    }
}
