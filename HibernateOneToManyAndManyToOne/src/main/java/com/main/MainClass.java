package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Country;
import com.entities.Employee;



public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Country.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Country c = new Country();
		c.setcId(2091);
		c.setCname("India");

		Employee e1 = new Employee();
		e1.seteId(101);
		e1.setEname("kavina");
		e1.setCity("Pune");
		e1.setC(c);
		
		Employee e2 = new Employee();
		e2.seteId(102);
		e2.setEname("sangram");
		e2.setCity("Mumbai");
		e2.setC(c);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		
		c.setEmp(list);
		
		ss.persist(c);
		ss.persist(e1);
		ss.persist(e2);
		
		System.out.println("data is inserted....");
		
		tr.commit();
		ss.close();
		
		
	}

}
