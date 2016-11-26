package com.example.n404.myapplication_luo_2;

import android.support.v4.app.Fragment;

import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.TradeConcreRecyPurListFrag;

/**
 * Created by luo on 16-11-27.
 */

public class TradeActivity extends AbstradeActivityForExtend {
    @Override
    public int giveMeLayoutRes() {
        return R.layout.activity_trade;
    }
    @Override
    public Fragment giveMeCoreFrag() {
        return new TradeConcreRecyPurListFrag();
    }
    @Override
    public int giveMeContainerId() {
        return R.id.trade_acvt_layout_frame;
    }
}
