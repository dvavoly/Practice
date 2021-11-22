package com.example.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> futureInteger;
        Future<Double> futureDouble;
        Future<Integer> futureInteger1;

        System.out.println("Starting...");

        futureInteger = executorService.submit(new Sum(10));
        futureDouble = executorService.submit(new Hypotenuse(3, 4));
        futureInteger1 = executorService.submit(new FactorialNew(5));

        System.out.println(futureInteger.get(10, TimeUnit.MILLISECONDS));
        System.out.println(futureDouble.get(10, TimeUnit.MILLISECONDS));
        System.out.println(futureInteger1.get(10, TimeUnit.MILLISECONDS));

        executorService.shutdown();
        System.out.println("Done");
    }
}

// Following are three computational thread
class Sum implements Callable<Integer> {
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypotenuse implements Callable<Double> {
    double side1;
    double side2;

    public Hypotenuse(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class FactorialNew implements Callable<Integer> {
    int stop;

    public FactorialNew(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}