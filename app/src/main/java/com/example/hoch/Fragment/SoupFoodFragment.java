package com.example.hoch.Fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoch.Adapter.Constructor.KhmerFoodFriedConstructor;
import com.example.hoch.Adapter.Constructor.KhmerFoodSoupConstructor;
import com.example.hoch.Adapter.RecycleviewKhmerFoodFriedListAdapter;
import com.example.hoch.Adapter.RecycleviewKhmerFoodSoupListAdapter;
import com.example.hoch.R;

import java.util.LinkedList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SoupFoodFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private LinkedList<KhmerFoodSoupConstructor> khmerFoodSoupConstructors;


    public static Fragment newInstance() {
        return new SoupFoodFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_soup_food, container, false);
        recyclerView = view.findViewById(R.id.recycleview_kh_soup_contianer);
        RecycleviewKhmerFoodSoupListAdapter mAdapter = new RecycleviewKhmerFoodSoupListAdapter(khmerFoodSoupConstructors,getContext());


        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        khmerFoodSoupConstructors = new LinkedList<>();
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_red,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_red,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_red,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_blue,20));
        khmerFoodSoupConstructors.add(new KhmerFoodSoupConstructor("hello1",R.drawable.radious_red,20));

    }
}
