package com.example.lambda;

@FunctionalInterface
public interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}
