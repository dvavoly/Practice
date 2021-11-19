package com.example.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("Barrier reached!");
        });

        System.out.println("Starting...");

        new Thread(new BarrierExample(barrier, "A")).start();
        new Thread(new BarrierExample(barrier, "B")).start();
        new Thread(new BarrierExample(barrier, "C")).start();
        new Thread(new BarrierExample(barrier, "W")).start();
        new Thread(new BarrierExample(barrier, "X")).start();
        new Thread(new BarrierExample(barrier, "Y")).start();
        new Thread(new BarrierExample(barrier, "Z")).start();
    }
}

class BarrierExample implements Runnable {
    CyclicBarrier barrier;
    String name;

    BarrierExample(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}