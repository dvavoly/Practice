package com.example.concurrency;

import java.util.concurrent.Semaphore;

public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new ConsumerSemaphore(q), "Consumer").start();
        new Thread(new ProducerSemaphore(q), "Producer").start();
    }
}

class Q {
    int number;
    // Start with consumer semaphore unavailable
    static Semaphore semaphoreConsumer = new Semaphore(0);
    static Semaphore semaphoreProducer = new Semaphore(1);

    void get() {
        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Got: " + number);
        semaphoreProducer.release();
    }

    void put(int number) {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.number = number;
        System.out.println("Put: " + number);
        semaphoreConsumer.release();
    }
}

class ConsumerSemaphore implements Runnable {
    Q q;

    ConsumerSemaphore(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
class ProducerSemaphore implements Runnable {
    Q q;

    ProducerSemaphore(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}