package com.example.string;

public class ReverseString {
    static String reverseString(String inputString) {

        if (inputString.length() <= 1) {
            return inputString;
        }

        return reverseString(inputString.substring(1)) + inputString.charAt(0);
    }

    static String reverseStringWithSB(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    static String reverseStringWithArray(String inputString) {
        var sb = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }
}
