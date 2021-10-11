package com.example.io;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        // use try with resource to close the stream
        try (FileInputStream fis = new FileInputStream("src/main/java/com/example/io/FileInputStreamDemo.java")) {
            size = fis.available();
            System.out.println("Total available bytes: " + size);
            int n = size / 40;
            System.out.println("First " + n + " bytes of the file one read() at time");
            for (int i = 0; i < n; i++) {
                System.out.print((char) fis.read());
            }
            System.out.println("Still available: " + fis.available());
            
        } catch (Exception e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
