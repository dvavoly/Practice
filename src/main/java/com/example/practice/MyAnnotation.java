package com.example.practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Simple annotation class
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String string();
    int value();
}
