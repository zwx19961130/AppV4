package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.n404.myapplication_luo_2.CModel.ClientGood;
import com.example.n404.myapplication_luo_2.CModel.ClientOtherUser;
import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;
import com.example.n404.myapplication_luo_2.DAO.ClientOtherUserDAO;
import com.example.n404.myapplication_luo_2.GLoabalTools.GLoabalUserSelect;
import com.example.n404.myapplication_luo_2.GLoabalTools.GLobalNotLinerVauleCacul;
import com.example.n404.myapplication_luo_2.GLoabalTools.GloabalCurrentGoodSelect;
import com.example.n404.myapplication_luo_2.R;
import com.example.n404.myapplication_luo_2.SModel.User;
import com.example.n404.myapplication_luo_2.TalkActivity;

/**
 * Created by luo on 16-11-26.
 * 这个fragment是用来发生交易的，提供给交易activity，点击条目的时候，有交流和交易选项。
 */

public class TradeConcreRecyPurListFrag extends RecyListFragForExtends {
    //region res
    @Override
    public RecyclerView.Adapter getAdapter() {
        return new TradeConcreRecyPurListFrag.PurchaseItemAdapter();
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
    private class  PurchaseViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{
        public User getUserBound() {
            return userBound;
        }

        public void setUserBound(User userBound) {
            this.userBound = userBound;
        }

        private User userBound;
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

        @Override
        public void onClick(View view) {
            //遍历查询，看下这个用户是不是已经在客户端其它用户集合内部了
            for(ClientOtherUser cou: ClientOtherUserDAO.getMe().getCLientOtherUsers()){
                if(userBound.getStuId()==cou.getUser().getStuId()){
                    //在集合内部
                    GLoabalUserSelect.setClientOtherUser(cou);
                    Toast.makeText(getContext(),"make bargin logic calls for concrete achive!",Toast.LENGTH_LONG).show();
                    // startActivity(new Intent(getContext(), TalkActivity.class));
                }
            }
        }
    }
    //endregion viewholder

    //region adpater
    private  class PurchaseItemAdapter extends  RecyclerView.Adapter<TradeConcreRecyPurListFrag.PurchaseViewHolder>{

        private ClientGood currentClientGood= GloabalCurrentGoodSelect.getClientGood();
        //这个地方就是插入跳转逻辑的地方
        @Override
        public TradeConcreRecyPurListFrag.PurchaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(getContext()).inflate(getItemLayoutRes(),parent,false);
            return new TradeConcreRecyPurListFrag.PurchaseViewHolder(v);
        }

        @Override
        public void onBindViewHolder(TradeConcreRecyPurListFrag.PurchaseViewHolder holder, int position) {

            holder.getTvNickName().setText(currentClientGood.getPurchaseListToThisGood().get(position).getSalerId()+"");
            holder.getTvExtra().setText(currentClientGood.getPurchaseListToThisGood().get(position).getExtraMessage());
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                holder.getPbPurchasePrice().setProgress(GLobalNotLinerVauleCacul.toNormal(currentClientGood.getPurchaseListToThisGood().get(position).getPrice()),true);
            }else{
                holder.getPbPurchasePrice().setProgress(GLobalNotLinerVauleCacul.toNormal(currentClientGood.getPurchaseListToThisGood().get(position).getPrice()));
            }
        }

        @Override
        public int getItemCount() {
            return currentClientGood.getPurchaseListToThisGood().size();
        }
    }
    //endregion adpater

}
