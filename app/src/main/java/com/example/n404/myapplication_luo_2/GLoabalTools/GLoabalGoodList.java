package com.example.n404.myapplication_luo_2.GLoabalTools;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.DAO.ClientGoodDAO;
import com.example.n404.myapplication_luo_2.DAO.ServerGoodDAO;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 */

public class GLoabalGoodList {
    private  static ArrayList<ClientGood> goodArrayList= ClientGoodDAO.getMe().getClientGoodArrayList();
    public  static  ArrayList<ClientGood> getGoodArrayList(){
        return  goodArrayList;
    }
}
