package com.example.da08.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    Button btnGe, btnTr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "============ onCreate");
        setContentView(R.layout.activity_main);

        // 1 액티비티 두개 생성 - generalActivity, transparentActivity
        // 2 현재 액티비티에 버튼 두개 생성 후 위에서 만든 각 액티비티 호출


        btnGe = (Button) findViewById(R.id.btnGe);
        btnGe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, GeneralActivity.class);
                startActivity(intent);
            }
        });

        btnTr = (Button) findViewById(R.id.btnTr);
        btnTr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, TransparentActivity.class);
                startActivity(intent);
            }
        });

//        ((Button) findViewById(R.id.btnTr)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent;
//                intent = new Intent(MainActivity.this, TransparentActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "============ onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "============ onResume");
    }

    // Running


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "============ onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "============ onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "============ onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "============ onDestroy");
    }
}