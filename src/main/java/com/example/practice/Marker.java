package com.example.practice;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMethod() {
        var classObj = new Marker();
        try {
            Method method = classObj.getClass().getMethod("myMethod");
            if (method.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present.");
            }
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        myMethod();
    }
}
