package com.example.streamApi;

import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Double> listOfDouble = List.of(7.0, 18.0, 10.0, 24.0, 17.0, 5.0);
        Double productOfSqrRoots = listOfDouble.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b);
        System.out.println("Product of square roots: " + productOfSqrRoots);
        Double badReduce = listOfDouble.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b));
        System.out.println("Product of square roots: " + badReduce);
    }
}
