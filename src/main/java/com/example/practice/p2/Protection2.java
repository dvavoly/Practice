package com.example.practice.p2;

import com.example.practice.p1.Protection;

public class Protection2 extends Protection {

    Protection2() {
        System.out.println("Derived other package constructor");

        // Same package of class
        // System.out.println("number = " + number);

        // Class only
        // System.out.println("numberPrivate = " + numberPrivate);
        System.out.println("numberProtected = " + numberProtected);
        System.out.println("numberPublic = " + numberPublic);

    }
}
