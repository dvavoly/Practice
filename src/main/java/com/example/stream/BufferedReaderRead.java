package com.example.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderRead {
    public static void main(String[] args) throws IOException {
        char c;
        var br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' for quit.");
        // read characters
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
