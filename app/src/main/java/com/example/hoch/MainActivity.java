package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.hoch.Adapter.RecommondHomePage;
import com.example.hoch.Adapter.ViewPagerAdapter;
import com.example.hoch.Adapter.WordListAdapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList<RecommondHomePage> recommondHomePage = new LinkedList<>();
        LinkedList<String> listTitle = new LinkedList<>();
        LinkedList<String> listImage = new LinkedList<>();
        RecyclerView mRecyclerView = findViewById(R.id.recycleView);
        WordListAdapter mAdapter = new WordListAdapter(recommondHomePage,listTitle,listImage,this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");



        viewPager = findViewById(R.id.view_pager_container);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(2);

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
            }
        });


        final ImageButton leftNav = findViewById(R.id.lefNav);
        leftNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewPager.getCurrentItem();
                if (tab >0) {
                    tab--;
                    viewPager.setCurrentItem(tab);
                } else if (tab == 0) {
//                    leftNav.setVisibility(View.INVISIBLE);
                    viewPager.setCurrentItem(tab);
                }
            }
        });

        ImageButton rightNav = findViewById(R.id.rightNav);
        rightNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewPager.getCurrentItem();
                tab++;
                viewPager.setCurrentItem(tab);
            }
        });


    }

}
