package com.example.concurrency;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    public static void main(String[] args) throws InterruptedException {
        var container = new Container();
        Runnable foo = () -> {
            for (int i = 0; i < 100_000; i++) {
                container.addEntry("foo");
            }
        };
        List<Thread> threads = new ArrayList<>();
        for (long count = 10; count > 0; count--) {
            Thread thread = new Thread(foo);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        // System.out.println(Container.list.size());
        System.out.println("Size is: " + container.size());
        while (container.size() < 1_000_000) {};
        System.out.println("Finished!");
    }
}
