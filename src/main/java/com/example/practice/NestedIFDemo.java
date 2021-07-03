package com.example.practice;

import com.example.practice.Top.NestedIF;

class Top {
    public interface NestedIF {
        public boolean isEmptyString(String string);
    }
}

class Middle implements NestedIF {
    @Override
    public boolean isEmptyString(String string) {
        return string.isEmpty();
    }
}

public class NestedIFDemo {
    public static void main(String[] args) {
        NestedIF nestedInterface = new Middle();
        var test = "Not empty string";

        if(!nestedInterface.isEmptyString(test)){
            System.out.println("The string \"" + test + "\" is not empty" );
        }
    }
}
