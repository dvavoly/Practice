package com.example.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Attempt to open the file
        try {
            fileInputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file");
            e.printStackTrace();
            return;
        }

        try {
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Any I/O Error ocurred");
        } finally {
            // Close file in all cases
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
                e.printStackTrace();
            }
        }
    }
}
