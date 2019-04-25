package com.sargis.kh.synchronizedinjava;

public class SendThreadV2 extends Thread {

    private String msg;
    private SenderV2 sender;

    public SendThreadV2(String msg, SenderV2 sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        sender.send(msg);
    }
}