package com.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Listing {
    public static void main(String[] args) throws IOException {
        try (var stream = Files.list(Path.of("/etc"))) {
            stream.forEach(fileName -> System.out.println("File: " + fileName));
        }

        var path = Path.of("/etc");
        for (Path p : path) {
            System.out.println(p);
        }
    }
}
