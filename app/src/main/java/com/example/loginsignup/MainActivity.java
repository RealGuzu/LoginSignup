package com.example.loginsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views and set status bar color
        initializeViews();

        // Set onClickListener for the "Login" button
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login button click
                // In this case, just open signup activity
                openSignup();
            }
        });

        // Set onClickListener for the "Create Account" TextView
        TextView createAccountTextView = findViewById(R.id.createAccount);
        createAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on "Create Account" TextView
                openSignup();
            }
        });
    }

    // Method to initialize views and set status bar color
    private void initializeViews() {
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.dark_gray));
    }

    // Method to open the signup activity
    public void openSignup() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}
