package com.example.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime currentTimeAndDate = LocalDateTime.now();
        System.out.println(currentTimeAndDate);

        // LocalDateTime.
    }
}
