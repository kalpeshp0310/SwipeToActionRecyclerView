package com.example.kalpesh.swipetochat;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Kalpesh on 06/01/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mTextView.setText("Item " + (i + 1));
        if(viewHolder.mFriendView.getVisibility() != View.VISIBLE)
            viewHolder.mFriendView.setVisibility(View.VISIBLE);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;
        CardView mFriendView;

        public ViewHolder(View itemView) {
            super(itemView);
            mFriendView = (CardView) itemView.findViewById(R.id.card_view);
            mTextView = (TextView) itemView.findViewById(R.id.tv_list_item);
        }
    }
}
