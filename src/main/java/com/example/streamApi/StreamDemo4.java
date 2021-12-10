package com.example.streamApi;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Double> listOfDouble = List.of(7.0, 18.0, 10.0, 24.0, 17.0, 5.0);
        Stream<Double> streamOfSqrt = listOfDouble.stream().map(a -> Math.sqrt(a));
        Double productOfSqrRoots = streamOfSqrt.reduce(1.0, (a, b) -> a * b);
        System.out.println("Product of square roots: " + productOfSqrRoots);
    }
}
