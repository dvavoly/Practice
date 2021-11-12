package com.example.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Path.of("examples/test.txt");
        System.out.println("File name: " + filePath.getName(1));
        System.out.println("Path: " + filePath);
        System.out.println("Absolute path: " + filePath.toAbsolutePath());
        System.out.println("Parent: " + filePath.getParent());

        if (Files.exists(filePath)) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }

        try {
            if (Files.isHidden(filePath)) {
                System.out.println("File is hidden");
            } else {
                System.out.println("File is not hidden");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isReadable = Files.isReadable(filePath);
        System.out.println("File is readable: " + isReadable);

        boolean isWritable = Files.isWritable(filePath);
        System.out.println("File is writable: " + isWritable);

        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Is the file a directory? " + attributes.isDirectory());
            System.out.println("Is the file a normal file? " + attributes.isRegularFile());
            System.out.println("Is the file a symbolic link? " + attributes.isSymbolicLink());
            System.out.printf("File list modified: %s%n", attributes.lastModifiedTime());
            System.out.printf("File size: %d Bytes", attributes.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
