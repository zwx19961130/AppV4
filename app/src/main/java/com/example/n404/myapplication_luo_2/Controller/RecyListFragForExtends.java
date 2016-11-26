package com.example.n404.myapplication_luo_2.Controller;

/**
 * Created by luo on 16-11-26.
 */


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by luo on 16-11-23.
 * 这个抽象类用来为6个 循环列表碎片提供父类，在子类中只需要补加适配器类，补加一个子类viewholder类
 */

public abstract class RecyListFragForExtends extends Fragment  {
    protected RecyclerView mainFragListView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        View v=inflater.inflate(getRLayoutSource(),viewGroup,false);
        mainFragListView= (RecyclerView) v.findViewById(getInnerRecyViewId());
        mainFragListView.setAdapter(getAdapter());
        mainFragListView.setLayoutManager(new LinearLayoutManager(getContext()));
        return  v;
    }
    //重写这个方法，在方法体中交代与之适配的适配器
    public   abstract   RecyclerView.Adapter getAdapter();

    //重写这个方法，在方法体中交代整个碎片的布局文件，在下面的方法中交代布局文件内部的recycleview的id
    public  abstract   int getRLayoutSource();

    //重写这个方法，在方法体中交代布局文件下的recycleview的id
    public  abstract  int getInnerRecyViewId();
    //交付item 的视图资源文件
    public abstract  int getItemLayoutRes();
}