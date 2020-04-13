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

    @Test
    public void testAddFigure() {
        //Given
        Square theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        theCollector.addFigure(theSquare);
        int result = theCollector.listSize();
        //Then
        Assert.assertEquals(1, result);
    }

    @Test
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

    @Test
    public void testGetFigureIndexBellowZero(){
        //Given
        Shape theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        theCollector.addFigure(theSquare);
        Shape result = theCollector.getFigure(-1);
        //Then
        Assert.assertNull(result);
    }

    @Test
    public void testGetFigureIndexAboveListRange(){
        //Given
        Shape theSquare = new Square(1);
        Shape theTriangle = new Triangle(3, 4, 5);
        Shape theCircle = new Circle(2);
        ShapeCollector  theCollector = new ShapeCollector();
        //When
        theCollector.addFigure(theCircle);
        theCollector.addFigure(theSquare);
        theCollector.addFigure(theTriangle);
        Shape result = theCollector.getFigure(15);
        //Then
        Assert.assertNull(result);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        boolean result = theCollector.removeFigure(theSquare);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape theSquare = new Square(1);
        ShapeCollector theCollector = new ShapeCollector();
        //When
        theCollector.addFigure(theSquare);
        boolean result1 = theCollector.removeFigure(theSquare);
        int result2 = theCollector.listSize();
        //Then
        Assert.assertTrue(result1);
        Assert.assertEquals(0,result2);
    }

    @Test
    public void testGetShapeName() {
        //Given
        Shape theSquare = new Square(1);
        //When
        String result = theSquare.getShapeName();
        //Then
        Assert.assertEquals("Square", result);
    }

    @Test
    public void testGetSquareField() {
        //Given
        Shape theSquare = new Square(2);
        //When
        double result = theSquare.getField();
        //Then
        Assert.assertEquals(4.0, result,0);
    }

    @Test
    public  void testGetCircleField(){
        //Given
        Shape theCircle = new Circle(2);
        //When
        double result = theCircle.getField();
        //Then
        Assert.assertEquals(Math.PI*4, result,0);
    }

    @Test
    public void testGetTriangleField(){
        //Given
        Shape theTriangle = new Triangle(3, 4, 5);
        //When
        double result = theTriangle.getField();
        //Then
        Assert.assertEquals(6.0, result,0);
    }
}
