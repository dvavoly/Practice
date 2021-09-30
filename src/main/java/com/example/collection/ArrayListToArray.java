package com.example.collection;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        var al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Content of ArrayList: " + al);

        // Get the array
        // var arrayOfIntegers = new Integer[al.size()];
        // arrayOfIntegers = al.toArray(arrayOfIntegers);

        var arrayOfIntegers = al.toArray(new Integer[0]);

        int sum = 0;
        // Sum the array
        for (int i : arrayOfIntegers) {
            sum += i;
        }

        System.out.println("Sum of all elements the array is: " + sum);
    }
}
