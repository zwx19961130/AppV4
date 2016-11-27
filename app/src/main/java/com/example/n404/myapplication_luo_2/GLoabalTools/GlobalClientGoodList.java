package com.example.n404.myapplication_luo_2.GLoabalTools;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.DAO.ClientUserDAO;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 这个类就是最直接获取当前内存最新的上架的商品列表数据
 *
 */

public class GlobalClientGoodList {
    public static ArrayList<ClientGood> currentCLientSaleGoodList= ClientUserDAO.getMe().getClientSaleGoodsList();
    public static ArrayList<ClientGood> getList(){
        return  currentCLientSaleGoodList;
    }
}
