package com.example.concurrency;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread.getName());

        // change the name of the thread
        thread.setName("My brand new super-duper thread :/");
        System.out.println("After name change: " + thread.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }
    }
}
