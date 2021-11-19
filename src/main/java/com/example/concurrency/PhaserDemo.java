package com.example.concurrency;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int currentPhaser;
        System.out.println("Starting...");

        new Thread(new PhaserThread(phaser, "A")).start();
        new Thread(new PhaserThread(phaser, "B")).start();
        new Thread(new PhaserThread(phaser, "C")).start();

        // Wait for all threads to complete phase one
        currentPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.printf("Phase %d Complete\n", currentPhaser);

        // Wait for all threads to complete phase two
        currentPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.printf("Phase %d Complete\n", currentPhaser);
        
        // Wait for all threads to complete phase three
        currentPhaser = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.printf("Phase %d Complete\n", currentPhaser);

        // Deregister the main thread
        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) {
            System.out.println("The phase is terminated");
        }
    }
}

// A thread of execution that uses a phaser
class PhaserThread implements Runnable {
    Phaser phaser;
    String name;
    
    public PhaserThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.printf("Thread %s Beginning Phase One\n", name);
        phaser.arriveAndAwaitAdvance(); // Signal arrival
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Thread %s Beginning Phase Two\n", name);
        phaser.arriveAndAwaitAdvance(); // Signal arrival
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Thread %s Beginning Phase Three\n", name);
        phaser.arriveAndDeregister();
    }    
}