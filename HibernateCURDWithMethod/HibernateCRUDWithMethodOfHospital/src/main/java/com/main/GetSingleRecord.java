package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class GetSingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int pId = 2;
		Hospital h1 = ss.get(Hospital.class, pId);	//fetches single record
		
		System.out.println(h1);
		
		tr.commit();
		ss.close();

	}

}
