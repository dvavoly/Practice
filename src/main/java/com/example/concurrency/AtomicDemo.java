package com.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new Thread(new AtomicThread("A")).start();
        new Thread(new AtomicThread("B")).start();
        new Thread(new AtomicThread("C")).start();
    }
}

class AtomicShared {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
}

// A thread of execution that increments count
class AtomicThread implements Runnable {

    String name;

    public AtomicThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting...");
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " got: " + AtomicShared.atomicInteger.getAndSet(i));
        }
    }
}