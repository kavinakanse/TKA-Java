package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Bike;
import com.entities.User;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(User.class);
		cfg.addAnnotatedClass(Bike.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Bike b1 = new Bike();
		b1.setbId(1003);
		b1.setbName("R15");
		ss.persist(b1);
		
		User u = new User();
		u.setuName("Sahil");
		u.setCity("Mumbai");
		u.setB(b1);
		ss.persist(u);
		
		System.out.println("Data inserted Successfully");
		
		tr.commit();
		ss.close();
		
		
		

	}

}
