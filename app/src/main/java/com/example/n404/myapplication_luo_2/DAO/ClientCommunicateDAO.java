package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.CModel.ClientOtherUser;
import com.example.n404.myapplication_luo_2.DAOIF.CLientCommunicateIF;
import com.example.n404.myapplication_luo_2.SModel.Communicate;

import org.w3c.dom.ProcessingInstruction;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 *  * 这个接口的服务的对象是对话activity，用来联络对话activity与某个具体用户的会话信息
 * 方法集包括
 *  获取某个用户的会话集合
 *  创建一条会话
 */

public class ClientCommunicateDAO implements CLientCommunicateIF{
    private static ArrayList<Communicate> communicateArrayList=new ArrayList<>();
    private static ClientCommunicateDAO me=new ClientCommunicateDAO();
    public static ClientCommunicateDAO getMe(){
        return me;
    }

    private ClientCommunicateDAO(){}
    @Override
    public ArrayList<Communicate> getComsWithHim(ClientOtherUser clientOtherUser) {
        return clientOtherUser.getCommuBetHeAndMe();
    }

    @Override
    public void addOneCom(Communicate communicate, ClientOtherUser clientOtherUser) {

    }
}
