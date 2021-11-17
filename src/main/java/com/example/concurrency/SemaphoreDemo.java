package com.example.concurrency;

import java.util.concurrent.Semaphore;

// A simple semaphore example
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new IncrementThread("A", semaphore)).start();
        new Thread(new DecrementThread("B", semaphore)).start();
    }
}

// A shared resource
class Shared {
    static int count = 0;
}

// A thread of execution that increments count
class IncrementThread implements Runnable {
    String name;
    Semaphore semaphore;

    IncrementThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        // First get a permit
        System.out.println(name + " is waiting for a permit");
        try {
            semaphore.acquire();
            System.out.println(name + " gets a permit");
            // Now, accesses shared resource

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + " : " + Shared.count);
                // Now, allow a context switch -- if possible
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " realise the permit");
        // Realise the permit
        semaphore.release();
    }
}

// A thread of execution that decrement count
class DecrementThread implements Runnable {
    String name;
    Semaphore semaphore;

    DecrementThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {
            // First get a permit
            System.out.println(name + " waiting for a permit");
            semaphore.acquire();
            System.out.println(name + " get a permit");
            // Now accesses shared resource
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + " : " + Shared.count);

                // Now allow to context switch -- if it possible
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " realise the permit");
        // Realise the permit
        semaphore.release();
    }
}
