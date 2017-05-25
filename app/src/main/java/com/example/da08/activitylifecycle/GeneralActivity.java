package com.example.da08.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GeneralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
    }
}
