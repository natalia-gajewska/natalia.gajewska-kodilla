package com.kodilla.testing.forum.statistics;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyStatistics {

    private int numberOfUsers; //atrybuty z zadania
    private int numberOfPost;
    private int numberOfComment;
    private double averageNumberOfPostPerUser; // double bo średnia
    private double averageNumberOfCommentPerUser;
    private double averageNumberOfCommentPerPost;

    public void calculateAdvStatistics(Statistics statistics) { //metoda obliczająca średnią statysykę w nawasie interfejs jako obiekt)
        this.numberOfUsers = statistics.usersNames().size();  // sprawdzenie rozmiaru
        this.numberOfPost = statistics.postsCount(); //sprawdzenie ile jest postów
        this.numberOfComment = statistics.commentsCount(); //ile komentarzy

        if (numberOfUsers > 0) {
            this.averageNumberOfPostPerUser = (double) numberOfPost / numberOfUsers;
        }

        if (numberOfUsers > 0) {
            this.averageNumberOfCommentPerUser = (double) numberOfComment / numberOfUsers;
        }

        if (numberOfComment>0 && numberOfPost>0) {
            this.averageNumberOfCommentPerPost = (double) numberOfComment / numberOfPost;
        }
    }

   public int getNumberOfUsers() { //gettery
        return this.numberOfUsers;
    }

    public int getNumberOfPost() {
        return this.numberOfPost;
    }

    public int getNumberOfComment() {
        return this.numberOfComment;
    }

    public double getAverageNumberOfPostPerUser() {
        return this.averageNumberOfPostPerUser;
    }

    public double getAverageNumberOfCommentPerPost() {
        return this.averageNumberOfCommentPerPost;
    }

    public double getAverageNumberOfCommentPerUser() {
        return this.averageNumberOfCommentPerUser;
    }
}


