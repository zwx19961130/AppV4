package com.example.n404.myapplication_luo_2.GLoabalTools;

import com.example.n404.myapplication_luo_2.CModel.ClientOtherUser;
import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.SModel.User;

/**
 * Created by luo on 16-11-26.
 * 本类和全局物品选择类一样提供一个全局类用来全局持有选中的谈话对象
 */

public class GLoabalUserSelect {
    public static User getUserSelect() {
        return userSelect;
    }

    public static void setUserSelect(User userSelect) {
        GLoabalUserSelect.userSelect = userSelect;
    }

    private static User userSelect;

    private static ClientOtherUser clientOtherUser=new ClientOtherUser();
    public static void  setClientOtherUser(ClientOtherUser otherUser){
        clientOtherUser=otherUser;
    }
    public static ClientOtherUser getClientOtherUser(){
        return clientOtherUser;
    }
}
