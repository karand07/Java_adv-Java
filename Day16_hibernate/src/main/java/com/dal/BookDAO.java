package com.dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.pojo.Book;
import com.util.HibUtil;

public class BookDAO {
	private static SessionFactory sf ;
	static {
		sf = HibUtil.getSf();
	}
	
	
	public static void getAllBooks(){
		Session session = sf.openSession();
		session.beginTransaction();
		String hq = "from Book b";
		Query query = session.createQuery(hq);
		List <Book> list = query.getResultList();
		if(list !=null) {
			for(Book i : list) {
				System.out.println(i.toString());
			}
		}else {
			System.out.println("books not found");
		}
		session.getTransaction().commit();
	    session.close();
	}
	public static void createBook(Book newBook) {
		Session session = sf.openSession();   
        session.beginTransaction();

        session.persist(newBook);

        session.getTransaction().commit();
        session.close();
	}
	public static  void editBook(Book newBook) {
		Session session = sf.openSession();

	     session.beginTransaction();

	    session.merge(newBook);
	    session.getTransaction().commit();
	    session.close();
	}
	public static void deleteBook(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
		Book book = session.get(Book.class, id);

	    if (book != null) {
	        session.remove(book);
	        System.out.println("Book deleted successfully.");
	    } else {
	        System.out.println("Book not found.");
	    }
	    session.getTransaction().commit();
	    session.close();
	}
	public static  void  getBookById(int id){
		Session session = sf.openSession();
		session.beginTransaction();
		Book book = session.get(Book.class, id);
		if(book !=null) {
			System.out.println(book.toString());
		}else {
			System.out.println("no Book Found");
		}
		session.getTransaction().commit();
	    session.close();
	}
	public static void getBookByAuthor(String auth){
		Session session  = sf.openSession();
		session.beginTransaction();
		
		String hq = "from Book b where b.author=?1";
		Query query = session.createQuery(hq);
		query.setParameter(1, auth);
		List <Book> list = query.getResultList();
		if(list !=null) {
			for(Book i : list) {
				System.out.println(i.toString());
			}
		}else {
			System.out.println("books not found");
		}
		session.getTransaction().commit();
	    session.close();
	}
	public static void deleteBooksByAuth(String auth) {
		Session session = sf.openSession();
		session.beginTransaction();
		
		String hql = "DELETE FROM Book b WHERE b.author = :author";
		Query q= session.createQuery(hql);
		q.setParameter("author", auth);
		int row = q.executeUpdate();
		System.out.println(row + " book(s) deleted successfully.");
		session.getTransaction().commit();
	    session.close();	
	}
}
