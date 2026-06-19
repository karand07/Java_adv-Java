package com.oneToOne;

import org.hibernate.Session;

import com.util.HibUtil;

public class Test_oneToOne {

	public static void main(String[] args) {

		Session session = HibUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		// to store employee
		Employee emp1 = new Employee(102,"Anil", 90000);

		EmployeeDetails empDetails1 = new EmployeeDetails("Pune11", "Maha", "xyz@gmail.com");

		empDetails1.setEmp(emp1);

		session.save(emp1);
		
		session.save(empDetails1);

		System.out.println("---inserted------");

		session.getTransaction().commit();
		session.close();

	}}
