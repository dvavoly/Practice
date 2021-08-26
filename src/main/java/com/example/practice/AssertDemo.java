package com.example.practice;

public class AssertDemo {
    static int val = 3;

    static int getNumber() {
        return val--;
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 10; i++) {
            // n = getNumber();
            assert (n = getNumber()) > 0 : "n is not positive!";
            System.out.println("n is " + n);
        }
    }
}
