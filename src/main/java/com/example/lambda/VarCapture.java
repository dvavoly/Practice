package com.example.lambda;

public class VarCapture {
    public static void main(String[] args) {
        int number = 10;
        MyFunc<Integer> myLambda = n -> {
            int v = number + n;
            // number++;
            return v;
        };
        // number = 9;
        System.out.println(myLambda.func(10));
    }
}
