package com.example.exception;

public class MultiCatch {
    public static void main(String[] args) {

        int a = 10, b = 0;
        int[] array = { 1, 2, 3 };

        try {
            array[42] = 99; // generate out-of-band exception
            System.out.println(a / b); // generate an arithmetic exception
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught: " + ex);
        }
        System.out.println("After multi-catch.");
    }
}
