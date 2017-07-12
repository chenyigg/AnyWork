package com.qgstudio.anywork.fpaper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PaperFragAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragments;
    private List<String> mTitles;

    public PaperFragAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mFragments.add(PaperFragment.newInstance(PaperFragment.TYPE_EXMINATION));
        mFragments.add(PaperFragment.newInstance(PaperFragment.TYPE_PRACTICE));

        mTitles = new ArrayList<>();
        mTitles.add("考试");
        mTitles.add("练习");
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }

}