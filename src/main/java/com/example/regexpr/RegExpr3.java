package com.example.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher("test 1 2 3 test");
        while (matcher.find()) {
            System.out.println("Test find in index: " + matcher.start());
        }
    }
}
