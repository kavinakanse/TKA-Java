package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int cId = 3;
		Car c = ss.get(Car.class, cId);
		
		c.setColour("Black");
		c.setPrice(1000000);
		
		ss.merge(c);
		
		System.out.println("Data is updated....");
		
		tr.commit();
		ss.close();

	}

}
