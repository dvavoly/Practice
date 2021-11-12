package com.example.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryList {
    public static void main(String[] args) {
        Path dirName = Path.of("examples");
        // Obtain and manage a directory stream within a try block
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dirName)) {
            System.out.println("Directory name: " + dirName);
            for (Path entry : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.print("<DIR> ");
                } else {
                    System.out.print("      ");
                }
                entry.getName(1);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
