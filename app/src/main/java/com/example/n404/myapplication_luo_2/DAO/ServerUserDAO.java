package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.DAOIF.ServerUserDAOIF;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 * 这个dao，服务的对象是服务器端的用户，使用这个dao，先从本地数据库中取出数据，也可以选择从服务器端取数据
 *  从服务器端取出数据的逻辑是，取出信息后，先完成本地的数据的同步，然后调用自己的取本地的数据的方法
 *  这个类维护一个服务器客户类的列表，这个列表持有的是全部user用户
 */

public class ServerUserDAO implements ServerUserDAOIF {
    private static ServerUserDAO  serverUserDAO=new ServerUserDAO();
    private ServerUserDAO(){};
    public static ServerUserDAO getMe(){
        return serverUserDAO;
    }
    private static ArrayList<User> allUsers;
    {
        startUp();
    }
    public void startUp(){
        //这个方法从数据库中填充这个列表
        allUsers=new ArrayList<>();
        for(int i=1;i<=3;i++){
            User u=new User();
            u.setLegalFlag(0);
            u.setNickName("user"+i);
            u.setStuId(i);
            u.setPhone("110"+i);
            //填充
            allUsers.add(u);
        }
    }


    public void trySync(){
        //这个方法尝试与服务器同步，当发现哈希码不同的时候，从服务器端得到一个全局用户列表

    }

    @Override
    public void addOneUser(User user) {
        //发送一个添加用户的请求
    }

    @Override
    public   ArrayList<User> getServerUserList() {
        //面向客户端的程序员，提供核心资源userlist
        return allUsers;
    }
}
