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

    private LayoutInflater mInflater;
    private LinkedList<RecommondHomePage> recommondList;
    Context context;

    public WordListAdapter(LinkedList<RecommondHomePage> recommondList, Context context) {
        mInflater = LayoutInflater.from(context);
        this.recommondList = recommondList;
        this.context = context;
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mInflater.inflate(R.layout.recommend_recycleview, parent, false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        RecommondHomePage recommondHomePage = recommondList.get(position);
        holder.wordTitle.setText(recommondHomePage.getTitile());
        holder.imageItemView.setImageResource(recommondHomePage.getImage());
    }

    @Override
    public int getItemCount() {
        return recommondList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder{
        TextView wordTitle;
        ImageView imageItemView;
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            wordTitle = itemView.findViewById(R.id.textView6);
            imageItemView = itemView.findViewById(R.id.imageView4);
        }
    }
}
