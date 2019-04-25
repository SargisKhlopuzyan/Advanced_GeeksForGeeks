package com.sargis.kh.synchronizedinjava;

import android.util.Log;

public class SenderV3 {

    public void send(String msg) {

        synchronized(this) {

            Log.e("LOG_TAG", "Sending " + msg);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Log.e("LOG_TAG", "Thread  interrupted.");
            }

            Log.e("LOG_TAG", msg + " Sent");
        }
    }

}
