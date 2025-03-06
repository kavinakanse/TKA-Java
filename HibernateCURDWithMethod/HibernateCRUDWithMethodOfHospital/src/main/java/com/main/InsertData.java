package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Hospital hp = new Hospital();
		hp.setName("ravi");
		hp.setAge(50);
		hp.setContact(91265439977l);
		hp.setWeight(80);
		hp.setAddress("pune");
		
		ss.persist(hp);	//used to insert data
		System.out.println("Data is inserted Successfully...");
		tr.commit();
		ss.close();

	}

}
