package com.example.concurrency;

class NewExtendThread extends Thread {
    NewExtendThread() {
        super("Demo thread");
        System.out.println("Child thread: " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Exiting child thread");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        var newThread = new NewExtendThread();
        newThread.start();
        System.out.println("Main thread: " + Thread.currentThread());
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting");
    }
}
