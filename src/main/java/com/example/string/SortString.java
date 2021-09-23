package com.example.string;

import java.util.Arrays;

/**
 * A bubble sort for strings
 */
public class SortString {

    public static void main(String[] args) {
        var arrayOfStrings = new String[] { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to",
                "the", "aid", "of", "their", "country" };
        var temp = "";
        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = i + 1; j < arrayOfStrings.length; j++) {
                if (arrayOfStrings[i].compareTo(arrayOfStrings[j]) > 0) {
                    temp = arrayOfStrings[i];
                    arrayOfStrings[i] = arrayOfStrings[j];
                    arrayOfStrings[j] = temp;
                }
            }
        }

        arrayOfStrings = Arrays.stream(arrayOfStrings).sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(arrayOfStrings));
    }
}
