package com.example.practice;

class Order {
    Order() {
        System.out.println("Constructor");
    }

    void print() {
        System.out.println("Method");
    }

    {
        System.out.println("Code block");
    }

    static {
        System.out.println("Static code block");
    }
}

public class OrderLoading {
    public static void main(String[] args) {
        new Order().print();
    }
}
