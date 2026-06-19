package com.Book.Day16_hibernate;

import com.dal.BookDAO;
import com.pojo.Book;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	int opt ;
    	Scanner sc = new Scanner(System.in);
       do {
    	   opt = sc.nextInt();
    	   switch (opt) {
		case 1:
			System.out.println("enter id name author and price");
			Book bk = new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			BookDAO.createBook(bk);
			System.out.println("Boook created successfully");
			break;
		case 2 :
			System.out.println("enter id name author and price");
			Book b = new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			BookDAO.editBook(b);
			break;
		case 3 :
			System.out.println("Enter Book ID to delete:");
		    int id = sc.nextInt();
		    BookDAO.deleteBook(id);
		    break;
		case 4 :
			System.out.println("Enter Book ID to search:");
		    int id1 = sc.nextInt();
		    BookDAO.getBookById(id1);
		case 5 : 
			System.out.println("Enter author name to search books:");
			BookDAO.getBookByAuthor(sc.next());
			break;
		case 6 :
			BookDAO.getAllBooks();
			break;
		case 7 : 
			System.out.println("Enter delete book by author:");
			BookDAO.deleteBooksByAuth(sc.next());
			break;
		default:
			break;
		}
    	   
       }while(opt != 8);
    }
}
