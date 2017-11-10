package com.enpassio.bootbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ABHISHEK RAJ on 11/6/2017.
 */

public class BootCompleted extends BroadcastReceiver {
    public void onReceive(Context context, Intent arg1) {
        Intent intent = new Intent(context, LocationService.class);
        context.startService(intent);
        Log.v("my_tag", "receiver called");
        Toast.makeText(context, "receiver called", Toast.LENGTH_LONG).show();
    }
}

