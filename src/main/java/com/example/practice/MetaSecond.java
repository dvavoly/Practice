package com.example.practice;

import java.lang.reflect.Method;

public class MetaSecond {
    @MyAnnotation(string = "Two parameters", value = 19)
    public static void myMethod(String string, int value) {
        var ob = new MetaSecond();

        Class<?> classObj = ob.getClass();
        try {
            Method method = classObj.getMethod("myMethod", String.class, int.class);
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.string() + " " + annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMethod("test", 10);
    }
}
