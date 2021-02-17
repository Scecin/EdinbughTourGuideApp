package com.example.edinbughtourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Top10Fragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new OutsideFragment();
        } else {
            return new InterestFragment() ;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.top_10);
        } else if (position == 1) {
            return context.getString(R.string.museums);
        } else if (position == 2) {
            return context.getString(R.string.outside);
        } else {
            return context.getString(R.string.interest);
        }
    }
}
