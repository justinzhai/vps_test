package com.vps.vpstest;


import android.app.Activity;
import android.os.Bundle;

import com.google.VpsAgent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String dir=this.getFilesDir().getAbsolutePath();

        VpsAgent.init(this,dir+"/lib/libzxvps_32.so", dir+"/lib/libzxvps_64.so");
    }
}
