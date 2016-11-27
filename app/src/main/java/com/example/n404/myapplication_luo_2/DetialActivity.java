package com.example.n404.myapplication_luo_2;

import android.support.v4.app.Fragment;

import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.PublicConcreRecyPurListFrag;

/**
 * Created by luo on 16-11-27.
 * 此活动为详情活动，通过抽象，已经变得十分的简洁了
 */

public class DetialActivity extends AbstradeActivityForExtend {

    @Override
    public int giveMeLayoutRes() {
        return R.layout.activity_detials;
    }
    @Override
    public Fragment giveMeCoreFrag() {
        return new PublicConcreRecyPurListFrag();
    }
    @Override
    public int giveMeContainerId() {
        return R.id.frame_cont_for_purc_id;
    }
}
