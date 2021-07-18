package com.example.concurrency;

class CallMe {
    void call(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String message;
    CallMe target;
    Thread thread;

    public Caller(String message, CallMe target) {
        this.message = message;
        this.target = target;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(message); // synchronized block
        }
    }
}

public class SynchronizedMethods {
    public static void main(String[] args) {
        var target = new CallMe();
        var ob1 = new Caller("Hello", target);
        var ob2 = new Caller("Synchronized", target);
        var ob3 = new Caller("World", target);

        // start the threads
        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
