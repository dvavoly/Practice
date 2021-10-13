package com.example.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> noValueOptional = Optional.empty();
        Optional<String> hasValueOptional = Optional.of("ABCDEFG");

        if (noValueOptional.isPresent()) {
            System.out.println("This won't be displayed");
        } else {
            System.out.println("noValueOptional has no value");
        }

        if (hasValueOptional.isPresent()) {
            System.out.println("The string in hasValueOptional is: " + hasValueOptional.get());
        }

        String defaultString;
        // defaultString = noValueOptional.get();
        defaultString = noValueOptional.orElse("Default String");
        System.out.println(defaultString);
    }
}
