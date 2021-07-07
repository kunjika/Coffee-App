package com.exaple.centralperk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    TextView txtaccount;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        getSupportActionBar().setTitle("Register");

        txtaccount = findViewById(R.id.txtaccount);
        txtaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this , LogIn.class);
                startActivity(intent);
            }
        });

        btnReg = findViewById(R.id.btnLog);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register.this, "You are registered successfully", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Register.this , Last.class);
                startActivity(intent);
            }
        });


    }
}