package com.serialization;

import com.fileIO.Book.Book;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDesirialization {
    public static void main(String[] args) {
        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream("/home/karan/Java_adv-Java/Day8/src/book.dat"))){
            Book b = (Book)read.readObject();
            System.out.println(b.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
