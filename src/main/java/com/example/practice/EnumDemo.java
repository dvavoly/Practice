package com.example.practice;

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Here are all Apple constants: ");
        // use values()

        for (Apple apples : Apple.values()) {
            System.out.println(apples);
        }

        apple = Apple.valueOf("Winesap");
        System.out.println("apple contains " + apple);

        // display all apples and price

        System.out.println("All apple price: ");
        for (Apple item : Apple.values()) {
            System.out.println(item + " costs: " + item.getPrice() + " cents.");
        }

    }
}
