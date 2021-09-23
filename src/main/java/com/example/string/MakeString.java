package com.example.string;

public class MakeString {

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c' };
        String s = new String(chars,1, 2);
        System.out.println(s);

        byte[] ascii = { 65, 66, 67, 68, 69, 70 };
        String s1 = new String(ascii);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println("This is a string".length());

        String age = "9";
        String concatenate = "He is " + age + " years old";
        System.out.println(concatenate);

        String out = "Four: " + 2 + 2 + 2;
        System.out.println(out);
        System.out.println(2 + 1 + " years");
        System.out.println("Years: " + 1 + 2);
        var valueOf = String.valueOf("abracadabra");
        System.out.println(valueOf);
        var arrayOfChar = new char[] { 'a', 'b' };
        valueOf.getChars(1, 2, arrayOfChar, 0);
        for (char c : arrayOfChar) {
            System.out.print(c);
            
        }
    }
}
