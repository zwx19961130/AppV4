package com.example.n404.myapplication_luo_2.CModel;

import com.example.n404.myapplication_luo_2.SModel.Purchase;

/**
 * Created by luo on 16-11-26.
 * 客户端购买条目类相比服务器端的购买条目，增加了用户的昵称和商品价格delta价
 */

public class ClientPurchase {
    private Purchase sPurchase;
    private int deltaPrice;
    private String buyerName;


    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public int getDeltaPrice() {
        return deltaPrice;
    }

    public void setDeltaPrice(int deltaPrice) {
        this.deltaPrice = deltaPrice;
    }

    public Purchase getsPurchase() {
        return sPurchase;
    }

    public void setsPurchase(Purchase sPurchase) {
        this.sPurchase = sPurchase;
    }


}
