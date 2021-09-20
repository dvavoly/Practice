package com.example.practice;

import com.example.practice.p2.Ring;

public class Box implements Ring, CallBack {

    private double width;
    private double height;
    private double depth;

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public Box(double length) {
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

    @Override
    public String toString() {
        return "Dimensions are: " + width + " by " + depth + " by " + height + ".";
    }

}
