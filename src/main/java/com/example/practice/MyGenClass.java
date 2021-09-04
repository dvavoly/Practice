package com.example.practice;

class MyGenTest<T, V extends Number> {
    T ob1;
    V ob2;

    void set(T o) {
        ob1 = o;
    }

    void set(V o) {
        ob2 = o;
    }

    @Override
    public String toString() {
        return ob1 + " " + ob2;
    }
}

public class MyGenClass {
    public static void main(String[] args) {
        MyGenTest<Integer, Double> test = new MyGenTest<>();
        test.set(123);
        test.set(123.0);
        System.out.println(test);
    }
}
