package com.example.practice;

public class DemoSuper {
	public static void main(String[] args) {

		var myBox1 = new BoxWeight(10, 20, 15, 34.3);
		double volume;
		volume = myBox1.volume();
		System.out.println("Volume of myBox1 is: " + volume);

		if (volume >= 1) {
			System.out.println("Hello!");
		}
		
	}

}
