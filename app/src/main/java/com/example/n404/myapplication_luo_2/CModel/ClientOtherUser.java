package com.example.n404.myapplication_luo_2.CModel;

import android.widget.ArrayAdapter;

import com.example.n404.myapplication_luo_2.SModel.Communicate;
import com.example.n404.myapplication_luo_2.SModel.User;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-26.
 * 这个类用来在客户端持有非本机用户的用户，它是为对话而准备的，持有一个列表，装载他与我之间的会话
 */

public class ClientOtherUser {
    private User user;
    private ArrayList<Communicate> commuBetHeAndMe;
    public ClientOtherUser(){}

    public ArrayList<Communicate> getCommuBetHeAndMe() {
        return commuBetHeAndMe;
    }

    public void setCommuBetHeAndMe(ArrayList<Communicate> commuBetHeAndMe) {
        this.commuBetHeAndMe = commuBetHeAndMe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
