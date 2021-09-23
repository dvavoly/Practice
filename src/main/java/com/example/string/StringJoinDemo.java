package com.example.string;

public class StringJoinDemo {
    public static void main(String[] args) {
        var result = String.join(" ", "Alpha", "Betta", "Gamma");
        System.out.println(result);
        result = String.join(",", "John", "ID# 569", "E-mail: John@HerbSchild.com");
        System.out.println(result);
    }
}
