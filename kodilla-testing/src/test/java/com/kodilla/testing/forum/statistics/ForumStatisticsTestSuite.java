package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class ForumStatisticsTestSuite {

    private List<String> generateListOfUsers(int usersAmount) {
        List<String> usersList = new ArrayList<>();
        for(int n = 0; n < usersAmount; n++) {
            usersList.add("UserName" +n);
        }
        return usersList;
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsWith0Posts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        Mockito.when(statisticsMock.postCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWith1000Posts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        Mockito.when(statisticsMock.postCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWith0Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        Mockito.when(statisticsMock.commentCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfComments());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWithMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        Mockito.when(statisticsMock.commentCount()).thenReturn(15);
        Mockito.when(statisticsMock.postCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double expectedAverageCommentsPerPost = (double) 15/10;

        //Then
        Assertions.assertEquals(15,forumStatistics.getNumberOfComments());
        Assertions.assertEquals(10,forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0,forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0,forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(expectedAverageCommentsPerPost, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWithMorePostsThanComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        Mockito.when(statisticsMock.commentCount()).thenReturn(10);
        Mockito.when(statisticsMock.postCount()).thenReturn(25);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double expectedAverageCommentsPerPost = (double) 10/25;

        //Then
        Assertions.assertEquals(10,forumStatistics.getNumberOfComments());
        Assertions.assertEquals(25,forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0,forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0,forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(expectedAverageCommentsPerPost, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWith0Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOf0Users = generateListOfUsers(0);
        Mockito.when(statisticsMock.usersNames()).thenReturn(listOf0Users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0,forumStatistics.getAverageCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsWith100Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOf100Users = generateListOfUsers(100);
        Mockito.when(statisticsMock.usersNames()).thenReturn(listOf100Users);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0,forumStatistics.getAverageCommentsPerUser());
    }

    @Test
    void testShowStatistics() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        List<String> listOf100Users = generateListOfUsers(100);
        Mockito.when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        Mockito.when(statisticsMock.postCount()).thenReturn(50);
        Mockito.when(statisticsMock.commentCount()).thenReturn(25);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        String result = forumStatistics.showStatistics();
        double expectedAveragePostsPerUser = (double) 50/100;
        double expectedAverageCommentsPerUser = (double) 25/100;
        double expectedAverageCommentsPerPost = (double) 25/50;
        String expectedResult = ("Number of users is: " + 100 + "\n" +
                                    "Number of posts is: " + 50 + "\n" +
                                    "Number of comments is: " + 25 + "\n" +
                                    "Average of posts for one user is: " + expectedAveragePostsPerUser + "\n" +
                                    "Average of comments for one user is: " + expectedAverageCommentsPerUser + "\n" +
                                    "Average of comments for one post is: " + expectedAverageCommentsPerPost);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
