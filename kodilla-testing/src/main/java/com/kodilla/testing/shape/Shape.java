package com.kodilla.testing.shape;

import java.util.ArrayList;

public interface Shape {

    public String getShapeName() {

    } //daj nazwę kształtu

    public int getField(); // pole {
    return int field;
}

class Circle implements Shape {

    int field; //pole
    String shapeName;

    public String getShapeName() {
        return shapeName;

    }

    public int getFiel()
    return field;
    {

    }

}

class Square implements Shape {

    int field; //pole
    String shapeName;

    public String getShapeName()
    return shapeName;
    {

    }

    public int getFiel()
    return field;{

    }

}

class Triangle implements Shape {

    int field; //pole
    String shapeName;

    public String getShapeName(){
    return shapeName;

    }

    public int getFiels() {
        return field;

    }

}

class ShapeCollector {


    ArrayList<String> shape = new ArrayList<String>();

    int field; //pole
    String shapeName;


    public String addFigure (Shape shape) {
        return shapeName;

    }

    public String removeFigure(Shape shape) {

    }

    public int getFigure(int n) {
        return field;
    }

    public void showFigure() {

    }
}
