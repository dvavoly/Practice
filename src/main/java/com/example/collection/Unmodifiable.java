package com.example.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Unmodifiable {
    public static void main(String[] args) {
        // var items = List.of("One", "Two", "Three");
        // items.add("Million"); // List.of create immutable list, exception occur:
        // UnsupportedOperationException
        List<String> items = new ArrayList<>();
        items.add("One");
        items.add("Two");
        items.add("Three");
        System.out.println(items);
        items.clear();
        System.out.println(items);

        List<Integer> naturalNumbers = IntStream.range(0, 10000).boxed().toList();
        Integer[] array = naturalNumbers.toArray(new Integer[0]);
        System.out.println(array.length);
    }
}
