package com.nadia.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class ActivityLifeCycle extends AppCompatActivity {
    //define a constant
    private static final String TAG = "ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG , "onCreate started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        if (savedInstanceState!=null){
            String name = savedInstanceState.getString("name");
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        Log.d(TAG , "onSaveInstanceState started");
        outState.putString("name","my saved instance");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG , "onStart started");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d(TAG , "onResume started");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG , "onPause started");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d(TAG , "onStop started");
        super.onStop();
    }
    @Override
    protected void onRestart() {
        Log.d(TAG , "onRestart started");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG , "onDestroy started");
        super.onDestroy();
    }
}