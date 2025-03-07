package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;



public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int empId = 2;
		Employee e = ss.get(Employee.class, empId);
		
//		e.setName("Ram");
//		e.setMaritalStatus("Married");
//		e.setExperience(5);
//		e.setRole("HR");
		e.setSalary(80000);
		
//		ss.update(e);	//update record
		ss.merge(e);	//update record
		
		System.out.println("Data is updated Successfully....");
		
		tr.commit();
		ss.close();
	}
}
