package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnLogin);
        TextView txtView = findViewById(R.id.createAccount);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opensignup();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opensignup();
            }
        });

    } private void initializeViews() {
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.dark_gray));
    }
    public void opensignup() {
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }

}