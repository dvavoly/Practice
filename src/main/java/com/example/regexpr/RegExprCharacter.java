package com.example.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExprCharacter {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher("this is a test.");

        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }

        String str = "Jon Jonathan Frank Ken Tod Jon";
        pattern = Pattern.compile("Jon.*?");
        matcher = pattern.matcher(str);

        System.out.println("Original sequence: " + str);
        str = matcher.replaceAll("Eric ");
        System.out.println("Modified sequence: " + str);

        // Match lowercase word
        pattern = Pattern.compile("[ ,.!]");
        String[] splitString = pattern.split("one two,alpha9 12!done.");

        for (String item : splitString) {
            System.out.println("Next token: " + item);
        }

        str = "W WW WWW";
        boolean matches = str.matches("W WW WWW");
        System.out.println(matches);
    }
}
