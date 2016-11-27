package com.example.n404.myapplication_luo_2.DAOIF;

import com.example.n404.myapplication_luo_2.SModel.Communicate;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 *  请注意，继承这个接口的类需要向服务器发送本用户的id，服务器通过查询，返回与此用户相关的用户的会话集合
 *  方法集合包括：
 *      获取相关的会话集合
 *      添加一条会话
 *
 */
public interface ServerComsDAOIF {
    public  void startUp();
    public void trySync();
    public void addOneCom(Communicate communicate);
    public  ArrayList<Communicate> getRelatedComs(User phoneUser);
}
