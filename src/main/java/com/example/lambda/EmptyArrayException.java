package com.example.lambda;

public class EmptyArrayException extends Exception {

	EmptyArrayException(){
        super("Oops! Something went wrong. Array is Empty :(");
    }
}
