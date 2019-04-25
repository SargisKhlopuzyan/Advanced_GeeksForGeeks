package com.sargis.kh.synchronizedinjava;

public class SendThread extends Thread {

    private String msg;
    private Sender sender;

    public SendThread(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}