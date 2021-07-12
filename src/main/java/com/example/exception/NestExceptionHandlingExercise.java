package com.example.exception;

public class NestExceptionHandlingExercise {
    public static void main(String[] args) {
        try {
            int a = args.length;
            // If no command-line args are present, the following statement will generate
            // divide-by-zero exception.

            int b = 42 / a;
            System.out.println("a: " + a);
            System.out.println("b; " + b);

            try {
                if (a == 1) {

                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
