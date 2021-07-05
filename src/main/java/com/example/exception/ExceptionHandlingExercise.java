package com.example.exception;

public class ExceptionHandlingExercise {
    public static void main(String[] args) {
        int a, b;

        try {
            a = 0;
            b = 42 / a;
            System.out.println("This will not be print." + a + b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            System.out.println(e.getMessage());
        }

        System.out.println("After catch statement");
    }

}
