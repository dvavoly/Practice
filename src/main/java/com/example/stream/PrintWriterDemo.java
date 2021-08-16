package com.example.stream;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(final String[] args) {
        final var printWriter = new PrintWriter(System.out, true); // autoFlush set true
        printWriter.println("This is string");
        final int i = -7;
        printWriter.println(i);
        final double d = 4.5e-7;
        printWriter.println(d);
        // printWriter.flush();
    }
}
