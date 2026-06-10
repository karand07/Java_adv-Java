package com.serialization;

import com.fileIO.Book.Book;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerial {
    public static void main(String[] args) {
        try (ObjectOutputStream writer = new ObjectOutputStream( new FileOutputStream("/home/karan/Java_adv-Java/Day8/src/book.dat"))){
            Book b = new Book(1,"ghost","sai");
            writer.writeObject(b);
            System.out.println("book stored");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
