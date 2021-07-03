package com.example.codePractice;

public class MyClass {
    private int i;

    MyClass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        if (i >= 0) {
            this.i = i;
        }
    }
}
