package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tage = "Lifecycle Step ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tage,"In onCreate() event");
    }
    public void onStart() {
        super.onStart();
        Log.d(tage,"In onStart() event");
    }
    public void onRestart() {
        super.onRestart();
        Log.d(tage,"In onRestart() event");
    }
    public void onResume() {
        super.onResume();
        Log.d(tage,"In onResume() event");
    }
    public void onPause() {
        super.onPause();
        Log.d(tage,"In onPause() event");
    }
    public void onStop() {
        super.onStop();
        Log.d(tage,"In onStop() event");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(tage,"In onDestroy() event");
    }


}