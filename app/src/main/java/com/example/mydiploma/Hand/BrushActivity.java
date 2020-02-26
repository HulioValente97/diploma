package com.example.mydiploma.Hand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.HandActivity;
import com.example.mydiploma.R;

public class BrushActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brush);
    }

    public void onBackPressed(){
        startActivity(new Intent(BrushActivity.this, HandActivity.class));
        Animatoo.animateSlideRight(BrushActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), HandActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(BrushActivity.this);
        return true;
    }
}
