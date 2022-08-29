/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class Book {
    private String title;
    private int isbnNumber;
    private String description;
    private double price;

    public Book() {
    }

    public Book(String title, int isbnNumber, String description, double price) {
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.description = description;
        this.price = price;
    }
}
