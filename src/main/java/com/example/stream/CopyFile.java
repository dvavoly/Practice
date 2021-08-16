package com.example.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void demoSuppressedException(String filePath) throws IOException {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new IOException();
        } finally {
            fileIn.close();
        }
    }

    public static void demoAddSuppressedException(String filePath) throws IOException {
        Throwable firstException = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(filePath);
        } catch (IOException e) {
            firstException = e;
        } finally {
            try {
                fileIn.close();
            } catch (NullPointerException npe) {
                if (firstException != null) {
                    npe.addSuppressed(firstException);
                }
            }
            // throw npe;
        }
    }

    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try (var fileInput = new FileInputStream(args[0]); var fileOutput = new FileOutputStream(args[1])) {

            do {
                i = fileInput.read();
                if (i != -1) {
                    fileOutput.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
