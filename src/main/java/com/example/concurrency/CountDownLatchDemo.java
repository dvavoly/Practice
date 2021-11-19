package com.example.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        System.out.println("Starting...");
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                latch.countDown();
                try {
                    Thread.sleep(10); // 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        latch.await();
        System.err.println("End of main method.");
    }
}
