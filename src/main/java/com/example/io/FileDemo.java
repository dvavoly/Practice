package com.example.io;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:/Users/danila/OneDrive/Practice/README.md");
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        String dirname = "c:/Users/danila/OneDrive/Practice/";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Directory of: " + dirname);
            String[] s = f1.list();
            for (String string : s) {
                File f = new File(dirname + string);
                if (f.isDirectory()) {
                    System.out.println(string + " is a directory.");
                } else {
                    System.out.println(string + " is a file.");
                }
            }
        }
    }
}
