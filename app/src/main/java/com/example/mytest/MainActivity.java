package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("sam","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("sam","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sam","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sam","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("sam","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("sam","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sam","onRestart");
    }
}
