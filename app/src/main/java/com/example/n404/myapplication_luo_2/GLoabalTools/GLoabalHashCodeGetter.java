package com.example.n404.myapplication_luo_2.GLoabalTools;

import com.example.n404.myapplication_luo_2.SModel.Good;

/**
 * Created by luo on 16-11-26.
 * 这个类也是可以全局调用的，它用来计算当前内存中的某个全局数据得到一个校验码，将这个校验码和与服务器校验码做比较
 *      如果校验码相同，就不做同步，否则就开始与服务器做同步
 *      服务器商品列表生成一个校验码
 *      针对一个商品也生成一个校验码
 *      针对一个人的会话也生成一个校验码
 */

public class GLoabalHashCodeGetter {
    public static int getGoodListHashCode() {
        return 0;
    }
    public static  int getOneGoodPurchaseHashCode(Good good){
        return 0;
    }
    public static  int getRelatedComsHashCode(){
        return 0;
    }
}
