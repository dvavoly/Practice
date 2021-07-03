package com.example.codePractice;

class A {
    int i, j;

    void showIJ() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("Sum of i + j + k: " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // The superclass may be used by itself
        superOb.i = 10;
        superOb.j = 15;
        System.out.println("Content of superOb: ");
        superOb.showIJ();
        System.out.println();

        // The superclass has access to all public members os its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content of subOb: ");
        subOb.showIJ();
        subOb.showK();
        System.out.println();

        System.out.println("Sum in subOb: ");
        subOb.sum();
    }
}