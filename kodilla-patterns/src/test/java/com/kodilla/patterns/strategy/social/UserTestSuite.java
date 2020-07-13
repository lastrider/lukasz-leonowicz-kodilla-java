package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials franek = new Millenials("Franek");
        YGeneration tomek = new YGeneration("Tomek");
        ZGeneration staszek = new ZGeneration("Staszek");
        //When
        String franekMedia = franek.getSocialPublisher();
        String tomekMedia = tomek.getSocialPublisher();
        String staszekMedia = staszek.getSocialPublisher();
        //Then
        Assert.assertEquals("Facebook", franekMedia);
        Assert.assertEquals("Twitter", tomekMedia);
        Assert.assertEquals("Snapchat",staszekMedia);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials franek = new Millenials("Franek");
        //When
        franek.setPublisher(new SnapchatPublisher());
        String franekMedia = franek.getSocialPublisher();
        //Then
        Assert.assertEquals("Snapchat",franekMedia);
    }
}
