package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;

/**
 * Created by luo on 16-11-26.
 * 这个fragment是用来发生交易的，提供给交易activity，点击条目的时候，有交流和交易选项。
 */

public class TradeConcreRecyPurListFrag extends RecyPurListFrag {

    @Override
    protected View.OnClickListener getOnclickLis() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //当点击一条竞价的时候，会弹出对话框，询问是对话还是发生交易。
            }
        };
    }

}
