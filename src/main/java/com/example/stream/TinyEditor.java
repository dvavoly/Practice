package com.example.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEditor {
    public static void main(String[] args) throws IOException {
        // create a BufferedReader using System.in
        var br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayOfString = new String[100];
        System.out.println("Enter lines of text");
        System.out.println("Enter 'stop' to quit");
        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfString[i] = br.readLine();
            if (arrayOfString[i].equals("stop")) {
                break;
            }
        }
        System.out.println("\nHere is your file:");
        // display the lines
        for (String string : arrayOfString) {
            if (string.equals("stop")) {
                break;
            }
            System.out.println(string);
        }
    }
}
