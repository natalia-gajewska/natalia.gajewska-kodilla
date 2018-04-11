package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {

   private ArrayList<Shape> shapes = new ArrayList<Shape>();

   public List<Shape> getShapes(){
       return shapes; //tworzenie getter
   }

    public void addFigure(Shape figura) {
        shapes.add(figura);
    } //typ, nazwa, testujemy metody tylko publiczne

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    } //dodajemy do listy pozniej usuwamy i srawdzamy czy lista jest pusta.

    public Shape getFigure(int n) {
        return shapes.get(0);
    }

    public String showFigure() {
        return shapes.toString();
    }
}