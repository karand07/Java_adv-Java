package com.oneToOne;

import jakarta.persistence.*;

@Entity
@Table(name="newEmp1")
public class Employee {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;//203
	@Column
	private String name;
	@Column
	private double salary;
	public Employee( int empid,String name, double salary) {
		super();
this.empid=empid;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}