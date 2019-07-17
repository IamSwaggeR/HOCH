package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.hoch.Fragment.BlankFragment;

public class Food_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__detail);

        FragmentManager fragmentManager = getSupportFragmentManager();
        BlankFragment fragment_detail = new BlankFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,fragment_detail);
        fragmentTransaction.commit();
    }
}
