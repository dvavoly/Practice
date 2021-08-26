package com.example.concurrency.waitandnotify;

public class TuskRunner {

    private volatile static int number;
    private volatile static boolean ready;

    private static class Reader extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        new Reader().start();
        number = 42;
        ready = true;
    }
}
