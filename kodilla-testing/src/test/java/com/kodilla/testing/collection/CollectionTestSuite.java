package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suit: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suit: end");
    }
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(list);
        System.out.println("Exterminated empty ArrayList: " + result);
        //Then
        Assert.assertEquals(result,list);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = exterminator.exterminate(list);
        System.out.println("Exterminated filled ArrayList: " + result);
        //Then
        ArrayList<Integer> evenList = new ArrayList<>();
        Collections.addAll(evenList, new Integer[]{2, 4, 6, 8});
        Assert.assertEquals(evenList,result);
    }
}
