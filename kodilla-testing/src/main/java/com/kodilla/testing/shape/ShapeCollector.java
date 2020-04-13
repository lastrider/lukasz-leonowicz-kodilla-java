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

    public int listSize(){
        return listOfShapes.size();
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
        return "Square";
    }

    public double getField() {
        double result = sideLength*sideLength;
        return result;
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
        return "Triangle";
    }

    public double getField() {
        double p = (sideLent1+sideLent2+sideLent3)/2;
        double result = Math.sqrt(p * (p - sideLent1) * (p - sideLent2) * ((p - sideLent3)));
        return result;
    }
}

class Circle implements Shape {

    double radiusLength;

    public Circle (double radiusLength) {
        this.radiusLength= radiusLength;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        double result = Math.PI * radiusLength * radiusLength;
        return result;
    }
}
