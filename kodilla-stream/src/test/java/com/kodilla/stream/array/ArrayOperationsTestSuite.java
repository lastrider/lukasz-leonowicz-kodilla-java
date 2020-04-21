package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int [] array = new int[]{1,2,523,23,456,657,86,35,234,643,46,54,2,13,532,346,456,46,562,24,13};
        //When
        double result = 226.380952380952;
        //Then
        Assert.assertEquals(result,ArrayOperations.getAverage(array),0.0000000001);
        Assert.assertEquals(0,ArrayOperations.getAverage(new int[0]),0.0000000001);
    }

}
