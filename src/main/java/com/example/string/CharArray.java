package com.example.string;

public class CharArray {
    public static void main(String[] args) {
        var string = "This is a new string";
        System.out.println(stringWithWhiteSpaces(string));
    }

    private static String stringWithWhiteSpaces(String inputString) {
        var sb = new StringBuilder();
        for (var ch : inputString.toCharArray()) {
            sb.append(ch).append(" ");
        }
        return sb.toString().trim();
    }
}
