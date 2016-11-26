package com.example.n404.myapplication_luo_2.DAOIF;

import com.example.n404.myapplication_luo_2.SModel.Good;
import com.example.n404.myapplication_luo_2.SModel.Purchase;

/**
 * Created by luo on 16-11-26.
 * 这个接口是为对客户端商品的读写操作提供统一的方法集合，具体的dao需要继承本接口
 * 客户端商品的dao应该包括，
 *  对某一件商品增加一条竞价
 *  增加一件商品
 *  卖出某件商品
 */

public interface ClientGoodDAOIF {
    public void addOneGood(Good good);
    public void saleOutOneGood(Good good);
    public void addPurchase(Purchase purchase);
}
