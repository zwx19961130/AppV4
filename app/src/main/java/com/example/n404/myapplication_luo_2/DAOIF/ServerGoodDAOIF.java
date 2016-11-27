package com.example.n404.myapplication_luo_2.DAOIF;

import com.example.n404.myapplication_luo_2.SModel.Good;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 这个接口指明了与服务区通信的方法集合,实现它的类需要完成网络通信的逻辑
 *      包括方法：
 *          对服务器good的增删改查
 */

public interface ServerGoodDAOIF {
    public void startUp();
    public void trySync();
    public void addGoodToServer(Good good);
    public ArrayList<Good> getServerGoodList();
    public  void saleOutOneGood(Good good);
}
