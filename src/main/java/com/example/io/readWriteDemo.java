package com.example.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class readWriteDemo {
    public static void main(String[] args) {
        readWriteBytes();
        readWriteChars();
    }

    private static void readWriteChars() {
        try (Reader fileIn = new FileReader("/home/yevhen/dev/devContainer/getting-started/README.md");
                Writer fileOut = new FileWriter("/home/yevhen/dev/devContainer/getting-started/README_new.md")) {
            char[] buffer = new char[4096];
            int readByte = fileIn.read(buffer);
            while (readByte != -1) {
                fileOut.write(buffer, 0, readByte);
                readByte = fileIn.read(buffer);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void readWriteBytes() {
        try (InputStream fileIn = new FileInputStream("/home/yevhen/Downloads/JavaKid8x11_ru.pdf");
                OutputStream fileOut = new FileOutputStream("/home/yevhen/Downloads/JavaKid8x11_ru_new.pdf")) {
            byte[] buffer = new byte[4096];
            int count = fileIn.read(buffer);
            while (count != -1) {
                fileOut.write(buffer, 0, count);
                count = fileIn.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
