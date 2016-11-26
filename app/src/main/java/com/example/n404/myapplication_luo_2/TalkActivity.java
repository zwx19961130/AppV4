package com.example.n404.myapplication_luo_2;

import android.support.v4.app.Fragment;

import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.RecyTalkCoreFrag;

/**
 * Created by luo on 16-11-27.
 */

public class TalkActivity extends AbstradeActivityForExtend {
    @Override
    public int giveMeLayoutRes() {
        return R.layout.activity_talk;
    }
    @Override
    public Fragment giveMeCoreFrag() {
        return new RecyTalkCoreFrag();
    }
    @Override
    public int giveMeContainerId() {
        return R.id.frame_contain_talks_id;
    }
}
