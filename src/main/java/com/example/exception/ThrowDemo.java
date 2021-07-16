package com.example.exception;

public class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException ew) {
            System.out.println("Catch inside demoProc.");
            throw ew;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("ReCaught: " + e);
            e.getMessage();
        }
    }
}
