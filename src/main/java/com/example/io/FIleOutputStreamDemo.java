package com.example.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStreamDemo {
    public static void main(String[] args) {
        String source = """
                Now is the time for all good men
                to come to the aid of their country
                and pay their due taxes.
                """;
        byte[] bytes = source.getBytes();
        try (var fileOut1 = new FileOutputStream("file1.txt");
                var fileOut2 = new FileOutputStream("file2.txt");
                var fileOut3 = new FileOutputStream("file3.txt")) {

            // Write to first file
            for (int i = 0; i < bytes.length; i += 2) {
                fileOut1.write(bytes[i]);
            }

            // Write to second file
            fileOut2.write(bytes);

            // Write to third file
            var offset = bytes.length - bytes.length / 4;
            var numberOfBytes = bytes.length / 4;
            fileOut3.write(bytes, offset, numberOfBytes);
        } catch (IOException ex) {
            System.out.println("An I/O Exception occurred: " + ex.getMessage());
        }
    }
}
