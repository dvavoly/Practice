package com.example.concurrency;

public class GollumAndTheRing {
    public static void main(String[] args) {
        MyPrecious precious = new MyPrecious(); // Only one object
        for (int i = 1; i <= 5; i++) {
            new Thread(new ThreadOfFindingPrecious(precious, i)).start();
        }
    }
}

class MyPrecious {
    synchronized void findPrecious(int i) { // Method not synchronized
        System.out.println("+" + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-" + i);
    }
}

class ThreadOfFindingPrecious implements Runnable {

    MyPrecious precious;
    int count;

    public ThreadOfFindingPrecious(MyPrecious precious, int count) {
        this.precious = precious;
        this.count = count;
    }

    @Override
    public void run() {
        precious.findPrecious(count);
    }
}