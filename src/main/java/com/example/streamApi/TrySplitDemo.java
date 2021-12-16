package com.example.streamApi;

import java.util.List;
import java.util.Spliterator;

public class TrySplitDemo {
    public static void main(String[] args) {
        List<String> listOfString = List.of("Alpha", "Beta", "Gamma", "Delta", "Phi", "Omega");
        System.out.println("Original List: ");
        System.out.println(listOfString);

        Spliterator<String> spliterator1 = listOfString.stream().spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        if (spliterator2 != null) {
            System.out.println("Output from second partition of the List: ");
            spliterator2.forEachRemaining(System.out::println);
        }

        System.out.println("Output from first partition of the List: ");
        spliterator1.forEachRemaining(System.out::println);
    }
}
