package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{
		Configuration config=new Configuration().configure();
		//hibernate.cfg.xml will get loaded
		System.out.println("----config file get loaded----");
		
		// 
		
		  sf=config.buildSessionFactory();
		System.out.println("----sf created----");
		
		return sf;
	
	}

}