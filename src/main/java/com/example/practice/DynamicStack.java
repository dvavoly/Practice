package com.example.practice;

public class DynamicStack implements IntStack {
    private int[] stack;
    private int topOfStack;

    DynamicStack(int size) {
        stack = new int[size];
        topOfStack = -1;
    }

    @Override
    public void push(int item) {
        if (topOfStack == stack.length - 1) {
            int[] temp = new int[stack.length * 2]; // double size of existing array
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++topOfStack] = item;
        } else {
            stack[++topOfStack] = item;
        }
    }

    @Override
    public int pop() {
        if (topOfStack < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[topOfStack--];
        }
    }
}
