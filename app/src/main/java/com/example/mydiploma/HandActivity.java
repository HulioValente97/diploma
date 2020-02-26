package com.example.mydiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.Hand.BrushActivity;
import com.example.mydiploma.Hand.ElbowActivity;
import com.example.mydiploma.Hand.ShoulderActivity;

public class HandActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonShoulder;
    Button buttonElbow;
    Button buttonBrush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);

        buttonShoulder = (Button) findViewById(R.id.buttonShoulder);
        buttonElbow = (Button) findViewById(R.id.buttonElbow);
        buttonBrush = (Button) findViewById(R.id.buttonBrush);

        buttonShoulder.setOnClickListener(this);
        buttonElbow.setOnClickListener(this);
        buttonBrush.setOnClickListener(this);


    }
    public void onBackPressed(){
        startActivity(new Intent(HandActivity.this, MainActivity.class));
        Animatoo.animateSlideRight(HandActivity.this);
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        Animatoo.animateSlideRight(HandActivity.this);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonShoulder:
                startActivity(new Intent(HandActivity.this, ShoulderActivity.class));
                Animatoo.animateSlideLeft(HandActivity.this);
                break;
            case R.id.buttonElbow:
                startActivity(new Intent(HandActivity.this, ElbowActivity.class));
                Animatoo.animateSlideLeft(HandActivity.this);
                break;
            case R.id.buttonBrush:
                startActivity(new Intent(HandActivity.this, BrushActivity.class));
                Animatoo.animateSlideLeft(HandActivity.this);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
