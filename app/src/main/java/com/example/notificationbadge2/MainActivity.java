package com.example.notificationbadge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;

public class MainActivity extends AppCompatActivity {

    NotificationBadge mBadge;
    int count = 1;
    Button btnIncrease,btnMany,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBadge = findViewById(R.id.badge);
        btnIncrease = findViewById(R.id.btn_increase);
        btnMany = findViewById(R.id.btn_many);
        btnClear = findViewById(R.id.btn_clear);
        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(count++);
            }
        });

        btnMany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(99);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(0);
            }
        });
    }
}