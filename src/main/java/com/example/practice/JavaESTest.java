package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class JavaESTest {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElement = elements.get(1);
        System.out.println(firstElement);
    }
}

class _C {
    private static int $;
    private static String c_d;
    public static void main(String[] args) {
        @MyAnnotation(string = "String", value = 100)
        String a_b;
        a_b = "15";
        System.out.println($);
        System.out.println(c_d);
        System.out.println(a_b);

        for (Shape shape : Shape.values()) {
            System.out.println(shape.getShape());
        }
    }
}
