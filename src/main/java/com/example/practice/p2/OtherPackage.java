package com.example.practice.p2;

import com.example.practice.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        var p = new Protection();
        System.out.println("Other package constructor");

        // Same package of class
        // System.out.println("number = " + p.number);

        // Class only
        // System.out.println("numberPrivate = " + p.numberPrivate);

        // class, subclass or package only
        // System.out.println("numberProtected = " + p.numberProtected);

        System.out.println("numberPublic = " + p.numberPublic);

    }
}
