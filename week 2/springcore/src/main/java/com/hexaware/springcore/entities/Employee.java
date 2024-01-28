package com.hexaware.springcore.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {
	
	private int id;
	
	@Autowired
	private String name;
	
	@Autowired
	private Address adress;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, Address adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
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

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
}
