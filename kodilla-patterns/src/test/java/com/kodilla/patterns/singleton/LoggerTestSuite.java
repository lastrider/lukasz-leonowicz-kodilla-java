package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    Logger logger = Logger.getInstance();

    @Test
    public void logTest () {
        //Given
        //When
        logger.log("some text");
        //Then
        Assert.assertEquals("some text", logger.getLastLog());
    }

    @Test
    public void secondInitTest() {
        //Given
        Logger logger1 = Logger.getInstance();
        //When
        logger1.log("second text");
        //Then
        Assert.assertEquals(logger.getLastLog(),logger1.getLastLog());
    }

}