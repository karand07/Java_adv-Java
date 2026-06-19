package com.ComponentMaping;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
@Embeddable
public class Employee {
	@Id
	private int id ;
	@Column(length = 20)
	private String name ;
	@Embedded
	private Address address;
	public Employee(int id, String name,Address address) {
		this.id = id;
		this.name = name;
		this.address =address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
