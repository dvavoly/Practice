package com.example.practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Simple annotation class
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String string() default "Testing";

    int value() default 9000;
}
