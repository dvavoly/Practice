package com.example.codePractice;

class Overriding {
    int i, j;

    public Overriding(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // display i & j
    void show() {
        System.out.println("i & j: " + i + " " + j);
    }
}

/**
 * InnerMethodOverriding
 */
class InnerMethodOverriding extends Overriding {
    int k;

    public InnerMethodOverriding(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        var innerMethodOverriding = new InnerMethodOverriding(10, 15, 8);
        innerMethodOverriding.show();
    }
}