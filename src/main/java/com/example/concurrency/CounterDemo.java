package com.example.concurrency;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Counter {
    int x = 0;
}

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 1_000;)
                c.x++;
        };
        List<Thread> threads = Stream.generate(() -> new Thread(r)).limit(10).peek(Thread::start)
                .collect(Collectors.toList());
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(c.x);
    }
}
