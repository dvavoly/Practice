package com.example.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();
        new Thread(new LockThread(lock, "C")).start();
    }
}

class SharedLock {
    static int count;
}

class LockThread implements Runnable {
    ReentrantLock lock;
    String name;

    LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " starting...");
        try {
        // First, lock the shared resource
        System.out.println(name + " is waiting to lock the shared resource");
        lock.lock();
        System.out.println(name + " is locking count field");
        SharedLock.count++;
        System.out.println(name + ": " + SharedLock.count);

        // Now, allow a context switch -- if possible
        Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        } finally {
            System.out.println(name + " is unlocking count");
            lock.unlock();
        }
    }
}