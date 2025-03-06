package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int cId = 1;
		Car c = ss.get(Car.class, cId);
		
		ss.remove(c);	//used to delete data 
		System.out.println("Data is deleted Successfully....");
		
		tr.commit();
		ss.close();

	}

}
