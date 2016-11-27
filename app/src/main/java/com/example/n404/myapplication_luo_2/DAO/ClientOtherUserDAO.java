package com.example.n404.myapplication_luo_2.DAO;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.CModel.ClientOtherUser;
import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.DAOIF.CLientUserDAOIF;
import com.example.n404.myapplication_luo_2.DAOIF.ClientOtherUsersDAOIF;
import com.example.n404.myapplication_luo_2.SModel.Communicate;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 * 这个类维护一个列表，改列表持有客户端用户类，最重要的是初始化填充数据模型，和更新模型，和提供给其他类本类维护的核心产品
 */

public class ClientOtherUserDAO implements ClientOtherUsersDAOIF {
    private static  ArrayList<ClientOtherUser> clientOtherUsers=new ArrayList<>();
//    static {
//        startUp();
//    }
    public static void startUp(){
        for(User u:ServerUserDAO.getMe().getServerUserList()){
            ClientOtherUser clientOtherUser=new ClientOtherUser();
            clientOtherUser.setUser(u);
            clientOtherUser.setCommuBetHeAndMe(new ArrayList<Communicate>());
        }
        for(Communicate c:ServerCommunicateDAO.getMe().getRelatedComs()){
            for(ClientOtherUser cou:clientOtherUsers){
                if(cou.getUser().getStuId()==c.getSpeakerId()||cou.getUser().getStuId()==c.getListenerId()){
                    //这条谈话记录归属于user
                    cou.getCommuBetHeAndMe().add(c);
                }
            }
        }
    }
    private ClientOtherUserDAO(){
    }
    private static  ClientOtherUserDAO clientOtherUserDAO=new ClientOtherUserDAO();
    public static ClientOtherUserDAO getMe(){
        return clientOtherUserDAO;
    }
    @Override
    public ArrayList<ClientOtherUser> getCLientOtherUsers() {
        return clientOtherUsers;
    }

    @Override
    public void compound() {

    }

    @Override
    public String sendToOneClientUser(Communicate communicate) {
        return null;
    }
}
