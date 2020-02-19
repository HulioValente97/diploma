package com.example.mydiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class SpineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spine);
    }

    public void onBackPressed(){
        startActivity(new Intent(SpineActivity.this, MainActivity.class));
        Animatoo.animateSlideRight(SpineActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(SpineActivity.this);
        return true;
    }
}
