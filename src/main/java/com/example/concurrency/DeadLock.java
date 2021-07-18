package com.example.concurrency;

class First {
    synchronized void foo(Second second) {
        var name = Thread.currentThread().getName();
        System.out.println(name + " entered First.foo");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " trying to call Second.last()");
    }

    synchronized void last() {
        System.out.println("Inside First.last");
    }
}

class Second {
    synchronized void bar(First first) {
        var name = Thread.currentThread().getName();
        System.out.println(name + " entered Second.bar");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " trying to call First.last()");
        first.last();
    }

    synchronized void last() {
        System.out.println("Inside Second.last");
    }
}

public class DeadLock implements Runnable {
    First first = new First();
    Second second = new Second();
    Thread thread;

    DeadLock() {
        Thread.currentThread().setName("MainThread");
        thread = new Thread(this, "Racing Thread");
    }

    void deadLockStart() {
        thread.start();
        first.foo(second); // get lock on First in this thread
        System.out.println("Back in main thread");
    }

    @Override
    public void run() {
        second.bar(first); // get lock on second in other thread
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        var deadLock = new DeadLock();
        deadLock.deadLockStart();
    }
}
