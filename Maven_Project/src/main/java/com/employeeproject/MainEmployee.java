package com.employeeproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmployee {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("Kavina");
		e.setAge(22);
		e.setMaritalStatus("Single");
		e.setRole("Developer");
		e.setSalary(50000);
		e.setExperience(0);
		
		ss.persist(e);
		
		System.out.println("Data Inserted....");
		
		tr.commit();
		ss.close();
		
		
	}

}
