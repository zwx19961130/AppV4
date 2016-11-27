package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;
import com.example.n404.myapplication_luo_2.DAO.ClientUserDAO;
import com.example.n404.myapplication_luo_2.R;

/**
 * Created by luo on 16-11-26.
 * 这个类用来链接与用户通信过的用户的列表，它抽取clientuser的联系人列表，填充item，点击人物item的时候，跳转到会话activity
 *
 */

public class RecyContacterList extends RecyListFragForExtends{
    //region layoutRes
    @Override
    public RecyclerView.Adapter getAdapter() {
        return new ContactUsersAdapter();
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
        return R.layout.item_related_talk_user;
    }
    //endregion
    //region adpater
    private class  ContactUsersAdapter extends RecyclerView.Adapter<ContacterViewHolder>{
        @Override
        public ContacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(getContext()).inflate(getItemLayoutRes(),parent,false);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //点击人物view，设置全局 选中对象，启动通信activity
                }
            });
            return new ContacterViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ContacterViewHolder holder, int position) {
            holder.getTvLastTalk().setText(ClientUserDAO.getMe().getCotactersList().get(position).getLastTalk());
            holder.getTvUserNickName().setText(ClientUserDAO.getMe().getCotactersList().get(position).getUser().getNickName());
        }

        @Override
        public int getItemCount() {
            return ClientUserDAO.getMe().getCotactersList().size();
        }
    }
    //endregion adapter
    // region viewholder
    private class ContacterViewHolder extends  RecyclerView.ViewHolder {
        private ImageView imgUserIcon;
        private TextView tvUserNickName;
        private TextView tvLastTalk;
        public ContacterViewHolder(View itemView) {
            super(itemView);
            imgUserIcon= (ImageView) itemView.findViewById(R.id.item_talk_img_user_icon);
            tvUserNickName= (TextView) itemView.findViewById(R.id.item_talk_tv_user_nickname);
            tvLastTalk= (TextView) itemView.findViewById(R.id.item_talk_tv_last_message);
        }

        public ImageView getImgUserIcon() {
            return imgUserIcon;
        }

        public TextView getTvLastTalk() {
            return tvLastTalk;
        }

        public TextView getTvUserNickName() {
            return tvUserNickName;
        }
    }
    //endregion viewHolder
}
