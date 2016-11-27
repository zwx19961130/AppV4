package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;
import com.example.n404.myapplication_luo_2.DetialActivity;
import com.example.n404.myapplication_luo_2.GLoabalTools.GLoabalGoodList;
import com.example.n404.myapplication_luo_2.GLoabalTools.GloabalCurrentGoodSelect;
import com.example.n404.myapplication_luo_2.R;
import com.example.n404.myapplication_luo_2.SModel.Good;

/**
 * Created by luo on 16-11-26.
 *  以这个类位样例你可以学习到，继承该抽象类后需要追加自己的适配器和视图容器的子类，需要指明视图
 *      可以这样说，一个列表的全部自由度都在这个类体以尽可能简洁的代码交代了
 */

public class RecyOfGoodListFrag extends RecyListFragForExtends {
    //region 交代视图资源
    @Override
    public RecyclerView.Adapter getAdapter() {
        return new GoodListAdapter();
    }
    //交付碎片的布局文件资源
    @Override
    public int getRLayoutSource() {
        return R.layout.recy_layout_res;
    }
    //交付一个内部的recycle的id
    @Override
    public int getInnerRecyViewId() {
        return R.id.recy_view_id;
    }
    @Override
    public int getItemLayoutRes() {
        return R.layout.item_goodlist_layout;
    }
    //继承视觉容器，把字段暴露出来，方便设置
    //endregion 交代视图资源
    //region 适配器
    private class GoodListAdapter extends  RecyclerView.Adapter<GoodListItemViewHolder>{
        @Override
        public GoodListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //交付用来填充一个item的视图资源文件
            View v= LayoutInflater.from(getContext()).inflate(getItemLayoutRes(),parent,false);
            //在这里设置相应事件，跳转逻辑
            return new GoodListItemViewHolder(v);
        }

        @Override
        public void onBindViewHolder(GoodListItemViewHolder holder, int position) {
        //这是一个核心的填充内容的方法体，实现了模型内容和视图的统一
            holder.getGoodNameTv().setText(GLoabalGoodList.getGoodArrayList().get(position).getGood().getGoodName());
            holder.getGoodPriceTv().setText(GLoabalGoodList.getGoodArrayList().get(position).getGood().getPrice());
            holder.getGoodExtraTv().setText(GLoabalGoodList.getGoodArrayList().get(position).getGood().getExtraMessage());
        }

        @Override
        public int getItemCount() {
            //
            Log.e("主列的碎片已经被调用","它的获取item数量的方法被调用，其数量为"+GLoabalGoodList.getGoodArrayList().size());
            return GLoabalGoodList.getGoodArrayList().size();
        }
    }
    //endregion 适配器
    //region 视图容器
    private  class GoodListItemViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {
        private LinearLayout mainLayout;
        public ClientGood getClientGood() {
            return good;
        }

        public void setGood(ClientGood good) {
            this.good = good;
        }

        private ClientGood good;
        private ImageView imageView;
        private TextView goodNameTv;
        private  TextView goodPriceTv;
        private  TextView goodExtraTv;
        public GoodListItemViewHolder(View itemView) {
            super(itemView);
            mainLayout=(LinearLayout)itemView;
            imageView= (ImageView) mainLayout.findViewById(R.id.img_of_good_mini);
            goodNameTv= (TextView) mainLayout.findViewById(R.id.tv_good_name_mini);
            goodPriceTv= (TextView) mainLayout.findViewById(R.id.tv_price_of_good);
            goodExtraTv= (TextView) mainLayout.findViewById(R.id.tc_extra_massage_mini);
        }
        //region 折叠了设置器和获取器
        public LinearLayout getMainLayout() {
            return mainLayout;
        }

        public void setMainLayout(LinearLayout mainLayout) {
            this.mainLayout = mainLayout;
        }

        public TextView getGoodExtraTv() {
            return goodExtraTv;
        }

        public void setGoodExtraTv(TextView goodExtraTv) {
            this.goodExtraTv = goodExtraTv;
        }

        public TextView getGoodNameTv() {
            return goodNameTv;
        }

        public void setGoodNameTv(TextView goodNameTv) {
            this.goodNameTv = goodNameTv;
        }

        public TextView getGoodPriceTv() {
            return goodPriceTv;
        }

        public void setGoodPriceTv(TextView goodPriceTv) {
            this.goodPriceTv = goodPriceTv;
        }

        public ImageView getImageView() {
            return imageView;
        }

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        @Override
        public void onClick(View view) {
            GloabalCurrentGoodSelect.SetCurrentGood(getClientGood());
            //这里才是跳转逻辑，响应事件
            Intent intentToDetials=new Intent(getContext(), DetialActivity.class);
            startActivity(intentToDetials);
        }
        //endregion 折叠了设置器和获取器
    }
    //endregion 视图容器
}
