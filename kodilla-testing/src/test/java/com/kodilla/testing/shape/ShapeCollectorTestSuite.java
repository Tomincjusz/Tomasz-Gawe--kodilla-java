package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("All tests are started");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("executing test nr: " + testCounter);
    }

    @Test
    public void addFigureTest() {

        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);
        //Than
        Assertions.assertEquals(3, collection.collectedShapesQuantity());
    }

    @Test
    public void removeFigureTest() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When

        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);

        collection.removeFigure(circle);
        //Than
        Assertions.assertEquals(2, collection.collectedShapesQuantity());
    }
    @Test

    public void getFigureTest() {
        //Given
        ShapeCollector collection = new ShapeCollector();
        //When
        Circle circle = new Circle("circle", 21);
        Square square = new Square("square", 34);
        Triangle triangle = new Triangle("triangle", 314);
        collection.addFigure(circle);
        collection.addFigure(square);
        collection.addFigure(triangle);

        //Than
        Assert.assertEquals(square, collection.getFigure(1));
    }
}

