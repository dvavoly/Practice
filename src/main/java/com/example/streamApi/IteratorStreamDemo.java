package com.example.streamApi;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class IteratorStreamDemo {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> listOfString = List.of("Alpha", "Beta", "Gamma", "Delta", "Phi", "Omega");

        // Obtain a Stream and a Iterator
        Stream<String> myStream = listOfString.stream();
        // Iterator<String> myIterator = myStream.iterator();
        Spliterator<String> myIterator = myStream.spliterator();

        // Iterate the elements is the stream
        // while (myIterator.hasNext()) {
        // String element = myIterator.next();
        // System.out.println(element);
        // }

        // while (myIterator.tryAdvance(System.out::println));

        myIterator.forEachRemaining(System.out::println);
    }
}
