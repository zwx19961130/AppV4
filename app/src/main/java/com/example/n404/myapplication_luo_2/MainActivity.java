package com.example.n404.myapplication_luo_2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.RecyContacterList;
import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.RecyOfGoodListFrag;
import com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag.RecyOfSaleOutGoodList;
import com.example.n404.myapplication_luo_2.DAO.ClientGoodDAO;
import com.example.n404.myapplication_luo_2.DAO.ClientOtherUserDAO;
import com.example.n404.myapplication_luo_2.DAO.ClientUserDAO;
import com.example.n404.myapplication_luo_2.DAO.ServerCommunicateDAO;
import com.example.n404.myapplication_luo_2.DAO.ServerGoodDAO;
import com.example.n404.myapplication_luo_2.DAO.ServerUserDAO;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Fragment mainListFragmen;
    private Fragment mySaleOutFragment;
    private Fragment contactUserFragment;
    private static int FRAMEID=R.id.content_main;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //region super
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //endregion
        //初始化各个fragment，同时以主列表的fragment位设置对象
        //这个代码块用来强制各个静态代码块的调用
//        ServerUserDAO.startUp();
//        ServerGoodDAO.startUp();
//        ServerCommunicateDAO.startUp();
        ClientGoodDAO.startUp();
        ClientOtherUserDAO.startUp();
        ClientUserDAO.myStartUp();

        //
        mainListFragmen=new RecyOfGoodListFrag();
        mySaleOutFragment=new RecyOfSaleOutGoodList();
        contactUserFragment=new RecyContacterList();
        fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().add(FRAMEID,mainListFragmen).commit();
        //
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
        fragmentManager.beginTransaction().replace(FRAMEID,mainListFragmen).commit();
        } else if (id == R.id.nav_slideshow) {
        fragmentManager.beginTransaction().replace(FRAMEID,mySaleOutFragment).commit();
        } else if (id == R.id.nav_manage) {
        fragmentManager.beginTransaction().replace(FRAMEID,contactUserFragment).commit();
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
