package com.example.codePractice;

abstract class AbstractFigure {
    double dimensionsOne;
    double dimensionsTwo;

    public AbstractFigure(double dimensionsOne, double dimensionsTwo) {
        this.dimensionsOne = dimensionsOne;
        this.dimensionsTwo = dimensionsTwo;
    }

    abstract double area();
}

class RectangleFromAbstractFigure extends AbstractFigure {

    public RectangleFromAbstractFigure(double dimensionsOne, double dimensionsTwo) {
        super(dimensionsOne, dimensionsTwo);
    }

    @Override
    double area() {
        System.out.println("Area for rectangle.");
        return dimensionsOne * dimensionsTwo;
    }
}

class TriangleFormAbstractFigure extends AbstractFigure {

    public TriangleFormAbstractFigure(double dimensionsOne, double dimensionsTwo) {
        super(dimensionsOne, dimensionsTwo);
    }

    @Override
    double area() {
        System.out.println("Area for Triangle.");
        return (dimensionsOne * dimensionsTwo) / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        // var figure = new AbstractFigure(10, 10);
        var rectangle = new RectangleFromAbstractFigure(9, 5);
        var triangle = new TriangleFormAbstractFigure(10, 8);

        AbstractFigure figureReference;

        figureReference = rectangle;
        System.out.println("Area is: " + figureReference.area());

        figureReference = triangle;
        System.out.println("Area is: " + figureReference.area());

        // figureReference = figure;
        // System.out.println("Area is: " + figureReference.area());

    }
}
