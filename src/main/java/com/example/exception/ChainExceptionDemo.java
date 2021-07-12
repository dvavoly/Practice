package com.example.exception;

public class ChainExceptionDemo {
    static void demoProc() {
        var ex = new NullPointerException("Top level");
        ex.initCause(new ArithmeticException("cause"));
        throw ex;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e); // display top level exception
            System.out.println("Original cause: " + e.getCause()); // display cause exception
        }
    }
}
