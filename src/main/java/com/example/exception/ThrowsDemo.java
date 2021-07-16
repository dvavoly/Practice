package com.example.exception;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException ex) {
            System.out.println("Catch: " + ex);
        }
    }
}
