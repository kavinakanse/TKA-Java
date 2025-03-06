package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Car c = new Car();
		c.setCompName("Toyota");
		c.setModelName("Fortuner");
		c.setPrice(8000000);
		c.setSpeed(120);
		c.setColour("White");
		
		ss.persist(c);	//used to insert data
		System.out.println("Data is inserted....");
		
		tr.commit();
		ss.close();
		

	}

}
