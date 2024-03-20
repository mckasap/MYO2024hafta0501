package com.example.myo2024hafta0501;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null &&
                intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            // Network connectivity has changed
            Toast.makeText(context, "Network connectivity changed!", Toast.LENGTH_SHORT).show();
        }


    }
}
