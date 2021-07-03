package com.example.practice.p1;

public class SamePackage {
    SamePackage() {

        var p = new Protection();
        System.out.println("Same package constructor");
        System.out.println("number = " + p.number);

        // Class only
        // System.out.println("numberPrivate = " + p.numberPrivate);
        System.out.println("numberProtected = " + p.numberProtected);
        System.out.println("numberPublic = " + p.numberPublic);
    }
}
