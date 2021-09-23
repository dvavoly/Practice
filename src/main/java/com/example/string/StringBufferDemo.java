package com.example.string;

public class StringBufferDemo {
    public static void main(String[] args) {
        var sb = new StringBuffer("Hello");
        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        System.out.println("buffer before = " + sb);
        System.out.println("chatAt(1) before = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffered after = " + sb);
        System.out.println("chatAt(1) after = " + sb.charAt(1));

        sb = new StringBuffer("I love Java");
        sb.insert(2, "like ");
        System.out.println(sb);

        sb = new StringBuffer("This is a test.");
        sb.replace(5, 7, "was");
        System.out.println(sb);
    }
}
