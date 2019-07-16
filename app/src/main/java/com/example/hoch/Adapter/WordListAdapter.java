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

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    LayoutInflater mInflater;
    LinkedList<RecommondHomePage> recommondList;
    LinkedList<String> listTitle,listImage;
    Context context;
    public WordListAdapter(LinkedList<RecommondHomePage> recommondList, LinkedList<String> listTitle, LinkedList<String> listImage, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.recommondList = recommondList;
        this.listTitle = listTitle;
        this.listImage = listImage;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.recommend_recycleview, parent,false);
        return new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        RecommondHomePage recommondHomePage = recommondList.get(position);
        holder.wordTitle.setText(recommondHomePage.getTitile());
    }


    @Override
    public int getItemCount() {
        return recommondList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder{
        TextView wordTitle;
        ImageView imageItemView;
        public WordViewHolder(@NonNull View itemView, WordListAdapter wordListAdapter) {
            super(itemView);
            wordTitle = itemView.findViewById(R.id.textView6);
            imageItemView = itemView.findViewById(R.id.imageView4);
        }
    }
}
