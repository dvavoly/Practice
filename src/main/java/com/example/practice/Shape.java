package com.example.practice;

public enum Shape {

    Triangle("Three"), Square("Four"), Rectangle(), Circle("Round"), Kite("FourSidesInMirror"),
    Pie("CircleWithoutPice");

    private String shape;

    private Shape(String shape) {
        this.shape = shape;
    }

    private Shape() {
        shape = "";
    }

    public String getShape() {
        return shape;
    }
}
