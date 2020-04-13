package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

interface Shape {
    String getShapeName();

    double getField();
}

public class ShapeCollector {

    private final List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public Shape getFigure(int index) {
        if (index < 0) {
            return null;
        } else if (index > listOfShapes.size() - 1) {
            return null;
        } else {
            return listOfShapes.get(index);
        }
    }

    public boolean removeFigure(Shape shape) {
        if (listOfShapes.contains(shape)) {
            listOfShapes.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public int listSize() {
        return listOfShapes.size();
    }

    void showFigures(ArrayList<Shape> list) {
        for (Shape shape : list) {
            System.out.println(shape);
        }
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
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
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
        double p = (sideLent1 + sideLent2 + sideLent3) / 2;
        return Math.sqrt(p * (p - sideLent1) * (p - sideLent2) * ((p - sideLent3)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideLent1=" + sideLent1 +
                ", sideLent2=" + sideLent2 +
                ", sideLent3=" + sideLent3 +
                '}';
    }
}

class Circle implements Shape {

    double radiusLength;

    public Circle(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return Math.PI * radiusLength * radiusLength;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radiusLength=" + radiusLength +
                '}';
    }
}
