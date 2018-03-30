package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


public class ShapeCollectionTestSuiteTest {

    @Test
    public void testGetFigure() {
        System.out.println("Test called testGetFigure");
        //Given
        Shape triangle = new Triangle("triangle", 3, 4);
        Shape square = new Square("square", 3);
        Shape circle = new Circle("circle", 7);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.addFigure(circle);
        //Then
        Assert.assertEquals(square, collector.getFigure(1));
    }
}