package com.example.lambda;

class MyArrayOps {
    static <T> int countMatching(T[] values, T comparisonValue) {
        int count = 0;

        for (int index = 0; index < values.length; index++) {
            if (values[index] == comparisonValue) {
                count++;
            }
        }
        return count;
    }
}

public class GenericMethodRefDemo {

    static <T> int myOp(MyFuncNew<T> f, T[] values, T v) {
        return f.func(values, v);
    }

    public static void main(String[] args) {
        Integer[] arrayOfIntegers = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] arrayOfStrings = { "One", "Two", "Three", "Two" };
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, arrayOfIntegers, 4);
        System.out.println("Array of Integer contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, arrayOfStrings, "Two");
        System.out.println("Array of String contains " + count + " Twos");

    }
}
