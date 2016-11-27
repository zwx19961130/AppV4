package com.example.n404.myapplication_luo_2.DAOIF;

import android.widget.ArrayAdapter;

import com.example.n404.myapplication_luo_2.CModel.ClientOtherUser;
import com.example.n404.myapplication_luo_2.SModel.Communicate;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-27.
 *   这个dao从servercoms（与本用户相关的会话）和serveruserdao（全部的用户）
 *  从这两个用户里合成一个客户端用户的列表，此类生产并维护该列表
 *      面向其它dao，当servercoms发生添加事件的时候，可以刷新本列表
 *      面向客户端用户，本类提供一个客户端用户对象
 */

public interface ClientOtherUsersDAOIF {
    public ArrayList<ClientOtherUser> getCLientOtherUsers();
    public void compound();
    public String sendToOneClientUser(Communicate communicate);
}
