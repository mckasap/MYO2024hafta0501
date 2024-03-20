package com.example.myo2024hafta0501;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MySecondReceiver scndRcv= new MySecondReceiver();
    IntentFilter intentFilter2;

    private MyReceiver rcv;
    IntentFilter intentFilter;

    @Override
    protected void onPause() {
        super.onPause();
       // unregisterReceiver(rcv);
        unregisterReceiver(scndRcv);
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   registerReceiver(rcv,intentFilter);
        registerReceiver(scndRcv,intentFilter2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // rcv= new MyReceiver();
      //  intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
intentFilter2= new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
    }
}