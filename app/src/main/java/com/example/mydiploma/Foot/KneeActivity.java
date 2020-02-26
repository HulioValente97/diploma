package com.example.mydiploma.Foot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.FootActivity;
import com.example.mydiploma.R;

public class KneeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knee);
    }

    public void onBackPressed(){
        startActivity(new Intent(KneeActivity.this, FootActivity.class));
        Animatoo.animateSlideRight(KneeActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), FootActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(KneeActivity.this);
        return true;
    }
}
