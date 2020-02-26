package com.example.mydiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.Foot.HipActivity;
import com.example.mydiploma.Foot.KneeActivity;
import com.example.mydiploma.Hand.BrushActivity;

public class FootActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonHip;
    Button buttonKnee;
    Button buttonAnkle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foot);

        buttonHip = (Button) findViewById(R.id.buttonHip);
        buttonKnee = (Button) findViewById(R.id.buttonKnee);
        buttonAnkle = (Button) findViewById(R.id.buttonAnkle);

        buttonHip.setOnClickListener(this);
        buttonKnee.setOnClickListener(this);
        buttonAnkle.setOnClickListener(this);

    }
    public void onBackPressed(){
        startActivity(new Intent(FootActivity.this, MainActivity.class));
        Animatoo.animateSlideRight(FootActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(FootActivity.this);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonHip:
                startActivity(new Intent(FootActivity.this, HipActivity.class));
                Animatoo.animateSlideLeft(FootActivity.this);
                break;
            case R.id.buttonKnee:
                startActivity(new Intent(FootActivity.this, KneeActivity.class));
                Animatoo.animateSlideLeft(FootActivity.this);
                break;
            case R.id.buttonAnkle:
                startActivity(new Intent(FootActivity.this, BrushActivity.class));
                Animatoo.animateSlideLeft(FootActivity.this);
                break;

        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
