package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.view.View;

/**
 * Created by luo on 16-11-26.
 */

public class PublicConcreRecyPurListFrag extends RecyPurListFrag {
    @Override
    protected View.OnClickListener getOnclickLis() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //P点击公开区的会直接展开对话
            }
        };
    }
}
