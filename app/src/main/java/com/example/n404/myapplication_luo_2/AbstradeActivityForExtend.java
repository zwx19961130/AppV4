package com.example.n404.myapplication_luo_2;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by luo on 16-11-27.
 */
public abstract class AbstradeActivityForExtend extends AppCompatActivity {
    protected FragmentManager fragmentManager;
    public abstract int giveMeLayoutRes();
    public abstract Fragment giveMeCoreFrag();
    public abstract int giveMeContainerId();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(giveMeLayoutRes());
        fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().add(giveMeContainerId(),giveMeCoreFrag()).commit();
    }

}
