package com.example.string;

public class EqualsDemo {
    public static void main(String[] args) {
        var s1 = "Hello";
        var s2 = "Hello";
        var s3 = "Good-bye";
        var s4 = "HELLO";

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));

        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));

        var s5 = new String(s1);
        System.out.println(s1 + " equals " + s5 + " -> " + s1.equals(s5));
        System.out.println(s1 + " == " + s5 + " -> " + (s1 == s5));

    }
}
