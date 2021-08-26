package com.example.practice;

public class TwoGenericType<T, V> {
    T obOne;
    V obTwo;

    public TwoGenericType(T obOne, V obTwo) {
        this.obOne = obOne;
        this.obTwo = obTwo;
    }

    void showType() {
        System.out.println("First type is: " + obOne.getClass().getName());
        System.out.println("Second type is: " + obTwo.getClass().getName());
    }

    public T getObOne() {
        return obOne;
    }

    public V getObTwo() {
        return obTwo;
    }

}
