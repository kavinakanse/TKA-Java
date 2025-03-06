package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;


public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e = new Employee();
		e.setName("Gauri");
		e.setAge(30);
		e.setExperience(1);
		e.setMaritalStatus("married");
		e.setRole("tester");
		e.setSalary(50000);
		
		//used to insert data
		ss.persist(e);
		
		System.out.println("Data is inserted....");
		
		tr.commit();
		ss.close();

	}

}
