package com.example.concurrency;

class BaseThread implements Runnable {
    private String name;
    Thread thread;
    private boolean suspendFlag;

    BaseThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        suspendFlag = false;
        System.out.println("New Thread: " + thread.getName());
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);

                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " exiting.");

    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = true;
        notify();
    }
}

public class SuspendAndResume {
    public static void main(String[] args) {
        var first = new BaseThread("One");
        var second = new BaseThread("Two");

        first.thread.start();
        second.thread.start();

        try {
            Thread.sleep(2000);
            first.mySuspend();
            System.out.println("Suspending thread One");
            System.out.println("Is alive: " + first.thread.isAlive());
            Thread.sleep(1000);
            first.myResume();
            System.out.println("Resuming thread One");
            System.out.println("Is alive: " + first.thread.isAlive());
            second.mySuspend();
            System.out.println("Suspending thread Two");
            System.out.println("Is alive: " + second.thread.isAlive());
            Thread.sleep(1000);
            second.myResume();
            System.out.println("Resuming thread Two");
            System.out.println("Is alive: " + second.thread.isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // wait for threads to finish

        try {
            System.out.println("Waiting for threads to finish");
            first.thread.join();
            second.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting");
    }
}
