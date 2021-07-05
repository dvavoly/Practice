package com.example.exception;

public class ArithmeticExceptionExercise {

    private static int subroutine() {
        int d = 0;
        int a = 42 / 0;
        return d + a;
    }

    public static void main(String[] args) {
        int subroutine = subroutine();
        int d = 0;
        int a = 42 / d;

        System.out.println("d: " + d);
        System.out.println("a: " + a);
        System.out.println(subroutine);
    }
}
