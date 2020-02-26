package com.example.mydiploma.Hand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.HandActivity;
import com.example.mydiploma.R;

public class ShoulderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
    }

    public void onBackPressed(){
        startActivity(new Intent(ShoulderActivity.this, HandActivity.class));
        Animatoo.animateSlideRight(ShoulderActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), HandActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(ShoulderActivity.this);
        return true;
    }
}
