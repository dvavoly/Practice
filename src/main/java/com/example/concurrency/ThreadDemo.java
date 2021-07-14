package com.example.concurrency;

class NewThread implements Runnable {
    Thread thread;

    NewThread() {
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exception) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        var newThread = new NewThread();
        newThread.thread.start(); // start new thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}