package com.example.practice;

/**
 * Demonstrate when constructors are executed.
 */
class A {
	A() {
		System.out.println("Inside A's constructor.");
	}
}

class B extends A {
	B() {
		System.out.println("Inside B's constructor.");
	}
}

class C extends B {
	C() {
		System.out.println("Inside C's constructor.");
	}

	void print() {
		System.out.println("This is class C!");
	}
}

public class CallingConstructor {
	public static void main(String[] args) {
		var c = new C();
		c.print();
	}
}