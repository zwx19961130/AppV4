package com.example.n404.myapplication_luo_2.CModel;

import com.example.n404.myapplication_luo_2.SModel.Good;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 这个类意在封装客户端的用户对象，客户端的用户对象，需要持有一个用户对象，并且持有其所买客户端商品的列表，持有与之通信的用户的列表，这个类只有一个实例
 * 它所指向的人就是手机的使用者。
 * 本类使用单例模式，全局只可以获得本类的一个实例
 */

public class ClientUser {
    private  static ClientUser clientUser=new ClientUser();
    public static  ClientUser getPhoneClientUser(){
        return  clientUser;
    }
    public ClientUser(){}
    private static User phoneUser;
        private ArrayList<ClientOtherUser> cotactersList;
        private ArrayList<Good> clientSaleGoodsList;

    public User getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(User phoneUser) {
        this.phoneUser = phoneUser;
    }

    public ArrayList<Good> getClientSaleGoodsList() {
        return clientSaleGoodsList;
    }

    public void setClientSaleGoodsList(ArrayList<Good> clientSaleGoodsList) {
        this.clientSaleGoodsList = clientSaleGoodsList;
    }

    public ArrayList<ClientOtherUser> getCotactersList() {
        return cotactersList;
    }

    public void setCotactersList(ArrayList<ClientOtherUser> cotactersList) {
        this.cotactersList = cotactersList;
    }

}
