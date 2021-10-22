package com.example.practice;

import java.util.Calendar;
import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        try (var ftm = new Formatter()) {
            ftm.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
            System.out.println(ftm);
        }

        var outputString = String.format("Local time: %tT", Calendar.getInstance());
        System.out.println(outputString);
    }
}
