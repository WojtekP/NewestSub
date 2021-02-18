package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    private double quantityOfUsers;
    private double quantityOfPosts;
    private double quantityOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        averagePostsPerUser = quantityOfPosts / quantityOfUsers;
        averageCommentsPerUser = quantityOfComments / quantityOfUsers;
        averageCommentsPerPost = quantityOfComments / quantityOfPosts;

        if(averagePostsPerUser == Double.POSITIVE_INFINITY) {
            averagePostsPerUser = 0;
        }

        if(averageCommentsPerUser == Double.POSITIVE_INFINITY) {
            averageCommentsPerUser = 0;
        }

        if(averageCommentsPerPost == Double.POSITIVE_INFINITY) {
            averageCommentsPerPost = 0;
        }
    }

    void showStatistics() {
        System.out.println(" Ilosc uzytkownikow: " + quantityOfUsers);
        System.out.println(" Ilosc postow: " + quantityOfPosts);
        System.out.println(" Ilosc komentarzy: " + quantityOfComments);
        System.out.println(" srednia postow na uzytkownika: " + averagePostsPerUser);
        System.out.println(" srednia komentarzy na uzytkownika: " + averageCommentsPerUser);
        System.out.println(" srednia komentarzy na post: " + averageCommentsPerPost);
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}