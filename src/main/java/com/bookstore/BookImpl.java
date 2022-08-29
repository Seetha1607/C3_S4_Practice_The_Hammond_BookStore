/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Author author = new Author("Ann Cleeves", "Cleeves");
        Book book = new Book("The Rising Tide", 2456789, "It's a Crime Novel", 55.0, author);

    }
}
