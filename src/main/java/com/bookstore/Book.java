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
    Author author;

    public Book() {
    }

    public Book(String title, int isbnNumber, String description, double price, Author author) {
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.description = description;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Title of the Book : " + title);
        System.out.println("ISBN Number : " + isbnNumber);
        System.out.println("Description : " + description);
        System.out.println("Price of the Book : $" + price);
        System.out.println("Author of the Book : " + author);
    }
}
