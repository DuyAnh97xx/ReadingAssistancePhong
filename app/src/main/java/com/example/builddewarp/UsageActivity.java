package com.example.builddewarp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quyenpham.R;

public class UsageActivity extends AppCompatActivity {
    TextView tvHDSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usage);
        tvHDSD = findViewById(R.id.tv_hdsd);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}