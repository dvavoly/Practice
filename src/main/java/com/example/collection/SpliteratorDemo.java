package com.example.collection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        var values = new ArrayList<Double>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        values.add(4.0);
        values.add(5.0);

        // Use tryAdvance() to display contents of values
        System.out.println("Contents of values: ");
        Spliterator<Double> spliterator = values.spliterator();
        while (spliterator.tryAdvance(System.out::println))
            ;
        System.out.println();
        // Create new list that contains square roots
        spliterator = values.spliterator();
        var sqrs = new ArrayList<Double>();
        while (spliterator.tryAdvance(n -> sqrs.add(Math.sqrt(n))))
            ;
        System.out.println("Contents of sqrs: ");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
