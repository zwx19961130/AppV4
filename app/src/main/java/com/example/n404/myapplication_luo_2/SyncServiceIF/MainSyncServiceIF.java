package com.example.n404.myapplication_luo_2.SyncServiceIF;

import com.example.n404.myapplication_luo_2.SModel.Good;
import com.example.n404.myapplication_luo_2.SModel.User;

/**
 * Created by luo on 16-11-26.
 * 这是一个极其核心的类，这个类用来比较本地数据与服务器数据
 *      如果如果哪个数据不同，就选择性地调相应的到同步本地或者同步服务器
 *       方法集合包括
 *          刷新本地商品列表
 *          刷新本地某个商品的竞价列表
 *          刷新本地会话的总列表
 */

public interface MainSyncServiceIF {
    public void refreshAllGoodList();
    public void refreshACertianGoodPurchaseList(Good good);
    public void refreshUserComsList(User phoneUser);
}
