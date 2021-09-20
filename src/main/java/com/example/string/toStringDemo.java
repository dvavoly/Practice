package com.example.string;

import com.example.practice.Box;

public class toStringDemo {
    public static void main(String[] args) {
        Box box = new Box(10, 12, 14);
        String s = "Box b: " + box;
        System.out.println(box);
        System.out.println(s);
    }
}
