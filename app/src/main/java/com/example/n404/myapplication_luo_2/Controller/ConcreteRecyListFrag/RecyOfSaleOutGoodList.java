package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;
import com.example.n404.myapplication_luo_2.GLoabalTools.GLobalNotLinerVauleCacul;
import com.example.n404.myapplication_luo_2.GLoabalTools.GlobalClientGoodList;
import com.example.n404.myapplication_luo_2.R;
import com.example.n404.myapplication_luo_2.SModel.Purchase;

/**
 * Created by luo on 16-11-26.
 */

public class RecyOfSaleOutGoodList extends RecyListFragForExtends {
   //region layoutRes
    @Override
    public RecyclerView.Adapter getAdapter() {
        return new SaleOutGoodAdapter();
    }
    @Override
    public int getRLayoutSource() {
        return R.layout.recy_layout_res;
    }
    @Override
    public int getInnerRecyViewId() {
        return R.id.recy_view_id;
    }

    @Override
    public int getItemLayoutRes() {
        return R.layout.item_goodlist_layout;
    }
    //endregion layoutRes

    //region viewholer
    private class SaleOutGoodViewHolder extends  RecyclerView.ViewHolder{
        private ProgressBar pbNum;

        public ProgressBar getPbMaxPrice() {
            return pbMaxPrice;
        }

        public void setPbMaxPrice(ProgressBar pbMaxPrice) {
            this.pbMaxPrice = pbMaxPrice;
        }

        public ProgressBar getPbMinPrice() {
            return pbMinPrice;
        }

        public void setPbMinPrice(ProgressBar pbMinPrice) {
            this.pbMinPrice = pbMinPrice;
        }

        public ProgressBar getPbNum() {
            return pbNum;
        }

        public void setPbNum(ProgressBar pbNum) {
            this.pbNum = pbNum;
        }

        public ImageView getPicImg() {
            return picImg;
        }

        public void setPicImg(ImageView picImg) {
            this.picImg = picImg;
        }

        private ProgressBar pbMaxPrice;
        private ProgressBar pbMinPrice;
        private ImageView picImg;
        public SaleOutGoodViewHolder(View itemView) {
            super(itemView);
            picImg= (ImageView) itemView.findViewById(R.id.img_of_saleout_good_mini);
            pbNum= (ProgressBar) itemView.findViewById(R.id.pb_buyer_num);
            pbMaxPrice= (ProgressBar) itemView.findViewById(R.id.pb_max_price_add);
            pbMinPrice= (ProgressBar) itemView.findViewById(R.id.pb_min_add_price);
        }

    }
    //endregion viewholder

    //region adpater
    private class  SaleOutGoodAdapter extends  RecyclerView.Adapter<SaleOutGoodViewHolder>{
        @Override
        public SaleOutGoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(getContext()).inflate(getItemLayoutRes(),parent,false);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //在这里点击的时候，跳转到交易界面，trade activity
                }
            });
            return new SaleOutGoodViewHolder(v);
        }
        @Override
        public void onBindViewHolder(SaleOutGoodViewHolder holder, int position) {
           GetThreeEsentialMessage gt=  new GetThreeEsentialMessage(GlobalClientGoodList.getList().get(position));
           holder.getPbNum().setProgress(gt.getBuyerNum());
           holder.getPbMaxPrice().setProgress(GLobalNotLinerVauleCacul.toNormal( gt.getMaxPrice()));
           holder.getPbMinPrice().setProgress(GLobalNotLinerVauleCacul.toNormal(gt.getMinPrice()));
        }
        @Override
        public int getItemCount() {
            return GlobalClientGoodList.getList().size();
        }
    }
    //endregion adapter
    //下面这个类是一个工具类，用来计算一个商品的竞价信息，得到并返回三个重要的参数，参与者人数，最高价，最低价
//region Atoolclass
    protected class GetThreeEsentialMessage{
        private int maxPrice=0;
        private  int minPrice=0;
        private  ClientGood clientGood;
        public GetThreeEsentialMessage(ClientGood clientGood){
            this.clientGood=clientGood;
            for(Purchase p:clientGood.getPurchaseListToThisGood()){
                if(p.getPrice()>maxPrice)
                    maxPrice=p.getPrice();
                if(p.getPrice()<minPrice)
                    minPrice=p.getPrice();
            }
        }
        public  int getBuyerNum(){
            int num=clientGood.getPurchaseListToThisGood().size();
            return  num<100?num:99;
        }
        public  int getMaxPrice(){
            return  maxPrice;
        }
        public  int getMinPrice(){
            return  minPrice;
        }

    }
}
//endregion Atoolclass