package com.example.n404.myapplication_luo_2.DAOIF;

import com.example.n404.myapplication_luo_2.CModel.ClientOtherUser;
import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.SModel.Communicate;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 这个接口的服务的对象是对话activity，用来联络对话activity与某个具体用户的会话信息
 * 方法集包括
 *  获取某个用户的会话集合
 *  创建一条会话
 */

public interface CLientCommunicateIF {
    public ArrayList<Communicate> getComsWithHim(ClientOtherUser clientOtherUser);
    public void addOneCom(Communicate communicate,ClientOtherUser clientOtherUser);
}
