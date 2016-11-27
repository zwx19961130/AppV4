package com.example.n404.myapplication_luo_2.DAOIF;

import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 这个接口提供对服务器用户的增删改查，继承它的类需要完成与服务器的网络通信
 * 提供的方法集合包括：
 *      对用户的增删改查
 */

public interface ServerUserDAOIF {
   // public void startUp();
    public void trySync();
    public  void addOneUser(User user);
    public ArrayList<User> getServerUserList();
}
