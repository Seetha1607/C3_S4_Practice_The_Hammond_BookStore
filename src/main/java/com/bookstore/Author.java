/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class Author {
    private String authorName;
    private String authorPenName;

    public Author() {
    }

    public Author(String authorName, String authorPenName) {
        this.authorName = authorName;
        this.authorPenName = authorPenName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorPenName='" + authorPenName + '\'' +
                '}';
    }
}
