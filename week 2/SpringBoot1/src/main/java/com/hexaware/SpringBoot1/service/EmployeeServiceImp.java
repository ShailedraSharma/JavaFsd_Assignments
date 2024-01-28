package com.hexaware.SpringBoot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.SpringBoot1.dao.IEmployeeDao;

@Service
public class EmployeeServiceImp implements IEmployeeService{

	@Autowired
	IEmployeeDao dao;

	@Override
	public void employeeService() {
		dao.employeService();
	}
}
