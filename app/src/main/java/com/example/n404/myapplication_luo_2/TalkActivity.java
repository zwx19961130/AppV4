package com.example.n404.myapplication_luo_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.Button;

import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.RecyTalkCoreFrag;

/**
 * Created by luo on 16-11-27.
 */

public class TalkActivity extends AbstradeActivityForExtend {
    private AppCompatImageButton sendBtn;
    @Override
    public void onCreate(Bundle savedBundle){
        super.onCreate(savedBundle);
        sendBtn= (AppCompatImageButton) findViewById(R.id.item_btn_send_message);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击发送消息的按钮
            }
        });
    }
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
