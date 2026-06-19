package com.oneToOne;

import jakarta.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="empdetails")
public class EmployeeDetails {
	
	@Id
	@GenericGenerator(name="gen",strategy="foreign",
	parameters=@Parameter(name="property",value="emp"))
	private int empid;
	@Column
	private String city;
	@Column	
	private String state;
	@Column
	private String email;
	
	//one to one
	@OneToOne
	@PrimaryKeyJoinColumn(name = "empid")
	
	
	 private Employee emp;
	 
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public EmployeeDetails(String city, String state, String email) {
		super();
		this.city = city;
		this.state = state;
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [city=" + city + ", state=" + state + ", email=" + email + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}