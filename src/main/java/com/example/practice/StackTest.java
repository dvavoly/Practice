package com.example.practice;

public class StackTest {
    public static void main(String[] args) {
        IntStack myStack1;
        IntStack myStack2;

        // fixed stack
        myStack1 = new FixedStack(15);
        myStack2 = new FixedStack(8);

        // Push some number in to the stack
        for (var i = 0; i < 15; i++) {
            myStack1.push(i);
        }

        for (var i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        // Pop those number off the stack
        System.out.println("Stack in myStack1:");
        for (int i = 0; i < 15; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack2.pop() + " ");
        }

        // Dynamic stack
        myStack1 = new DynamicStack(5);
        myStack2 = new DynamicStack(8);

        // Push some number in to the stack
        for (var i = 0; i < 15; i++) {
            myStack1.push(i);
        }

        for (var i = 0; i < 12; i++) {
            myStack2.push(i);
        }

        // Pop those numbers off the stack
        System.out.println("\nStack in myStack1:");
        for (int i = 0; i < 15; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            System.out.print(myStack2.pop() + " ");
        }

    }
}
