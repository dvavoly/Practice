package com.example.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        var ts = new TreeSet<String>();

        // Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);

        System.out.println(ts.subSet("C", "F"));

        int a = 1;
        int b = 2;
        int c = 3;

        if (a + b == c) {
            String[] temp = method1();
            System.out.println(temp[0]);
        }

    }

    private static String[] method1() {
        String[] array = new String[1];
        var sb = new StringBuilder();
        sb.append("Be a ");
        sb.append("Java ");
        sb.append("Programmer");
        array[0] = sb.toString();
        return array;
    }
}
