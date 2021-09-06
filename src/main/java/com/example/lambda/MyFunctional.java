package com.example.lambda;

@FunctionalInterface
public interface MyFunctional<T> {
    boolean func(T v1, T v2);
}
