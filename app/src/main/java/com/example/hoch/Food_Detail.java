package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Food_Detail extends AppCompatActivity {
    private static int value=1;
    private String strVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__detail);

        Toolbar toolbar = findViewById(R.id.toolbarDetail);
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
        final Button btnSmallDish = findViewById(R.id.buttonSmallDish);
        final Button btnBigDish = findViewById(R.id.buttonBigDish);
        btnSmallDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSmallDish.setBackgroundResource(R.drawable.radious_blue);
                btnBigDish.setBackgroundResource(R.drawable.radious_green);
            }
        });

        btnBigDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBigDish.setBackgroundResource(R.drawable.radious_blue);
                btnSmallDish.setBackgroundResource(R.drawable.radious_green);
            }
        });
        ImageButton btnMinus = findViewById(R.id.btnMinus);
        ImageButton btnPlus = findViewById(R.id.btnPlus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.value);
                if(value==0){
                    strVal = Integer.toString(value);
                    textView.setText(strVal);
                }else {
                    strVal = Integer.toString(--value);
                    textView.setText(strVal);
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.value);
                strVal = Integer.toString(++value);
                textView.setText(strVal);
            }
        });
    }
}
