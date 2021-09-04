package com.example.lambda;

public class BlockLambdaDemo3 {
    public static void main(String[] args) {
        StringFunc reverse = n -> {
            String result = "";
            int i;
            for (i = n.length() - 1; i >= 0; i--) {
                result += n.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda reverse is: " + reverse.func("Lambda"));
        System.out.println("Expression reverse is: " + reverse.func("Expression"));
    }
}
