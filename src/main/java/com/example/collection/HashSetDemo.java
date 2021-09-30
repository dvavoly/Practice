package com.example.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Set<String> hs = new HashSet<>(); // save order insertion of elements
        Set<String> hs = new LinkedHashSet<>(); // does not save order insertion of elements

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
