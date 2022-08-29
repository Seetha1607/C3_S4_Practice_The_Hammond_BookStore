/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        // Creating an object of the Author class.
        Author author = new Author("Ann Cleeves", "Cleeves");
        // Creating an object of the Book class.
        Book book = new Book("The Rising Tide", 2456789, "It's a Crime Novel", 55.0, author);
        // Calling the method displayBookDetails() from the Book class.
        book.displayBookDetails();
    }
}
