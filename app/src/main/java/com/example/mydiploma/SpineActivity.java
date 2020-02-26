package com.example.mydiploma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.mydiploma.Spine.CervicalActivity;
import com.example.mydiploma.Spine.LumbarActivity;
import com.example.mydiploma.Spine.ThoracicActivity;

public class SpineActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonCervical;
    Button buttonThoracic;
    Button buttonLumbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spine);

        buttonCervical = (Button) findViewById(R.id.buttonCervical);
        buttonThoracic = (Button) findViewById(R.id.buttonThoracic);
        buttonLumbar = (Button) findViewById(R.id.buttonLumbar);

        buttonCervical.setOnClickListener(this);
        buttonThoracic.setOnClickListener(this);
        buttonLumbar.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCervical:
                startActivity(new Intent(SpineActivity.this, CervicalActivity.class));
                Animatoo.animateSlideLeft(SpineActivity.this);
                break;
            case R.id.buttonThoracic:
                startActivity(new Intent(SpineActivity.this, ThoracicActivity.class));
                Animatoo.animateSlideLeft(SpineActivity.this);
                break;
            case R.id.buttonLumbar:
                startActivity(new Intent(SpineActivity.this, LumbarActivity.class));
                Animatoo.animateSlideLeft(SpineActivity.this);
                break;
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
