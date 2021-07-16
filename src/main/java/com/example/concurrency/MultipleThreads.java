package com.example.concurrency;

class ThreadTemplate implements Runnable {
    Thread thread;
    private String name;

    ThreadTemplate(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New thread: " + thread);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            exception.getMessage();
        }
        System.out.println(name + " exiting.");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        var one = new ThreadTemplate("One");
        var two = new ThreadTemplate("Two");
        var three = new ThreadTemplate("Three");

        one.thread.start();
        two.thread.start();
        three.thread.start();

        System.out.println("Thread one is alive: " + one.thread.isAlive());
        System.out.println("Thread two is alive: " + two.thread.isAlive());
        System.out.println("Thread three is alive: " + three.thread.isAlive());

        try {
            System.out.println("Waiting for threads to finish");
            one.thread.join();
            two.thread.join();
            three.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread one is alive: " + one.thread.isAlive());
        System.out.println("Thread two is alive: " + two.thread.isAlive());
        System.out.println("Thread three is alive: " + three.thread.isAlive());

        System.out.println("Main thread exiting.");
    }
}
