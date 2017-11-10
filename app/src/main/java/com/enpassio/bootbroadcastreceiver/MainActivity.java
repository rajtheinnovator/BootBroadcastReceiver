package com.enpassio.bootbroadcastreceiver;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BootCompleted bootCompletedReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bootCompletedReceiver = new BootCompleted();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("my_tag", "onResume called");
        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();

        LocalBroadcastManager.getInstance(this).registerReceiver(bootCompletedReceiver,
                new IntentFilter("com.enpassio.bootbroadcastreceiver.BROADCAST_ACTION"));
    }
}
