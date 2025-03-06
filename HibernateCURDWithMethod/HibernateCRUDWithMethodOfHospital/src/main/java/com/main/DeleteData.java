package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int pId = 1;
		Hospital h1 = ss.get(Hospital.class, pId);
		
		ss.remove(h1);	//used remove record
		System.out.println("Data is deleted Successfully.....");
		
		tr.commit();
		ss.close();

	}

}
