package com.example.practice;

import com.example.practice.p2.Ring;

public class Box implements Ring, CallBack {

	private double width;
	private double height;
	private double depth;

	Box(Box box) {
		this.width = box.width;
		this.height = box.height;
		this.depth = box.depth;
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double length) {
		width = height = depth = length;
	}

	double volume() {
		return width * height * depth;
	}

	@Override
	public void ringABell() {
		System.out.println("Ringing!");
	}

	@Override
	public void callBack(int param) {
		System.out.println("Param is: " + param);
	}

}
