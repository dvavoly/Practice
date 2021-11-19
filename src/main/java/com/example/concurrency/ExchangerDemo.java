package com.example.concurrency;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        var exchanger = new Exchanger<String>();
        new Thread(new UseString(exchanger)).start();
        new Thread(new MakeString(exchanger)).start();
    }
}

class MakeString implements Runnable {
    Exchanger<String> exchanger;
    String string;

    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.string = new String();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            // Fill Buffer
            for (int j = 0; j < 5; j++) {
                string += ch++;
            }
            try {
                // Exchange buffer for an empty one
                string = exchanger.exchange(string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class UseString implements Runnable {
    Exchanger<String> exchanger;
    String string;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.string = new String();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                string = exchanger.exchange(new String());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Got: " + string);
        }
    }
}