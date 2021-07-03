package com.example.codePractice;

abstract class AbstractClass {
    abstract void callMe();

    void callMeToo() {
        System.out.println("This is concrete method.");
    }
}

class ExtendAbstractClass extends AbstractClass {

    @Override
    void callMe() {
        System.out.println("B's implementation of callMe.");
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        var extendAbstractClass = new ExtendAbstractClass();
        extendAbstractClass.callMe();
        extendAbstractClass.callMeToo();
    }
}
