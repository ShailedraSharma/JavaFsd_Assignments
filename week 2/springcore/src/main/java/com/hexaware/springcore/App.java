package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.entities.Employee;
import com.hexaware.springcore.services.IService;
import com.hexaware.springcore.services.ServiceImp;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Employee emp = context.getBean("emp",Employee.class);
//    	Address address = context.getBean(Address.class);
//    	address.setCity("Bhopal");
    	
    	emp.setId(101);
    	emp.setName("Jake");
//    	emp.setAdress(address);

    	System.out.println(emp);
    	System.out.println(emp.getAdress());
    	
    	IService service = context.getBean(ServiceImp.class);
    	service.getService();
    	
    	String str = context.getBean(String.class);
    	System.out.println(str);    	
    
    }
}
