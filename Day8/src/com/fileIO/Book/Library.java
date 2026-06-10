package com.fileIO.Book;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

 public static void writeBookIntoFile(String filename,ArrayList<Book> books){
     try {
         PrintWriter pw = new PrintWriter(filename);
         for(Book book:books){
             pw.println(book);
         }
         pw.close();
         System.out.println("Books written successfully");
     }catch (Exception e){
         e.printStackTrace();
     }
 }
}
