package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    static int counter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("Test " + ++counter + " has been started");
    }

    @After
    public void afterEachTest() {
        System.out.println("-----------------------------------------");
    }

    @Test //1
    public void testAddFigure() {
        //Given
        Square theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        String result = theCollector.toString();
        theCollector.addFigure(theSquare);
        //Then
        Assert.assertNotEquals(result, theCollector);
    }

    @Test //2
    public void testGetFigure() {
        //Given
        Shape theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        theCollector.addFigure(theSquare);
        Shape result = theCollector.getFigure(0);
        //Then
        Assert.assertEquals(theSquare, result);
    }

    @Test //3
    public void testRemoveFigureNotExisting() {
        //Given
        Shape theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        boolean result = theCollector.removeFigure(theSquare);
        //Then
        Assert.assertFalse(result);
    }

    @Test //4
    public void testRemoveFigure() {
        //Given
        Shape theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        boolean result = theCollector.removeFigure(theSquare);
        //Then
        Assert.assertFalse(result);
    }

    @Test //5
    public void testGetShapeName() {
        //Given
        Shape theSquare = new Square(1);
        //When
        String result = theSquare.getShapeName();
        //Then
        Assert.assertEquals("Square", result);
    }

    @Test //6
    public void testGetShapeField() {
        //Given
        Shape theSquare = new Square(1);
        //When
        double result = theSquare.getField();
        //Then
        Assert.assertEquals(1, result);
    }
}
