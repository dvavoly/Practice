package com.example.lambda;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> factorial = n -> {
			int result = 1;
			for (int index = 1; index <= n; index++) {
				result *= index;
			}
			return result;
		};

		System.out.println("The factorial 3 is: " + factorial.apply(3));
		System.out.println("The factorial 5 is: " + factorial.apply(5));

	}
}
