package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class ShapeCollectionTestSuiteTest {


    @Test
    public void testAddFigure() {
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle();
        collector.addFigure(circle);
        System.out.println("Test called testAddFigure");
        //Given
        Shape koło = collector.getFigure(0);
        Assert.assertTrue(koło != null);
    }

    @Test
    public void testAddFigure2() {
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        Shape trojkat = collector.getFigure(0);
        Assert.assertTrue(trojkat != null);
    }

    @Test
    public void testAddFigure3() {
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        Shape kwadrat = collector.getFigure(0);
        Assert.assertTrue(kwadrat != null);
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        collector.removeFigure(square);
        List<Shape> shapeList = collector.getShapes();
        Assert.assertTrue(shapeList.size() == 0);
    }

    @Test
    public void testShapeGetFigure() {
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        Circle circle = new Circle();
        collector.addFigure(circle);
        Shape koło = collector.getFigure(2);
        Assert.assertTrue(koło != null);
    }
}




