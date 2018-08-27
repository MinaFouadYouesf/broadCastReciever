package com.example.mina.broadcastreciever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/*
Broadcast Receivers simply respond to broadcast messages from other applications or from the system itself.
These messages are sometime called events or intents. For example, applications can also initiate broadcasts
 to let other applications know that some data has been downloaded to the device and is available for them to use,
 so this is broadcast receiver who will intercept this communication and will initiate appropriate action.

2 steps to make BroadcastReceiver works for the system broadcasted intents −

                  1- Creating the Broadcast Receiver.//may br register in mainfest or in java-- Context.registerReceiver()
                  2- Registering Broadcast Receiver
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("android.intent.action.BATTERY_CHANGED"); sendBroadcast(intent);
    }
}
