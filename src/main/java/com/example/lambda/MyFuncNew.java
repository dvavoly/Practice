package com.example.lambda;

@FunctionalInterface
public interface MyFuncNew<T> {
    int func(T[] values, T v);
}
