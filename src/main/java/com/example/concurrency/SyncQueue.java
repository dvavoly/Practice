package com.example.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class SyncQueue {
    public static void main(String[] args) {
        // BlockingQueue<String> syncQueue = new SynchronousQueue<>();
        BlockingQueue<String> syncQueue = new ArrayBlockingQueue<>(10);
        Runnable producer = () -> {
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
                    String value = String.valueOf(i++);
                    syncQueue.put(value);
                    System.out.println("Added: " + value);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        Runnable consumer = () -> {
            while (true) {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                    System.err.println("Read: " + syncQueue.take());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
