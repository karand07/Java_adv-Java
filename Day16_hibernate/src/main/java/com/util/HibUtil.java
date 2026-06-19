package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	private static SessionFactory sf;
	public static SessionFactory getSf() {
		Configuration conf = new  Configuration().configure();
		System.out.println("-----configured--------");
		System.out.println("URL = " +
			    conf.getProperty("hibernate.connection.url"));
			System.out.println("Dialect = " +
			    conf.getProperty("hibernate.dialect"));
		sf = conf.buildSessionFactory();
		return sf ;
	}

}
