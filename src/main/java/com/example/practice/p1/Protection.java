package com.example.practice.p1;

public class Protection {
    int number = 1;
    private int numberPrivate = 2;
    protected int numberProtected = 3;
    public int numberPublic = 4;

    public Protection() {
        System.out.println("Base constructor.");
        System.out.println("number = " + number);
        System.out.println("numberPrivate = " + numberPrivate);
        System.out.println("numberProtected = " + numberProtected);
        System.out.println("numberPublic = " + numberPublic);
    }
}
