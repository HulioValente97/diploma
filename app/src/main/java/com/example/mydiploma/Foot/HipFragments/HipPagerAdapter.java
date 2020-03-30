package com.example.mydiploma.Foot.HipFragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class HipPagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public HipPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HipFragment1 hipFragment1 = new HipFragment1();
                return  hipFragment1;
            case 1:
                HipFragment2 hipFragment2 = new HipFragment2();
                return  hipFragment2;
            case 2:
                HipFragment3 hipFragment3 = new HipFragment3();
                return  hipFragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
