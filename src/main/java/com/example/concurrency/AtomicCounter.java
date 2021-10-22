package com.example.concurrency;

import java.util.List;
import java.util.stream.Stream;

class CounterInt {

    int x = 0;
}

public class AtomicCounter {
    public static void main(String[] args) throws InterruptedException {
        CounterInt c = new CounterInt();
        Runnable r = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                c.x++;
            }
        };
        List<Thread> threads = Stream.generate(() -> new Thread(r))
                .limit(10)
                .peek(Thread::start)
                .toList();
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(c.x);
    }
}
