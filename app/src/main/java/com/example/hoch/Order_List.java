package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.hoch.Adapter.DetailListAdapter;
import com.example.hoch.Adapter.RecommondDetailList;

import java.util.LinkedList;

public class Order_List extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        toolbar = findViewById(R.id.toolBarOrderList);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        LinkedList<RecommondDetailList> recommondDetailList = new LinkedList<>();

        recommondDetailList.add(new RecommondDetailList("hello4","Small Dish",R.drawable.radious_gred,4));
        recommondDetailList.add(new RecommondDetailList("hello4","Small Dish",R.drawable.radious_gred,4));
        recommondDetailList.add(new RecommondDetailList("hello4","Small Dish",R.drawable.radious_gred,4));
        recommondDetailList.add(new RecommondDetailList("hello4","Small Dish",R.drawable.radious_gred,4));
        recommondDetailList.add(new RecommondDetailList("hello4","Small Dish",R.drawable.radious_gred,4));
        recommondDetailList.add(new RecommondDetailList("hello4","Small Dish",R.drawable.radious_gred,4));

        RecyclerView mRecyclerView = findViewById(R.id.recycleViewOrderList);
        DetailListAdapter mAdapter = new DetailListAdapter(recommondDetailList,this);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }
}
