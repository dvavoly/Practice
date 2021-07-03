package com.example.practice;

public class BoxWeight extends Box {

	double weight;

	public BoxWeight(BoxWeight boxWeight) {
		super(boxWeight);
		weight = boxWeight.weight;
	}

	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	public BoxWeight() {
		super();
		weight = -1;
	}

	public BoxWeight(double length, double weight) {
		super(length);
		this.weight = weight;
	}
}
