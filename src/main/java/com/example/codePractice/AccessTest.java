package com.example.codePractice;

import java.util.Scanner;

public class AccessTest {

	public static void main(String[] args) {

		var access = new Test();
		access.a = 10;
		access.b = 15;
		// access.c = 100;

		access.setC(100);
		System.out.println("a, b & c: " + access.a + ", " + access.b + ", " + access.getC());
		try (var scan = new Scanner(System.in)) {

		}
	}

}
