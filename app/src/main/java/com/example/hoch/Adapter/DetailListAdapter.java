package com.example.hoch.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hoch.R;

import java.util.LinkedList;

public class DetailListAdapter extends RecyclerView.Adapter<DetailListAdapter.DetailViewHolder> {
    private LayoutInflater mInflater;
    private LinkedList<RecommondDetailList> recommondDetailWordList;
    Context context;

    public DetailListAdapter( LinkedList<RecommondDetailList> recommondDetailWordList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.recommondDetailWordList = recommondDetailWordList;
        this.context = context;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycleview_order_list, parent, false);
        return new DetailListAdapter.DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        RecommondDetailList recommondDetailList = recommondDetailWordList.get(position);
        holder.mTextview.setText(recommondDetailList.getTitile());
        holder.mQTY.setText(String.valueOf(recommondDetailList.getQty()));
        holder.mSize.setText(recommondDetailList.getSize());
        holder.mImageView.setImageResource(recommondDetailList.getImage());
    }

    @Override
    public int getItemCount() {
        return recommondDetailWordList.size();
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder {
        TextView mTextview;
        TextView mQTY;
        TextView mSize;
        ImageView mImageView;
        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextview = itemView.findViewById(R.id.detailListName);
            mQTY = itemView.findViewById(R.id.detailListQTY);
            mSize = itemView.findViewById(R.id.detailListSize);
            mImageView = itemView.findViewById(R.id.detailListImage);
        }
    }
}
