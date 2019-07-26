package com.example.hoch.Fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoch.Adapter.Constructor.KhmerFoodFriedConstructor;
import com.example.hoch.Adapter.DetailListAdapter;
import com.example.hoch.Adapter.RecycleviewKhmerFoodFriedListAdapter;
import com.example.hoch.R;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriedFoodFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private LinkedList<KhmerFoodFriedConstructor> khmerFoodFriedConstructors;
    public static Fragment newInstance() {
        return new FriedFoodFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fried_food, container, false);
        recyclerView = view.findViewById(R.id.recycleview_kh_frid_contianer);
        RecycleviewKhmerFoodFriedListAdapter mAdapter = new RecycleviewKhmerFoodFriedListAdapter(khmerFoodFriedConstructors,getContext());


        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        khmerFoodFriedConstructors = new LinkedList<>();
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello2",R.drawable.radious_red,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello3",R.drawable.radious_gred,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello4",R.drawable.radious_gred,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello2",R.drawable.radious_red,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello3",R.drawable.radious_gred,20));
        khmerFoodFriedConstructors.add(new KhmerFoodFriedConstructor("hello4",R.drawable.radious_gred,20));
    }
}
