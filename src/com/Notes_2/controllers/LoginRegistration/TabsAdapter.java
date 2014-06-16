package com.Notes_2.controllers.LoginRegistration;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 6/16/14.
 */
public class TabsAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;



    public TabsAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<Fragment>();
        fragments.add(new LoginFragment());
        fragments.add(new RegistrationFragment());
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
