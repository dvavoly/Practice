package com.example.streamApi;

import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Double> listOfDouble = List.of(1.1, 3.6, 9.2, 4.7, 12.1, 5.0);
        System.out.print("Original values in my list: ");
        listOfDouble.forEach(a -> {
            System.out.print(a + " ");
        });
        System.out.print("\nThe ceilings of the values in myList: ");
        IntStream mapToInt = listOfDouble.stream().mapToInt(a -> (int) Math.ceil(a));
        mapToInt.forEach(a -> {
            System.out.print(a + " ");
        });
    }
}
