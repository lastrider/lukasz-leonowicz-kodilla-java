package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsPerUsersRatio;
    private double commentsPerUsersRatio;
    private double commentsPerPostsRatio;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUsersRatio() {
        return postsPerUsersRatio;
    }

    public double getCommentsPerUsersRatio() {
        return commentsPerUsersRatio;
    }

    public double getCommentsPerPostsRatio() {
        return commentsPerPostsRatio;
    }

    void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers <= 0) {
            postsPerUsersRatio = 0.0;
            commentsPerUsersRatio = 0.0;
        } else {
            postsPerUsersRatio = (double) numberOfPosts / numberOfUsers;
            commentsPerUsersRatio = (double) numberOfComments / numberOfUsers;
        }
        if (numberOfPosts <= 0) {
            commentsPerPostsRatio = 0.0;
        } else {
            commentsPerPostsRatio = (double) numberOfComments / numberOfPosts;
        }
    }

    public String showStatistics() {
        return "ForumStatistic{" +
                ", numberOfUsers=" + numberOfUsers +
                ", numberOfPosts=" + numberOfPosts +
                ", numberOfComments=" + numberOfComments +
                ", postsPerUserRatio=" + postsPerUsersRatio +
                ", commentPerUserRatio=" + commentsPerUsersRatio +
                ", commentsPerPostRatio=" + commentsPerPostsRatio +
                '}';
    }
}
