package com.sargis.kh.synchronizedinjava;

import android.util.Log;

public class SenderV2 {

    public synchronized void send(String msg) {

        Log.e("LOG_TAG", "Sending " + msg);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Log.e("LOG_TAG", "Thread  interrupted.");
        }

        Log.e("LOG_TAG",msg + " Sent");

    }

}
