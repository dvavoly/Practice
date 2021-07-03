package com.example.codePractice;

class Figure {
    double dimensionsOne;
    double dimensionsTwo;

    public Figure(double dimensionsOne, double dimensionsTwo) {
        this.dimensionsOne = dimensionsOne;
        this.dimensionsTwo = dimensionsTwo;
    }

    double area() {
        System.out.println("Area of Figure is undefined.");
        return -1;
    }
}

class Rectangle extends Figure {

    public Rectangle(double dimensionsOne, double dimensionsTwo) {
        super(dimensionsOne, dimensionsTwo);
    }

    @Override
    double area() {
        System.out.println("Area for rectangle.");
        return dimensionsOne * dimensionsTwo;
    }
}

class Triangle extends Figure {

    public Triangle(double dimensionsOne, double dimensionsTwo) {
        super(dimensionsOne, dimensionsTwo);
    }

    @Override
    double area() {
        System.out.println("Area for Triangle.");
        return (dimensionsOne * dimensionsTwo) / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        var figure = new Figure(10, 10);
        var rectangle = new Rectangle(9, 5);
        var triangle = new Triangle(10, 8);

        Figure figureReference;

        figureReference = rectangle;
        System.out.println("Area is: " + figureReference.area());

        figureReference = triangle;
        System.out.println("Area is: " + figureReference.area());

        figureReference = figure;
        System.out.println("Area is: " + figureReference.area());

    }
}
