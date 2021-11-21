package com.example.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

// A simple example that uses an Executor
public class SimpleExecutorExample {
    public static void main(String[] args) {
        var latchOne = new CountDownLatch(5);
        var latchTwo = new CountDownLatch(5);
        var latchThree = new CountDownLatch(5);
        var latchFour = new CountDownLatch(5);
        var executorService = Executors.newFixedThreadPool(2);

        System.out.println("Starting...");

        // Starting the threads
        executorService.execute(new TestThread(latchOne, "A"));
        executorService.execute(new TestThread(latchTwo, "B"));
        executorService.execute(new TestThread(latchThree, "C"));
        executorService.execute(new TestThread(latchFour, "D"));

        executorService.shutdown();
        System.out.println("Done");
    }
}

class TestThread implements Runnable {
    CountDownLatch latch;
    String name;

    public TestThread(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    };

    @Override
    public void run() {
        for (int index = 0; index < 5; index++) {
            System.out.println(name + ": " + index);
            latch.countDown();
        }
    }
}