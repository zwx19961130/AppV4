package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.DAOIF.CLientUserDAOIF;

/**
 * Created by luo on 16-11-27.
 *
 */

public class ClientUserDAO implements CLientUserDAOIF{
    private  static ClientUser clientUser;

    @Override
    public void startUp() {
      //  clientUser=
    }

    @Override
    public String getCLientUserNickName() {
        return null;
    }

    @Override
    public void setClientUserNickName(String newNickName) {

    }
}
