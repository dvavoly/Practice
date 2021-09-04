package com.example.practice;

class GenericTest<T> {
    T ob;
    T[] array;

    public GenericTest(T ob, T[] array) {
        this.ob = ob;
        this.array = array;
    }
}

public class Wrong<T> {
    public static void main(String[] args) {
        Integer[] arrayOfInteger = { 1, 2, 3, 4, 5 };
        GenericTest<Integer> iOb = new GenericTest<>(10, arrayOfInteger);

        GenericTest<?>[] gens = new GenericTest<?>[10];
        gens[0] = iOb;
    }
}
