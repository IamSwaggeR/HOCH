package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.hoch.Adapter.KhmerFoodFriedListAdapter;
import com.example.hoch.Fragment.DessertFoodFragment;
import com.example.hoch.Fragment.FriedFoodFragment;
import com.example.hoch.Fragment.SoupFoodFragment;
import com.google.android.material.tabs.TabLayout;


public class KhmerFoodList extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    KhmerFoodFriedListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khmer_food_list);


        toolbar = findViewById(R.id.toolbarKhmerFoodList);

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

        ImageButton imageButton3 = findViewById(R.id.imageButtonKHShopping);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrderList();
            }
        });

        tabLayout =  findViewById(R.id.tablayout_container);
        viewPager =  findViewById(R.id.view_pager_khmer_food_container);
        adapter = new KhmerFoodFriedListAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FriedFoodFragment(),"");
        adapter.AddFragment(new SoupFoodFragment(),"");
        adapter.AddFragment(new DessertFoodFragment(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Fried");
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_back);
        tabLayout.getTabAt(1).setText("Soup");
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_coffee);
        tabLayout.getTabAt(2).setText("Dessert");
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_edit);

    }
    public void openOrderList(){
        Intent intent = new Intent(this,Order_List.class);
        startActivity(intent);
    }
}
