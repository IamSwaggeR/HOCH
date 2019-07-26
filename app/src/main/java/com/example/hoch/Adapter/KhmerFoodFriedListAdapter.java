package com.example.hoch.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import java.util.LinkedList;

public class KhmerFoodFriedListAdapter extends FragmentPagerAdapter {
    private final LinkedList<Fragment> lstFragemnt = new LinkedList<>();
    private final LinkedList<String> lstTitle = new LinkedList<>();

    public KhmerFoodFriedListAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragemnt.get(position);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitle.get(position);
    }
    public void AddFragment (Fragment fragment,String title){
        lstFragemnt.add(fragment);
        lstTitle.add(title);
    }
}
