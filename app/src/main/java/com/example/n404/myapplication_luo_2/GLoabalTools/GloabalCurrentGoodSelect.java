package com.example.n404.myapplication_luo_2.GLoabalTools;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;

/**
 * Created by luo on 16-11-26.
 */

public class GloabalCurrentGoodSelect {
    private  static ClientGood clientGood=new ClientGood();
    public static  void SetCurrentGood(ClientGood newClient){
        clientGood=newClient;
    }
    public static  ClientGood getClientGood(){
        return  clientGood;
    }
}
