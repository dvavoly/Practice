package com.example.codePractice;

public class Stack {

	private int[] stack;
	private int topOfStack;

	Stack(final int size) {
		stack = new int[size];
		topOfStack = -1;
	}

	void push(final int item) {
		if (topOfStack == (stack.length - 1)) {
			System.out.println("Stack is full");
		} else {
			stack[++topOfStack] = item;
		}
	}

	int pop() {
		if (topOfStack < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return stack[topOfStack--];
		}
	}
}
