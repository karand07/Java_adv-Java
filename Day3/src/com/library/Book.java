package com.library;

public class Book {
    private String bookName;
    private String author;
    private int id ;
    private double price;

    public void newBook(String bookName, String author, int id, double price) {
        this.bookName = bookName;
        this.author = author;
        this.id=id;
        this.price=price;
    }
    public void getBookDetails() {
        System.out.println(bookName);
        System.out.println(author);
        System.out.println(id);
        System.out.println(price);
    }
}
