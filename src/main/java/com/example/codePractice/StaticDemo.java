package com.example.codePractice;

public class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callMe() {
        System.out.println("a = " + a);
        // final int FILE_NAME = 1;
    }

}

class StaticByName{
    public static void main(String[] args) {
        StaticDemo.callMe();
        System.out.println("b = " + StaticDemo.b);
    }
}