package com.example.n404.myapplication_luo_2.GLoabalTools;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 */

public class GLoabalGoodList {
    private  static ArrayList<ClientGood> goodArrayList=new ArrayList<>();
    public  static  ArrayList<ClientGood> getGoodArrayList(){
        return  goodArrayList;
    }
}
