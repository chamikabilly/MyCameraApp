package com.example.mycamera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private int SPLASH_TIME_OUT=4000;
    private static final int CAMERA_REQUEST = 1888;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
 }






