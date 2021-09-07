package com.example.lambda;

public class EmptyArrayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmptyArrayException(){
        super("Oops! Something went wrong. Array is Empty :(");
    }
}
