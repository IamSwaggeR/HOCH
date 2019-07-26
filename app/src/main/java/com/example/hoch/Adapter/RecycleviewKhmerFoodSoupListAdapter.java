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
import com.example.hoch.Adapter.Constructor.KhmerFoodSoupConstructor;
import com.example.hoch.R;

import java.util.LinkedList;

public class RecycleviewKhmerFoodSoupListAdapter extends RecyclerView.Adapter<RecycleviewKhmerFoodSoupListAdapter.KhmerFoodSoupViewHolder> {
    private LayoutInflater mInflater;
    private LinkedList<KhmerFoodSoupConstructor> khmerFoodSoupConstructors;
    Context context;

    public RecycleviewKhmerFoodSoupListAdapter(LinkedList<KhmerFoodSoupConstructor> khmerFoodSoupConstructors, Context context) {
        mInflater=LayoutInflater.from(context);
        this.khmerFoodSoupConstructors = khmerFoodSoupConstructors;
        this.context = context;
    }

    @NonNull
    @Override
    public KhmerFoodSoupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycleview_soup_kh_food, parent, false);
        return new RecycleviewKhmerFoodSoupListAdapter.KhmerFoodSoupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KhmerFoodSoupViewHolder holder, int position) {
        KhmerFoodSoupConstructor khmerFoodSoupConstructor = khmerFoodSoupConstructors.get(position);
        holder.mTitle.setText(khmerFoodSoupConstructor.getTitle());
        holder.mPrice.setText(String.valueOf(khmerFoodSoupConstructor.getPrice()+"$"));
        holder.mImageView.setImageResource(khmerFoodSoupConstructor.getImage());
    }

    @Override
    public int getItemCount() {
        return khmerFoodSoupConstructors.size();
    }

    public class KhmerFoodSoupViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mPrice;
        ImageView mImageView;
        public KhmerFoodSoupViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.nameKHSoupRecycleview);
            mPrice = itemView.findViewById(R.id.priceKHSoupRecycleview);
            mImageView = itemView.findViewById(R.id.imageKHSoupRecycleview);
        }
    }
}
