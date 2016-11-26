package com.example.n404.myapplication_luo_2.GLoabalTools;

/**
 * Created by luo on 16-11-26.
 * 这个类用来做非线性计算，最重要的就是一个int的映射方法，输入从0-100,但是输出是从0-9999
 */

public class GLobalNotLinerVauleCacul {
    public static  int toInnormal(int input){
        if(input>=0&&input<15){
            return  input;
        }
        else {
            return  (input-15)*(input-15)+15;
        }
    }
    public  static  int toNormal(int noNormal){
        if(noNormal<=16){
            return  noNormal;
        }else{
            return ((int) Math.sqrt((double) (noNormal-15)))+15;
        }
    }
}
