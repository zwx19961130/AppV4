package com.example.n404.myapplication_luo_2.CModel;

import com.example.n404.myapplication_luo_2.SModel.Good;
import com.example.n404.myapplication_luo_2.SModel.Purchase;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 客户端商品类，这个类持有一个服务器端的商品，并持有一个与之相关的竞价列表，本类的一个实例可以方便填充一个商品item
 */

public class ClientGood {
    private Good good;
    private ArrayList<ClientPurchase> purchaseListToThisGood;


    public ClientGood(){
        //无参空构造器
    }
    public Good getGood() {
        return good;
    }
    public void setGood(Good good) {
        this.good = good;
    }

    public ArrayList<ClientPurchase> getPurchaseListToThisGood() {
        return purchaseListToThisGood;
    }

    public void setPurchaseListToThisGood(ArrayList<ClientPurchase> purchaseListToThisGood) {
        this.purchaseListToThisGood = purchaseListToThisGood;
    }

}
