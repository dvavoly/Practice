package com.example.practice.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Derived constructor");
        System.out.println("number = " + number);

        // Class only
        // System.out.println("numberPrivate = " + numberPrivate);
        System.out.println("numberProtected = " + numberProtected);
        System.out.println("numberPublic = " + numberPublic);

    }
}
