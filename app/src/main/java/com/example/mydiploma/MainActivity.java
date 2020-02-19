package com.example.mydiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navView);

        button1 = (Button) findViewById(R.id.buttonSpine);
        button2 = (Button) findViewById(R.id.buttonHand);
        button3 = (Button) findViewById(R.id.buttonFoot);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonSpine:
                startActivity(new Intent(MainActivity.this, SpineActivity.class));
                Animatoo.animateSlideLeft(MainActivity.this);
                break;
            case R.id.buttonHand:
                startActivity(new Intent(MainActivity.this, HandActivity.class));
                Animatoo.animateSlideLeft(MainActivity.this);
                break;
            case R.id.buttonFoot:
                startActivity(new Intent(MainActivity.this, FootActivity.class));
                Animatoo.animateSlideLeft(MainActivity.this);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
