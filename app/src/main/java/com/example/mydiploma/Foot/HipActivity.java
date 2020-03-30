package com.example.mydiploma.Foot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.Foot.HipFragments.HipFragment1;
import com.example.mydiploma.Foot.HipFragments.HipFragment2;
import com.example.mydiploma.Foot.HipFragments.HipFragment3;
import com.example.mydiploma.Foot.HipFragments.HipPagerAdapter;
import com.example.mydiploma.FootActivity;
import com.example.mydiploma.R;
import com.google.android.material.tabs.TabLayout;

public class HipActivity extends AppCompatActivity implements HipFragment1.OnFragmentInteractionListener, HipFragment2.OnFragmentInteractionListener, HipFragment3.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip);


        TabLayout hipTabLayout = findViewById(R.id.HipTabLayout);
        hipTabLayout.addTab(hipTabLayout.newTab().setText("Упражнения №1"));
        setTitleColor(R.color.colorBlack);
        hipTabLayout.addTab(hipTabLayout.newTab().setText("Упражнения №2"));
        hipTabLayout.addTab(hipTabLayout.newTab().setText("Упражнения №3"));
        hipTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager hipViewPager = findViewById(R.id.hipPager);
        final HipPagerAdapter adapter = new HipPagerAdapter(getSupportFragmentManager(),hipTabLayout.getTabCount());
        hipViewPager.setAdapter(adapter);
        hipViewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(hipTabLayout));

        hipTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                hipViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public void onBackPressed(){
        startActivity(new Intent(HipActivity.this, FootActivity.class));
        Animatoo.animateSlideRight(HipActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), FootActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(HipActivity.this);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
