package com.example.streamApi;

import java.util.List;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        // Create List of Integer
        List<Integer> listOfInteger = List.of(7, 18, 10, 24, 17, 5);
        Optional<Integer> reduceOp = listOfInteger.stream().reduce((a, b) -> a * b);
        if (reduceOp.isPresent()) {
            System.out.println("Product is Optional: " + reduceOp.orElseThrow());
        }
        Integer reduce = listOfInteger.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product is int: " + reduce);
        
        Integer parallelReduce = listOfInteger.parallelStream().reduce(1, (a, b) -> a * b, (a, b) -> a * b);
        System.out.println("Result of parallel stream: " + parallelReduce);
    }
}
