package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Book;

public class Main{
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		System.out.println("------config-------");
		
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.getCurrentSession();
		Transaction trans = sess.beginTransaction();
		Book b1  = new Book(12,"sai","sai",2000);
		sess.persist(b1);
		trans.commit();
		sess.close();
		sf.close();
	}
}