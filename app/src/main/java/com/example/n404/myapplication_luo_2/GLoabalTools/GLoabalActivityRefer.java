package com.example.n404.myapplication_luo_2.GLoabalTools;

import android.app.Activity;
import android.util.ArrayMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luo on 16-11-26.
 * 这个全局类意在提供对全局activity的引用，内含一个map，是class类和activity的引用的映射关系
 *      这个类提供添加映射关系的全局方法
 *      提供获取引用的全局方法
 */

public class GLoabalActivityRefer {
    private   static HashMap<Class,Activity> globalActRefer=new HashMap<>();
    public  Activity getRefer(Class c){
        return  globalActRefer.get(c);
    }
    public  static void  insertRefer(Class c,Activity activity){
        globalActRefer.put(c,activity);
    }
}
