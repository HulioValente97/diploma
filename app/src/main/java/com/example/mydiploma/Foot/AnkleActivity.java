package com.example.mydiploma.Foot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.Foot.AnkleFragments.AnkleFragment1;
import com.example.mydiploma.Foot.AnkleFragments.AnkleFragment2;
import com.example.mydiploma.Foot.AnkleFragments.AnkleFragment3;
import com.example.mydiploma.Foot.AnkleFragments.AnklePagerAdapter;
import com.example.mydiploma.FootActivity;
import com.example.mydiploma.R;
import com.google.android.material.tabs.TabLayout;

public class AnkleActivity extends AppCompatActivity implements AnkleFragment1.OnFragmentInteractionListener, AnkleFragment2.OnFragmentInteractionListener, AnkleFragment3.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankle);

        TabLayout ankleTabLayout = findViewById(R.id.AnkleTabLayout);
        ankleTabLayout.addTab(ankleTabLayout.newTab().setText("Упражнения №1"));
        setTitleColor(R.color.colorBlack);
        ankleTabLayout.addTab(ankleTabLayout.newTab().setText("Упражнения №2"));
        ankleTabLayout.addTab(ankleTabLayout.newTab().setText("Упражнения №3"));
        ankleTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager ankleViewPager = findViewById(R.id.anklePager);
        final AnklePagerAdapter adapter = new AnklePagerAdapter(getSupportFragmentManager(),ankleTabLayout.getTabCount());
        ankleViewPager.setAdapter(adapter);
        ankleViewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(ankleTabLayout));

        ankleTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ankleViewPager.setCurrentItem(tab.getPosition());
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
        startActivity(new Intent(AnkleActivity.this, FootActivity.class));
        Animatoo.animateSlideRight(AnkleActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), FootActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(AnkleActivity.this);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
