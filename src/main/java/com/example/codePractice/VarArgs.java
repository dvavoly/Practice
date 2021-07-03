package com.example.codePractice;

public class VarArgs {

    private static void vaTest(int... variable) {
        System.out.println("Number of args: " + variable.length + ", Contents: ");
        for (int i : variable) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static void vaTest(boolean... variable) {
        System.out.println("Number of args: " + variable.length + ", Contents: ");
        for (boolean i : variable) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void doIt(int a, int b, double c, int... variable) {
        System.out.println("a= " + a + ", b= " + b + ", c= " + c);
        for (int i : variable) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        // vaTest();
        doIt(1, 2, 3.3, 14, 41, 55, 65, 99);
        vaTest(true, false, true);
    }
}
