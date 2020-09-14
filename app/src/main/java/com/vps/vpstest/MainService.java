package com.vps.vpstest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


import com.google.VpsAgent;

public class MainService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        VpsAgent.init(this,"/data/data/"+this.getPackageName()+"/lib/libzxvps_32.so", "/data/data/"+this.getPackageName()+"/lib/libzxvps_64.so");
        return super.onStartCommand(intent, flags, startId);
    }
}
