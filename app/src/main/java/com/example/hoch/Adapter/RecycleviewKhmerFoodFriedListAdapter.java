package com.example.hoch.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hoch.Adapter.Constructor.KhmerFoodFriedConstructor;
import com.example.hoch.R;

import java.util.LinkedList;

public class RecycleviewKhmerFoodFriedListAdapter extends RecyclerView.Adapter<RecycleviewKhmerFoodFriedListAdapter.KhmerFoodFriedViewHolder> {
    private LayoutInflater mInflater;
    private LinkedList<KhmerFoodFriedConstructor> khmerFoodFriedConstructors;
    Context context;

    public RecycleviewKhmerFoodFriedListAdapter(LinkedList<KhmerFoodFriedConstructor> khmerFoodFriedConstructors, Context context) {
        mInflater=LayoutInflater.from(context);
        this.khmerFoodFriedConstructors = khmerFoodFriedConstructors;
        this.context = context;
    }

    @NonNull
    @Override
    public KhmerFoodFriedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycleview_fried_kh_food, parent, false);
        return new RecycleviewKhmerFoodFriedListAdapter.KhmerFoodFriedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KhmerFoodFriedViewHolder holder, int position) {
        KhmerFoodFriedConstructor khmerFoodFriedConstructor = khmerFoodFriedConstructors.get(position);
        holder.mTitle.setText(khmerFoodFriedConstructor.getTitle());
        holder.mPrice.setText(String.valueOf(khmerFoodFriedConstructor.getPrice()+"$"));
        holder.mImageView.setImageResource(khmerFoodFriedConstructor.getImage());
    }

    @Override
    public int getItemCount() {
        return khmerFoodFriedConstructors.size();
    }

    public class KhmerFoodFriedViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mPrice;
        ImageView mImageView;
        public KhmerFoodFriedViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.nameKHFriendRecycleview);
            mPrice = itemView.findViewById(R.id.priceKHFriendRecycleview);
            mImageView = itemView.findViewById(R.id.imageKHFriendRecycleview);
        }
    }
}
