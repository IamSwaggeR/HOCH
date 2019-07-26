package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.hoch.Adapter.RecommondHomePage;
import com.example.hoch.Adapter.ViewPagerAdapter;
import com.example.hoch.Adapter.WordListAdapter;
import com.example.hoch.SharedPreferences.PrefConfig;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton imageButtonShopping = findViewById(R.id.btnHomePageShopping);
        imageButtonShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderList();
            }
        });


        RelativeLayout khrelativeLayout = findViewById(R.id.khmerFoodRelative);
        khrelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKhmerFoodActivity();
            }
        });
        RelativeLayout chrelativeLayout = findViewById(R.id.chineseFoodRelative);
        chrelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChineseFoodActivity();
            }
        });
        RelativeLayout eurelativeLayout = findViewById(R.id.europeFoodRelative);
        eurelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEuropeFoodActivity();
            }
        });
        RelativeLayout drelativeLayout = findViewById(R.id.drinkRelative);
        drelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrinkActivity();
            }
        });




        LinkedList<RecommondHomePage> recommondHomePage = new LinkedList<>();
        recommondHomePage.add(new RecommondHomePage("hello1", R.drawable.radious_blue));
        recommondHomePage.add(new RecommondHomePage("hello2", R.drawable.radious_red));
        recommondHomePage.add(new RecommondHomePage("hello3", R.drawable.radious_green));
        recommondHomePage.add(new RecommondHomePage("hello4", R.drawable.radious_blue));
        recommondHomePage.add(new RecommondHomePage("hello5", R.drawable.radious_red));
        recommondHomePage.add(new RecommondHomePage("hello6", R.drawable.radious_gred));
        recommondHomePage.add(new RecommondHomePage("hello7", R.drawable.radious_red));
        recommondHomePage.add(new RecommondHomePage("hello8", R.drawable.radious_gred));
        recommondHomePage.add(new RecommondHomePage("hello9", R.drawable.radious_blue));
        RecyclerView mRecyclerView = findViewById(R.id.recycleView);
        WordListAdapter mAdapter = new WordListAdapter(recommondHomePage,this);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_menu_button_of_three_horizontal_lines);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
            }
        });


        viewPager = findViewById(R.id.view_pager_container);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(2);



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
    public void openKhmerFoodActivity(){
        Intent intent = new Intent(this,KhmerFoodList.class);
        startActivity(intent);
    }
    public void openChineseFoodActivity(){
        Intent intent = new Intent(this,ChineseFoodList.class);
        startActivity(intent);
    }
    public void openEuropeFoodActivity(){
        Intent intent = new Intent(this,EuropeFoodList.class);
        startActivity(intent);
    }
    public void openDrinkActivity(){
        Intent intent = new Intent(this,DrinkList.class);
        startActivity(intent);
    }
    public void openOrderList(){
        Intent intent = new Intent(this,Order_List.class);
        startActivity(intent);
    }


}
