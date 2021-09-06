package com.example.lambda;

@FunctionalInterface
public interface MyFunc<T> {
    T func(T t);
}
