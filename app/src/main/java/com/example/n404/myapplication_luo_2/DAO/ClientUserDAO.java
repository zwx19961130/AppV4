package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.DAOIF.CLientUserDAOIF;
import com.example.n404.myapplication_luo_2.SModel.Good;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 *
 */

public class ClientUserDAO implements CLientUserDAOIF{
    private  static ClientUser clientUser=new ClientUser();

    @Override
    public  void startUp(){}
    public static void myStartUp() {
        clientUser.setPhoneUser(ServerUserDAO.getMe().getServerUserList().get(0));
        reFresh();
    }
    public static void reFresh(){
        ArrayList<Good> sonList=new ArrayList<>();
        ArrayList<Good> mysaleList=new ArrayList<>();
        mysaleList=ServerGoodDAO.getMe().getServerGoodList();
        for(Good g:mysaleList){
            if(g.getSalerId()==1){
                sonList.add(g);
            }
        }
        //手工添加对话

        clientUser.setClientSaleGoodsList(sonList);
        clientUser.setCotactersList(ClientOtherUserDAO.getMe().getCLientOtherUsers());
        //这个地方需要持有其它客户端其它用户，稍等
    }
    public static ClientUser getMe(){
        if(clientUser.getCotactersList()==null||clientUser.getClientSaleGoodsList()==null){
            myStartUp();
        }
        return  clientUser;
    }
    @Override
    public String getCLientUserNickName() {
        return null;
    }

    @Override
    public void setClientUserNickName(String newNickName) {

    }
}
