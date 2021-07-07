package com.exaple.centralperk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    TextView txtacc;
    Button btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        getSupportActionBar().setTitle("Log In");

        txtacc = findViewById(R.id.txtacc);

        txtacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this , Register.class);
                startActivity(intent);
            }
        });

        btnlog = findViewById(R.id.btnLog);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LogIn.this, "you have successfully completed your log in", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LogIn.this , Last.class);
                startActivity(intent);
            }
        });



    }
}