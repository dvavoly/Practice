package com.example.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpAndQuantifier {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("W+");
        Matcher matcher = compile.matcher("W WW WWW");

        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }

        // compile = Pattern.compile("e.+d"); // greedy behavior
        compile = Pattern.compile("e.+?d"); // reluctant behavior
        matcher = compile.matcher("extend cup end table");

        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}
