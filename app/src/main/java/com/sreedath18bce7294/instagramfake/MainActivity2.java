package com.sreedath18bce7294.instagramfake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}