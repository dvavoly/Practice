package com.example.practice;

public class FixedStack implements IntStack {
    private int[] stack;
    private int topOfStack;

    FixedStack(int size) {
        stack = new int[size];
        topOfStack = -1;
    }

    @Override
    public void push(int item) {
        if (topOfStack == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[++topOfStack] = item;
        }
    }

    @Override
    public int pop() {
        if (topOfStack < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }

    public int length() {
        return stack.length;
    }
}
