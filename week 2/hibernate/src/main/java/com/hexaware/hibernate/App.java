package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	System.out.println(sessionFactory);
    	
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	
    	Transaction txn = session.beginTransaction();
//    	
//    	Employee emp = new Employee(101,"matt",2000);
//    	
//    	Serializable ser = session.save(emp);
//    	
//    	System.out.println(ser.toString());
    	
//    	Employee emp1 = session.get(Employee.class, 101);
//    	System.out.println(emp1);
//    	
//    	emp1.setEname("smith");
//    	emp1.setSalary(4000);
//    	
//    	Serializable ser = session.save(emp1);
//    	System.out.println("updated record" + ser.toString());
//    	
//    	Employee updatedEmp = session.get(Employee.class, 101);
//    	System.out.println(updatedEmp);
//    	
//    	session.delete(updatedEmp);
    	
//    	Employee emp2 = new Employee(102, "blake", 3000);
//    	Employee emp3 = new Employee(103, "lisa", 20000);
//    	
//    	session.save(emp2);
//    	session.save(emp3);
    	
    	Employee e = new Employee(103, "adam", 35000);
    	session.saveOrUpdate(e);
    	
    	
    	txn.commit();
    	
    }
}
