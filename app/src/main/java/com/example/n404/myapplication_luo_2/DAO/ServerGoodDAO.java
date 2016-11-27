package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.DAOIF.ServerGoodDAOIF;
import com.example.n404.myapplication_luo_2.SModel.Good;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 * 这个类维护本地的一张表，一张全部在售商品的表，同时具有与服务器同步的方法，和本地的增删改查的方法
 * 面向服务器提供增删该发布商品的逻辑
 * 面向客户端提供增删改查看本地数据库的全部在售列表的内容
 *
 */

public class ServerGoodDAO implements ServerGoodDAOIF{
    private static ArrayList<Good> serverGoodList;
    @Override
    public void startUp() {
        //启动时，面向本地的查询

        //
    }

    @Override
    public void trySync() {
        //发现校验码不同的时候，面向本地的修改
    }

    @Override
    public void addGoodToServer(Good good) {
        //面向服务器的增
    }

    @Override
    public ArrayList<Good> getServerGoodList() {
        //面向外人的提供核心资源
        return null;
    }

    @Override
    public void saleOutOneGood(Good good) {
        //面向服务器的改
    }
}
