package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

interface Shape {
    String getShapeName();

    double getField();
}

public class ShapeCollector {

    private List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {

    }

    public Shape getFigure(int index) {
        //temporary outcome
        return new Square(2);
    }

    public boolean removeFigure(Shape shape) {
        //temporary
        return false;
    }

    void showFigures(ArrayList list) {
    }

}

class Square implements Shape {
    double sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return "Temporary name: Square";
    }

    public double getField() {
        //temporary
        return 1.0;
    }
}

class Triangle implements Shape {
    double sideLent1;
    double sideLent2;
    double sideLent3;

    public Triangle(double sideLent1, double sideLent2, double sideLent3) {
        this.sideLent1 = sideLent1;
        this.sideLent2 = sideLent2;
        this.sideLent3 = sideLent3;
    }

    public String getShapeName() {
        return "Temporary name: Triangle";
    }

    public double getField() {
        //temporary
        return 2.0;
    }
}

class Circle implements Shape {

    double radiusLength;

    public Circle (double radiusLength) {
        this.radiusLength= radiusLength;
    }

    public String getShapeName() {
        return "Temporary name: Circle";
    }

    public double getField() {
        //temporary
        return 3.0;
    }
}
