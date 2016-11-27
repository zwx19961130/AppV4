package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.DAOIF.ServerComsDAOIF;
import com.example.n404.myapplication_luo_2.SModel.Communicate;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by luo on 16-11-27.
 * 这个类面向服务器，用来发送一条消息，插入到表中，面向服务器获得某表的校验码，面向服务器做读操作，读取某用户的所有对话记录
 *  面向客户端，这个类维护一个列表，持有所有的与客户有关的聊天记录
 *  面向本地数据库，提供增操作。
 */

public class ServerCommunicateDAO implements ServerComsDAOIF {
    private static ServerCommunicateDAO serverCommunicateDAO=new ServerCommunicateDAO();
    private ServerCommunicateDAO(){}
    public static ServerCommunicateDAO getMe(){
        return serverCommunicateDAO;
    }
    private static ArrayList<Communicate> relatedComs;
    static
    {
        startUp();
    }

    public static void startUp() {
        //启动的时候，从本地数据库持有所有的记录
        relatedComs=new ArrayList<>();
        for(int i=1;i<=4;i++){
            Communicate c=new Communicate();
            c.setCid(i);
            c.setConntent("hello");
            c.setDate(new Date());
            switch (i){
                case 1:
                    c.setSpeakerId(1);
                    c.setListenerId(2);
                break;
                case 2:
                    c.setSpeakerId(2);
                    c.setListenerId(1);
                break;
                case 3:
                    c.setSpeakerId(3);
                    c.setListenerId(1);
                break;
                case 4:
                    c.setSpeakerId(1);
                    c.setListenerId(3);
                break;
                default:
                    break;
            }
            //
            relatedComs.add(c);
        }
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
    public ArrayList<Communicate> getRelatedComs() {
        //面向客户端程序员，提供获取所有相关的会话记录
        return relatedComs;
    }
}
