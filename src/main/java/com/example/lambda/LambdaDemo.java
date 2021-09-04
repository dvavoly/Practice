package com.example.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 123.45;
        double value = myNumber.getValue();
        System.out.println("A fixed value: " + value);

        myNumber = () -> Math.random() * 100;
        System.out.println("A random value " + myNumber.getValue());
        System.out.println("Another random value " + myNumber.getValue());

        myNumber = () -> 123; // auto-boxing from int to double
        System.out.println(myNumber.getValue());
    }
}
