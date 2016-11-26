package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;
import com.example.n404.myapplication_luo_2.GLoabalTools.GLobalNotLinerVauleCacul;
import com.example.n404.myapplication_luo_2.GLoabalTools.GloabalCurrentGoodSelect;
import com.example.n404.myapplication_luo_2.R;
import com.example.n404.myapplication_luo_2.SModel.User;

/**
 * Created by luo on 16-11-26.
 * 这个碎片需要完成提供竞价列表的视图，它需要一个针对某商品的竞价信息列表,这个碎片需要知道当前查看的商品
 */
public abstract class RecyPurListFrag extends RecyListFragForExtends{
    //region res
    @Override
    public RecyclerView.Adapter getAdapter() {
        return new PurchaseItemAdapter();
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
        return  R.layout.item_purchase_public;
    }
    //endregion res
    //region viewholder
    private class  PurchaseViewHolder extends  RecyclerView.ViewHolder{
        private TextView tvNickName;
        private TextView tvExtra;
        private ProgressBar pbPurchasePrice;
        public PurchaseViewHolder(View itemView) {
            super(itemView);
            tvNickName= (TextView) itemView.findViewById(R.id.item_purchase_nickname);
            tvExtra= (TextView) itemView.findViewById(R.id.item_purchse_extra);
            pbPurchasePrice= (ProgressBar) itemView.findViewById(R.id.item__pb_rate_price);
        }
        public ProgressBar getPbPurchasePrice() {
            return pbPurchasePrice;
        }

        public void setPbPurchasePrice(ProgressBar pbPurchasePrice) {
            this.pbPurchasePrice = pbPurchasePrice;
        }

        public TextView getTvExtra() {
            return tvExtra;
        }

        public void setTvExtra(TextView tvExtra) {
            this.tvExtra = tvExtra;
        }

        public TextView getTvNickName() {
            return tvNickName;
        }

        public void setTvNickName(TextView tvNickName) {
            this.tvNickName = tvNickName;
        }

    }
    //endregion viewholder
    protected  abstract View.OnClickListener getOnclickLis();
    //region adpater
    private  class PurchaseItemAdapter extends  RecyclerView.Adapter<PurchaseViewHolder>{

        private ClientGood currentClientGood= GloabalCurrentGoodSelect.getClientGood();
        //这个地方就是插入跳转逻辑的地方
        @Override
        public PurchaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(getContext()).inflate(getItemLayoutRes(),parent,false);
            v.setOnClickListener(getOnclickLis());
            return new PurchaseViewHolder(v);
        }

        @Override
        public void onBindViewHolder(PurchaseViewHolder holder, int position) {

            holder.getTvNickName().setText(currentClientGood.getPurchaseListToThisGood().get(position).getBuyerName());
            holder.getTvExtra().setText(currentClientGood.getPurchaseListToThisGood().get(position).getsPurchase().getExtraMessage());
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                holder.getPbPurchasePrice().setProgress(GLobalNotLinerVauleCacul.toNormal(currentClientGood.getPurchaseListToThisGood().get(position).getDeltaPrice()),true);
            }else{
                holder.getPbPurchasePrice().setProgress(GLobalNotLinerVauleCacul.toNormal(currentClientGood.getPurchaseListToThisGood().get(position).getDeltaPrice()));
            }
        }

        @Override
        public int getItemCount() {
            return currentClientGood.getPurchaseListToThisGood().size();
        }
    }
    //endregion adpater
}
