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
    public void startUp() {
        clientUser.setPhoneUser(ServerUserDAO.getMe().getServerUserList().get(0));

    }
    public void reFresh(){
        ArrayList<Good> sonList=new ArrayList<>();
        ArrayList<Good> mysaleList=new ArrayList<>();
        mysaleList=ServerGoodDAO.getMe().getServerGoodList();
        for(Good g:mysaleList){
            if(g.getSalerId()==1){
                sonList.add(g);
            }
        }
        clientUser.setClientSaleGoodsList(sonList);
        //这个地方需要持有其它客户端其它用户，稍等
    }

    @Override
    public String getCLientUserNickName() {
        return null;
    }

    @Override
    public void setClientUserNickName(String newNickName) {

    }
}
