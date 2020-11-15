package com.kodilla.testing.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        //Given
        long sum = 0;
        //When
        for (int i = 0; i < 1000; i++) {
            sum +=i;
            System.out.println("[" + i +"] Sum equals: " + sum);
        }
        //Then
        assertEquals(4999500,sum);
    }

}
