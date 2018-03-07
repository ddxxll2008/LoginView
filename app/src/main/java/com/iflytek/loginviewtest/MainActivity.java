package com.iflytek.loginviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iflytek.loginview.LoginView;

public class MainActivity extends AppCompatActivity {
    private LoginView loginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginView = findViewById(R.id.loginview);
    }
}
