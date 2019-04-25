package com.sargis.kh.synchronizedinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runThread();
        runThreadV2();
        runThreadV3();
    }


    private void runThread() {
        Sender sender = new Sender();

        SendThread sendThread1 = new SendThread("Hi ", sender);
        SendThread sendThread2 = new SendThread("Bye ", sender);

        sendThread1.run();
        sendThread2.run();

        // wait for threads to end
        try
        {
            sendThread1.join();
            sendThread2.join();
        } catch(Exception e) {
            Log.e("LOG_TAG","Interrupted");
        }
    }

    private void runThreadV2() {
        SenderV2 senderV2 = new SenderV2();
        SendThreadV2 sendThread1 = new SendThreadV2("Hi ", senderV2);
        SendThreadV2 sendThread2 = new SendThreadV2("Bye ", senderV2);

        sendThread1.run();
        sendThread2.run();

        // wait for threads to end
        try
        {
            sendThread1.join();
            sendThread2.join();
        } catch(Exception e) {
            Log.e("LOG_TAG","Interrupted");
        }
    }

    private void runThreadV3() {
        SenderV3 senderV3 = new SenderV3();
        SendThreadV3 sendThread1 = new SendThreadV3("Hi ", senderV3);
        SendThreadV3 sendThread2 = new SendThreadV3("Bye ", senderV3);

        sendThread1.run();
        sendThread2.run();

        // wait for threads to end
        try
        {
            sendThread1.join();
            sendThread2.join();
        } catch(Exception e) {
            Log.e("LOG_TAG","Interrupted");
        }
    }
}
