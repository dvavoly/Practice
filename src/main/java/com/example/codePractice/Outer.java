package com.example.codePractice;

public class Outer {
	int outerX = 100;
	int test = 0;

	void test() {
		for (int i = 0; i < 10; i++) {

			class Inner {
				int y = 10;
				void display() {
					System.out.println("display: outerX: " + outerX + " & " + test);
				}
			}

			var inner = new Inner();
			inner.display();
			test++;
			System.out.println(inner.y);
		}
	}

	class SuperInner {
		int inner = 0;
	}

	void accessTest() {
		
	}

}
