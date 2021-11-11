package com.example.io;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (var fileOut = new BufferedOutputStream(Files.newOutputStream(Path.of("text.txt")))) {
            for (int i = 0; i < 26; i++) {
                fileOut.write((byte) ('A' + i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
