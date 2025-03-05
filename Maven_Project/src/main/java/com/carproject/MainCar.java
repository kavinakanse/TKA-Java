package com.carproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainCar {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Car c = new Car();
		c.setcId(101);
		c.setCompName("Mahindra");
		c.setModelName("Thar");
		c.setSpeed(100);
		c.setColour("black");
		c.setPrice(1000000);
		
		ss.persist(c);
		
		System.out.println("data is inserted successfully....");
		tr.commit();
		ss.close();
	}

}
