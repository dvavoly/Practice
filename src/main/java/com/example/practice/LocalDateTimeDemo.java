package com.example.practice;

import java.time.LocalDateTime;
import java.util.Comparator;

public class LocalDateTimeDemo implements Comparator<LocalDateTimeDemo>{
    private static LocalDateTime ldt1;
    private static LocalDateTime ldt2;
    public static void main(String[] args) {
        ldt1 = LocalDateTime.now();
        ldt2 = ldt1.plusDays(0);

        if (!isLocalDateTime(ldt1)) {
            return;
        }

        if (ldt2.isAfter(ldt1) || ldt2.isAfter(ldt1)) {
            System.out.println("ldt1 and ldt2 aren't the same");
        }

        System.out.println("ldt1 and ldt2 are the same");
    }

    private static boolean isLocalDateTime(LocalDateTime ldt) {
        boolean flag = ldt instanceof LocalDateTime;
        return flag;
    }

    @Override
    public int compare(LocalDateTimeDemo o1, LocalDateTimeDemo o2) {
        return o1.ldt1.compareTo(o2.ldt1);
    }
}
