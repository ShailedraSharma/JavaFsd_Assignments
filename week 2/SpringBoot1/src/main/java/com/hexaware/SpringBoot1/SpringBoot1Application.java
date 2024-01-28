package com.hexaware.SpringBoot1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.SpringBoot1.service.EmployeeServiceImp;
import com.hexaware.SpringBoot1.service.IEmployeeService;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
		System.out.println(context);
	
		IEmployeeService service = context.getBean(EmployeeServiceImp.class);
		service.employeeService();	
	}
}
