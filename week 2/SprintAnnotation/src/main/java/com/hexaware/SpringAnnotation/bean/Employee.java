package com.hexaware.SpringAnnotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp1")
@Scope("prototype")
public class Employee {
	
	private int eid;
	private String name;
	
	public Employee() {
		
	}
	
	public Employee(int eid, String name) {
		
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
