/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {

        // Creating an object of the Author class.
        Author author = new Author();
        author.setAuthorName("Ann cleeves");
        author.setAuthorPenName("Cleeves");

        // Creating an object of the Book class.
        Book book = new Book();
        book.setTitle("The Rising Tide");
        book.setIsbnNumber(34678356);
        book.setDescription("It's a Crime Novel");
        book.setPrice(55.0);
        book.setAuthor(author);

        // Calling the method displayBookDetails() from the Book class.
        book.displayBookDetails();
    }
}
