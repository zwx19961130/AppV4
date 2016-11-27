package com.example.n404.myapplication_luo_2.DAO;

import android.util.Log;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.DAOIF.ClientGoodDAOIF;
import com.example.n404.myapplication_luo_2.SModel.Good;
import com.example.n404.myapplication_luo_2.SModel.Purchase;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 *  这个接口是为对客户端商品的读写操作提供统一的方法集合，具体的dao需要继承本接口
 *  客户端商品的dao应该包括，
 *  初始化的填充客户端商品对象
 *  查看全局的客户端商品对象
 *  对某一件商品增加一条竞价
 *  增加一件商品
 *  卖出某件商品
 */

public class ClientGoodDAO implements ClientGoodDAOIF {
    private static ArrayList<ClientGood> clientGoodArrayList=new ArrayList<>();
    static
    {
        startUp();
        Log.e("CLientGoodDAO","静态代码块已经执行");
    }
    private static ClientGoodDAO me=new ClientGoodDAO();
    private ClientGoodDAO(){
    }
    public static  ClientGoodDAO getMe(){
        return  me;
    }
    public ArrayList<ClientGood> getClientGoodArrayList(){
        return clientGoodArrayList;
    }
//region startup
    public static   void startUp(){
        //初始化
        for(Good g:ServerGoodDAO.getMe().getServerGoodList()){
            ClientGood clientGood=new ClientGood();
            clientGood.setGood(g);
            ArrayList<Purchase> purchaseArrayList=new ArrayList<>();
            switch (g.getGid()){
                case 1:
                    for(int i=1;i<=3;i++){
                        Purchase p=new Purchase();
                        p.setSalerId(2);
                        p.setExtraMessage("i want it");
                        p.setGoodId(1);
                        p.setPid(i);
                        p.setPrice(i);
                    }
                    break;
                case 2:
                    for(int i=1;i<=3;i++){
                        Purchase p=new Purchase();
                        p.setSalerId(1);
                        p.setExtraMessage("i want it");
                        p.setGoodId(2);
                        p.setPid(i);
                        p.setPrice(i);
                    }
                break;
                case 3:
                    for(int i=1;i<=3;i++){
                        Purchase p=new Purchase();
                        p.setSalerId(1);
                        p.setExtraMessage("i want it");
                        p.setGoodId(3);
                        p.setPid(i);
                        p.setPrice(i);
                    }
                break;
                default:
                    break;
            }
            clientGood.setPurchaseListToThisGood(purchaseArrayList);
        }
    }
//endregion
    @Override
    public void addOneGood(Good good) {

    }

    @Override
    public void saleOutOneGood(Good good) {

    }

    @Override
    public void addPurchase(Purchase purchase) {

    }
}
