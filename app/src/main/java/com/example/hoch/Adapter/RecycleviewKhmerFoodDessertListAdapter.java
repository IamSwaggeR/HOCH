package com.example.hoch.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hoch.Adapter.Constructor.KhmerFoodDessertConstructor;
import com.example.hoch.Adapter.Constructor.KhmerFoodFriedConstructor;
import com.example.hoch.R;

import java.util.LinkedList;

public class RecycleviewKhmerFoodDessertListAdapter extends RecyclerView.Adapter<RecycleviewKhmerFoodDessertListAdapter.KhmerFoodDessertViewHolder> {
    private LayoutInflater mInflater;
    private LinkedList<KhmerFoodDessertConstructor> khmerFoodDessertConstructors;
    Context context;

    public RecycleviewKhmerFoodDessertListAdapter(LinkedList<KhmerFoodDessertConstructor> khmerFoodDessertConstructors, Context context) {
        mInflater=LayoutInflater.from(context);
        this.khmerFoodDessertConstructors = khmerFoodDessertConstructors;
        this.context = context;
    }

    @NonNull
    @Override
    public KhmerFoodDessertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycleview_dessert_kh_food, parent, false);
        return new RecycleviewKhmerFoodDessertListAdapter.KhmerFoodDessertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KhmerFoodDessertViewHolder holder, int position) {
        KhmerFoodDessertConstructor khmerFoodFriedConstructor = khmerFoodDessertConstructors.get(position);
        holder.mTitle.setText(khmerFoodFriedConstructor.getTitle());
        holder.mPrice.setText(String.valueOf(khmerFoodFriedConstructor.getPrice()+"$"));
        holder.mImageView.setImageResource(khmerFoodFriedConstructor.getImage());
    }

    @Override
    public int getItemCount() {
        return khmerFoodDessertConstructors.size();
    }

    public class KhmerFoodDessertViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle,mPrice;
        ImageView mImageView;
        public KhmerFoodDessertViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.nameKHDessertRecycleview);
            mPrice = itemView.findViewById(R.id.priceKHDessertRecycleview);
            mImageView = itemView.findViewById(R.id.imageKHDessertRecycleview);
        }
    }
}
