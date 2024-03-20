package com.example.myo2024hafta0501;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MySecondReceiver  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null &&
                intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
            // Network connectivity has changed
            Toast.makeText(context, "Airplane Mode changed!", Toast.LENGTH_SHORT).show();
        }
    }
}
