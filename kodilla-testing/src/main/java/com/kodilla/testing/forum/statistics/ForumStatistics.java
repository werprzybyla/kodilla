package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class ForumStatistics {
    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postCount();
        this.numberOfComments = statistics.commentCount();

        if(statistics.usersNames().size() > 0) {
            this.averagePostsPerUser = (double) statistics.postCount() / statistics.usersNames().size();
        } else {
            this.averagePostsPerUser = 0;
        }

        if(statistics.usersNames().size() > 0) {
            this.averageCommentsPerUser = (double) statistics.commentCount() / statistics.usersNames().size();
        } else {
            this.averageCommentsPerUser = 0;
        }

        if(statistics.postCount() > 0) {
            this.averageCommentsPerPost = (double) statistics.commentCount() / statistics.postCount();
        } else {
            this.averageCommentsPerPost = 0;
        }
    }

    public String showStatistics() {
        return ("Number of users is: " + numberOfUsers + "\n" +
                "Number of posts is: " + numberOfPosts + "\n" +
                "Number of comments is: " + numberOfComments + "\n" +
                "Average of posts for one user is: " + averagePostsPerUser + "\n" +
                "Average of comments for one user is: " + averageCommentsPerUser + "\n" +
                "Average of comments for one post is: " + averageCommentsPerPost);
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumStatistics that = (ForumStatistics) o;

        if (numberOfUsers != that.numberOfUsers) return false;
        if (numberOfPosts != that.numberOfPosts) return false;
        if (numberOfComments != that.numberOfComments) return false;
        if (Double.compare(that.averagePostsPerUser, averagePostsPerUser) != 0) return false;
        if (Double.compare(that.averageCommentsPerUser, averageCommentsPerUser) != 0) return false;
        if (Double.compare(that.averageCommentsPerPost, averageCommentsPerPost) != 0) return false;
        return Objects.equals(statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = statistics != null ? statistics.hashCode() : 0;
        result = 31 * result + numberOfUsers;
        result = 31 * result + numberOfPosts;
        result = 31 * result + numberOfComments;
        temp = Double.doubleToLongBits(averagePostsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageCommentsPerUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(averageCommentsPerPost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}