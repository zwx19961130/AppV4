package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.DAOIF.ServerComsDAOIF;
import com.example.n404.myapplication_luo_2.SModel.Communicate;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 * 这个类面向服务器，用来发送一条消息，插入到表中，面向服务器获得某表的校验码，面向服务器做读操作，读取某用户的所有对话记录
 *  面向客户端，这个类维护一个列表，持有所有的与客户有关的聊天记录
 *  面向本地数据库，提供增操作。
 */

public class ServerCommunicateDAO implements ServerComsDAOIF {
    private static ArrayList<Communicate> relatedComs;
    @Override
    public void startUp() {
        //启动的时候，从本地数据库持有所有的记录
    }

    @Override
    public void trySync() {
        //这个方法对比数据库的那张表的校验码和本地的校验码，如果校验码不相同，那么就获取数据库的全表，持久化到本地，本刷新维护的列表
    }

    @Override
    public void addOneCom(Communicate communicate) {
        //面向服务器发出一条记录的提交请求
    }

    @Override
    public ArrayList<Communicate> getRelatedComs(User phoneUser) {
        //面向客户端程序员，提供获取所有相关的会话记录
        return null;
    }
}
