package com.example.streamApi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Create a List of Integer values
        // List<Integer> myList = List.of();
        var myList = List.of(7, 18, 10, 24, 17, 5);

        System.out.println("Original list: " + myList);

        // Find max and min value in the stream
        Stream<Integer> streamOfInteger = myList.stream();
        Optional<Integer> minValue = streamOfInteger.min(Integer::compare);
        if (minValue.isPresent()) {
            System.out.println("Min value is: " + minValue.orElseThrow());
        }

        streamOfInteger = myList.stream();
        Optional<Integer> maxValue = streamOfInteger.max(Integer::compare);
        if (maxValue.isPresent()) {
            System.out.println("Max value is: " + maxValue.orElseThrow());
        }

        // Sort the stream by use of sorted() method
        Stream<Integer> sortedStream = myList.stream().sorted();

        // Display the sorted stream by use of forEach() method
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values by use of filter() method
        Stream<Integer> filteredValues = myList.stream()
                .sorted()
                .filter(n -> (n % 2) == 1);

        System.out.print("Odd values: ");
        filteredValues.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Display the odd values that are grater than 5
        filteredValues = myList.stream()
                .sorted()
                .filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.print("Odd values grater than 5: ");
        filteredValues.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
