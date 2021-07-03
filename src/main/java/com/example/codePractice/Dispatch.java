package com.example.codePractice;

class First {
    void callMe() {
        System.out.println("Inside First's callMe method");
    }
}

class Second extends First {
    void callMe() {
        System.out.println("Inside Second's callMe method");
    }
}

class Third extends Second {
    void callMe() {
        System.out.println("Inside Third's callMe method");
    }
}

public class Dispatch {
    public static void main(String[] args) {

        First first = new First();
        Second second = new Second();
        Third third = new Third();

        First a;

        a = first;

        a.callMe();

        a = second;
        a.callMe();

        a = third;
        a.callMe();
    }
}
