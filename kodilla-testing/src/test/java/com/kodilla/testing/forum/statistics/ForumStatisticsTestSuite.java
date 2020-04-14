package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    final double DELTA = 0.0000000001; //1e-10

    @Test
    public void testZeroPostCounts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(0, result1, DELTA);
        Assert.assertEquals(1, result2, DELTA);
        Assert.assertEquals(0, result3, DELTA);
    }

    @Test
    public void testManyPostCounts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(10.0, result1, DELTA);
        Assert.assertEquals(1.0, result2, DELTA);
        Assert.assertEquals(0.1, result3, DELTA);
    }

    @Test
    public void testZeroCommentsCounts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(1.0, result1, DELTA);
        Assert.assertEquals(0.0, result2, DELTA);
        Assert.assertEquals(0.0, result3, DELTA);
    }

    @Test
    public void testMorePostThanComments() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(10.0, result1, DELTA);
        Assert.assertEquals(1.0, result2, DELTA);
        Assert.assertEquals(0.1, result3, DELTA);
    }

    @Test
    public void testLessPostThanComments() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(1000);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(1.0, result1, DELTA);
        Assert.assertEquals(10.0, result2, DELTA);
        Assert.assertEquals(10.0, result3, DELTA);
    }

    @Test
    public void testZeroUsers() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(0, result1, DELTA);
        Assert.assertEquals(0, result2, DELTA);
        Assert.assertEquals(1, result3, DELTA);
    }

    @Test
    public void testAllEquallyAboveZero() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        Statistics statistics = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumStatistic.calculateAdvStatistics(statistics);
        double result1 = forumStatistic.getPostsPerUsersRatio();
        double result2 = forumStatistic.getCommentsPerUsersRatio();
        double result3 = forumStatistic.getCommentsPerPostsRatio();
        //Then
        Assert.assertEquals(1, result1, DELTA);
        Assert.assertEquals(1, result2, DELTA);
        Assert.assertEquals(1, result3, DELTA);
    }
}