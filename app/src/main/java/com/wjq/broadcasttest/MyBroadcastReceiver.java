package com.wjq.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2017-04-28.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "收到一条广播", Toast.LENGTH_SHORT).show();
        Log.e("MyBroadcastReceiver", "MyBroadcastReceiver");
    }
}
