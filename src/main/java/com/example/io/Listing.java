package com.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Listing {
    public static void main(String[] args) throws IOException {
        var etcDirectory = Paths.get("/etc");
        try (var stream = Files.list(etcDirectory)) {
            stream.forEach(fileName -> System.out.println("File: " + fileName));
        }

        var path = Paths.get("/etc");
        for (Path p : path) {
            System.out.println(p);
        }
    }
}
