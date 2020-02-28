package com.example.mydiploma.Foot.AnkleFragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AnklePagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public AnklePagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                AnkleFragment1 ankleFragment1 = new AnkleFragment1();
                return  ankleFragment1;
            case 1:
                AnkleFragment2 ankleFragment2 = new AnkleFragment2();
                return  ankleFragment2;
            case 2:
                AnkleFragment3 ankleFragment3 = new AnkleFragment3();
                return  ankleFragment3;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
