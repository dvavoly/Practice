package com.example.lambda;

class MyStringOps {
	static String stringReverse(String inputString) {
		var result = "";

		for (int index = inputString.length() - 1; index >= 0; index--) {
			result += inputString.charAt(index);
		}
		return result;
		// throw new UnsupportedOperationException();
	}

}

public class MethodRefDemo {
	
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inputString = "Lambdas add power to Java";
		String outputString;
		outputString = stringOp(MyStringOps::stringReverse, inputString);
		
		System.out.println("Original string is: " + inputString);
		System.out.println("String reversed is: " + outputString);
	}
}