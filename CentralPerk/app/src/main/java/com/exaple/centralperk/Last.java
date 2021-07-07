package com.exaple.centralperk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Last extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        getSupportActionBar().hide();
    }
}