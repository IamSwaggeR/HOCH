package com.example.hoch.Fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoch.Adapter.Constructor.KhmerFoodDessertConstructor;
import com.example.hoch.Adapter.Constructor.KhmerFoodSoupConstructor;
import com.example.hoch.Adapter.RecycleviewKhmerFoodDessertListAdapter;
import com.example.hoch.Adapter.RecycleviewKhmerFoodFriedListAdapter;
import com.example.hoch.R;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DessertFoodFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private LinkedList<KhmerFoodDessertConstructor> khmerFoodDessertConstructors;


    public static Fragment newInstance() {
        return new DessertFoodFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_dessert_food, container, false);
        recyclerView = view.findViewById(R.id.recycleview_kh_dessert_contianer);
        RecycleviewKhmerFoodDessertListAdapter mAdapter = new RecycleviewKhmerFoodDessertListAdapter(khmerFoodDessertConstructors,getContext());


        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        khmerFoodDessertConstructors = new LinkedList<>();
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_green,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_green,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_green,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_green,20));
        khmerFoodDessertConstructors.add(new KhmerFoodDessertConstructor("hello1",R.drawable.radious_blue,20));

    }
}
