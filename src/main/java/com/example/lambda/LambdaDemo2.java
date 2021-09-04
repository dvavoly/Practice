package com.example.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2) == 0;
        if (isEven.test(10)) {
            System.out.println("10 is even");
        }
        if (!isEven.test(9)) {
            System.out.println("9 is not even");
        }
        NumericTest isNotNegative = (int n) -> n >= 0;
        if (isNotNegative.test(1)) {
            System.out.println("1 is not negative");
        }
        if (!isNotNegative.test(-1)) {
            System.out.println("-1 is negative");
        }
    }
}
