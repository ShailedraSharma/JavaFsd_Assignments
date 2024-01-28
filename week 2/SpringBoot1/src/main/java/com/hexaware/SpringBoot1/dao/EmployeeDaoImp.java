package com.hexaware.SpringBoot1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImp implements IEmployeeDao{

	@Override
	public void employeService() {
		System.out.println("This is spring boot");
	}
	

}
