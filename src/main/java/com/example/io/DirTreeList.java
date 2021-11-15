package com.example.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Create a custom version of SimpleFileVisitor<Path> that overrides the visitFile() method
class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {
        String dirName = "examples";
        System.out.printf("Directory tree starting with %s:\n", dirName );
        try {
            Files.walkFileTree(Path.of(dirName), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
