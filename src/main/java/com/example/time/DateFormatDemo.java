package com.example.time;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + dateFormat.format(date));
        
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("The UK: " + dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("The US: " + dateFormat.format(date));
    }
}
