package com.example.concurrency.waitandnotify;

public class NetworkDriver {
    public static void main(String[] args) {
        var data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}
