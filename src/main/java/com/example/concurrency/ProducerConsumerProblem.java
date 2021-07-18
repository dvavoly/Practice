package com.example.concurrency;

class Consumer implements Runnable {
    Queue queue;
    Thread thread;

    Consumer(Queue queue) {
        this.queue = queue;
        thread = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true) {
            queue.get();
        }
    }
}

class Producer implements Runnable {
    Queue queue;
    Thread thread;

    Producer(Queue queue) {
        this.queue = queue;
        thread = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.put(i++);
        }
    }
}

class Queue {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        var queue = new Queue();
        var consumer = new Consumer(queue);
        var producer = new Producer(queue);

        // start the threads
        consumer.thread.start();
        producer.thread.start();

        System.out.println("Press Ctrl-C to stop.");

    }
}
