package com.example.practice;

public class JavaObjectgetClassExample {
    public static void main(String[] args) {
        Object obj = new String("Java is awesome!");
        // Class classOfObject = obj.getClass();
        // System.out.println("Class of object is: " + classOfObject.getName());
        System.out.println(obj.toString());
    }
}
