package com.example.concurrency;

public class MyThread extends Thread {
    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum = +i;
        }
        System.out.println(Thread.currentThread());
        System.out.println(sum);
    }

    public static void main(String[] args) {
        var t = new MyThread();
        t.run();
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(8);

        Thread thread = new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("My brand new super-duper Thread");
                System.out.println("Name of thread: " + Thread.currentThread().getName() + ", Priority: "
                        + Thread.currentThread().getPriority());
                t.run();
            }
        };
        thread.start();
    }
}
