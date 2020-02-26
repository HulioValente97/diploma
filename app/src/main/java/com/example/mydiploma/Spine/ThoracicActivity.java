package com.example.mydiploma.Spine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.R;
import com.example.mydiploma.SpineActivity;

public class ThoracicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thoracic);
    }

    public void onBackPressed(){
        startActivity(new Intent(ThoracicActivity.this, SpineActivity.class));
        Animatoo.animateSlideRight(ThoracicActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), SpineActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(ThoracicActivity.this);
        return true;
    }
}
