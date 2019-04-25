package com.sargis.kh.synchronizedinjava;

public class SendThreadV3 extends Thread {

    private String msg;
    private SenderV3 sender;

    public SendThreadV3(String msg, SenderV3 sender) {
        this.msg = msg;
        this.sender = sender;
    }

    @Override
    public void run() {
        sender.send(msg);
    }

}