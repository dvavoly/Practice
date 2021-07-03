package com.example.practice;

interface ABase {
    void firstMethod();
    void secondMethod();
}

interface BEx extends ABase {
    void thirdMethod();
}

class ExtendedInterfaceTest implements BEx {

    @Override
    public void firstMethod() {
        System.out.println("First method!");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second method...");
    }

    @Override
    public void thirdMethod() {
        System.out.println("Third method.");
    }

}

public class ExtendedInterface {
    public static void main(String[] args) {
        var eif = new ExtendedInterfaceTest();
        eif.firstMethod();
        eif.secondMethod();
        eif.thirdMethod();
    }
}
