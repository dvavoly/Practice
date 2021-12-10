package com.example.streamApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class GetStream {
    public static void main(String[] args) throws IOException {
        // var array = new int[] { 1, 5, 3, 4, 8, 9, 0, 12, 45, 77, 2, 6, 11 };
        var array = IntStream.rangeClosed(0, 100).toArray();

        var sum = Arrays.stream(array).filter(i -> i > 10).sum();
        System.out.println(sum);

        sum = 0;
        for (var i : array) {
            if (i > 10) {
                sum += i;
            }
        }
        System.out.println(sum);

        var reader = new BufferedReader(new FileReader("text.txt"));
        var countOfWords = reader.lines().count();
        System.out.printf("The file contains %d lines", countOfWords);
        reader.close();
    }
}
