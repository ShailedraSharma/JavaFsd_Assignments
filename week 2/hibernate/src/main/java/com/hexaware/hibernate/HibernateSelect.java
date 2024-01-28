package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class HibernateSelect {

	public static void main(String[] args) {

    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    	Session session = sessionFactory.openSession();
    	
    	String selectQuery = "select e from Employee e where e.salary > ?1";
    	
    	Query<Employee> query = session.createQuery(selectQuery);
    	
    	query.setParameter(1, 2000.0);
    	
    	List<Employee> list = query.getResultList();
		
    	for(Employee emp: list) {
    		System.out.println(emp);
    	}
	}

}
