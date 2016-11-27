package com.example.n404.myapplication_luo_2.DAOIF;

/**
 * Created by luo on 16-11-26.
 * 这个接口面向的是手机使用者本身的数据的访问和修改
 *  提供的方法集合有如下方法：
 *     获取当前用户的昵称
 *     修改用户昵称
 *
 */

public interface CLientUserDAOIF {
    public void startUp();
    public  String getCLientUserNickName();
    public  void setClientUserNickName(String newNickName);
}
