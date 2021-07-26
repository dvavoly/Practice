package com.example.practice;

import java.lang.reflect.Method;

public class Meta {
    // annotate a method
    @MyAnnotation(string = "Annotation Example", value = 100)
    public static void myMethod() {
        var ob = new Meta();

        try {
            Class<?> c = ob.getClass();
            Method method = c.getMethod("myMethod");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.string() + " " + annotation.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        myMethod();
    }
}
