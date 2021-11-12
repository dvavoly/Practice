package com.example.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShowFile {
    public static void main(String[] args) {
        // First confirm that a filename has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // try (var fileIn = Files.newInputStream(Path.of(args[0]))) {
        try (var fileIn = new BufferedInputStream(Files.newInputStream(Path.of(args[0])))) {
            int i = 0;
            while (i != -1) {
                i = fileIn.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
