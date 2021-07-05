package com.example.exception;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            System.out.println(args[0]);
            int b = 42 / a;
            int[] array = { 1 };
            array[42] = 99;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        }
        System.out.println("After try/catch block.");
    }
}
