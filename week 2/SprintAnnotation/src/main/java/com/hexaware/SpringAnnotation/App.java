package com.hexaware.SpringAnnotation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.hexaware.SpringAnnotation.bean.Employee;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.hexaware.SpringAnnotation.*")
public class App 
{
    public static void main( String[] args )
    {    
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);    
        
        Employee emp = context.getBean(Employee.class);
        
        Employee emp1 = context.getBean("emp1",Employee.class);
        
        emp.setEid(101);
        emp.setName("Dave");
        
        System.out.println(emp);
        System.out.println(emp1);
        System.out.println(emp.getEid() + " " + emp.getName());
        
    }
}
