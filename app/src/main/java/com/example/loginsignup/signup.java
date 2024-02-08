package com.example.loginsignup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button btn = findViewById(R.id.btnCreate);

        TextView txt = findViewById(R.id.txtLogin);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivitymain();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openactivitymain();
            }
        });
    }
    public void openactivitymain() {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}