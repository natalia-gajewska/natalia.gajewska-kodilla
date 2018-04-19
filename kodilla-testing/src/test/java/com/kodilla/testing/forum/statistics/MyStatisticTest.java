package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyStatisticTest {

    @Test
    public void testStatisticsNoPosts() {
//Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        MyStatistics calculateStatistics = new MyStatistics();

//When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


//Then
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentPerPost(), 0);
    }

    @Test
    public void testStatisticsPost100() {
//Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        MyStatistics calculateStatistics = new MyStatistics();

//When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


//Then
        Assert.assertEquals(100, calculateStatistics.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentPerPost(), 0);
    }

    @Test
    public void testStatisticsCommentsAndPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(20);

        MyStatistics calculateStatistics = new MyStatistics();

//When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


//Then
        Assert.assertEquals(25, calculateStatistics.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(20, calculateStatistics.getAverageNumberOfCommentPerUser(), 0);
        Assert.assertEquals(0.8, calculateStatistics.getAverageNumberOfCommentPerPost(), 0);

    }

    @Test
    public void testStatisticsCommentsAndPostNext() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(150);

        MyStatistics calculateStatistics = new MyStatistics();

//When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


//Then
        Assert.assertEquals(25, calculateStatistics.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(150, calculateStatistics.getAverageNumberOfCommentPerUser(), 0);
        Assert.assertEquals(6.0, calculateStatistics.getAverageNumberOfCommentPerPost(), 0);

    }


    @Test
    public void testStatisticsUser100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersList = new ArrayList<>();
        for (int i=0; i<100;i++) {
            usersList.add(Integer.toString(i));
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        MyStatistics calculateStatistics = new MyStatistics();

//When
        calculateStatistics.calculateAdvStatistics(statisticsMock);


//Then
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfPostPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentPerUser(), 0);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentPerPost(), 0);

    }
}
