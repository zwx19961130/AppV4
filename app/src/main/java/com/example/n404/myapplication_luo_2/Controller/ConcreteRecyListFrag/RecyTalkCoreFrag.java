package com.example.n404.myapplication_luo_2.Controller.ConcreteRecyListFrag;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.n404.myapplication_luo_2.CModel.ClientUser;
import com.example.n404.myapplication_luo_2.Controller.RecyListFragForExtends;
import com.example.n404.myapplication_luo_2.GLoabalTools.GLoabalUserSelect;
import com.example.n404.myapplication_luo_2.R;
import com.example.n404.myapplication_luo_2.SModel.Communicate;

/**
 * Created by luo on 16-11-26.
 */

public class RecyTalkCoreFrag extends RecyListFragForExtends {
    //这两个参数用来告述我们行宽，框架的基础高度
    public static float TVLEN=30;
    public static int FRAMEHEIGHT=50;
    //region layout
    @Override
    public RecyclerView.Adapter getAdapter() {
        return new TalkCoreAdapter();
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
        return R.layout.item_talk_concrete_message;
    }
    //endregion
    //region viewholder
    private class TalkCoreViewHolder extends RecyclerView.ViewHolder{
        private ImageView backImg;

        public FrameLayout getContainFrame() {
            return containFrame;
        }

        private TextView  tvMessage;
        private FrameLayout containFrame;
        public TalkCoreViewHolder(View itemView) {
            super(itemView);
            backImg= (ImageView) itemView.findViewById(R.id.item_talk_back_img_id);
            tvMessage= (TextView) itemView.findViewById(R.id.item_tv_talk_concre_message_id);
            containFrame= (FrameLayout) itemView.findViewById(R.id.item_talk_frame_id);
        }
        public TextView getTvMessage() {
            return tvMessage;
        }
        public ImageView getBackImg() {
            return backImg;
        }
    }
    //endregion
    //region adapter
    private class TalkCoreAdapter extends  RecyclerView.Adapter<TalkCoreViewHolder>{
        @Override
        public TalkCoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(getContext()).inflate(getItemLayoutRes(),parent,false);
            return new TalkCoreViewHolder(v);
        }
        @Override
        public void onBindViewHolder(TalkCoreViewHolder holder, int position) {
            // 这里可能是复杂性非常高的地段，小心！
            Communicate c= GLoabalUserSelect.getClientOtherUser().getCommuBetHeAndMe().get(position);
            //拿到了一条对话记录，判断说话方
            if(c.getSpeakerId()== ClientUser.getPhoneClientUser().getPhoneUser().getStuId()){
                //用户是听者，图片采用左图
                holder.getBackImg().setImageResource(R.drawable.talk_pop_4_l);
                //根据长度做伸缩
                float ScaleRate=c.getConntent().length()/RecyTalkCoreFrag.TVLEN+1;
                holder.getContainFrame().getLayoutParams().height=(int) (RecyTalkCoreFrag.FRAMEHEIGHT*ScaleRate);
                holder.getBackImg().setScaleY(ScaleRate);

            }else{
                //用户是听者，图片采用右图
                holder.getBackImg().setImageResource(R.drawable.talk_pop_4_r);
                //根据长度做伸缩
                float ScaleRate=c.getConntent().length()/RecyTalkCoreFrag.TVLEN+1;
                holder.getContainFrame().getLayoutParams().height=(int) (RecyTalkCoreFrag.FRAMEHEIGHT*ScaleRate);
                holder.getBackImg().setScaleY(ScaleRate);


            }
        }
        @Override
        public int getItemCount() {
            return GLoabalUserSelect.getClientOtherUser().getCommuBetHeAndMe().size();
        }
    }
    //endregion adapter
}
