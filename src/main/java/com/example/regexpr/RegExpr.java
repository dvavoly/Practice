package com.example.regexpr;

import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        var pattern = Pattern.compile("Java");
        var matcher = pattern.matcher("Java");
        var found = matcher.matches(); // check for a match
        print("Testing Java against Java", found);
        matcher = pattern.matcher("Java SE");
        found = matcher.matches();
        print("Testing Java against Java SE.", found);
        found = matcher.find(); // use find() to find a subsequence
        print("Looking for Java in Java SE.", found);
    }

    private static void print(String text, boolean found) {
        System.out.println(text);
        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match");
        }
    }
}
