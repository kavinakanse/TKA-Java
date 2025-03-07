package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int pId = 2;
		Hospital hp = ss.get(Hospital.class, pId);
		hp.setName("Vicky");
		hp.setAddress("Goa");
		hp.setContact(98767897543l);
		hp.setWeight(90);
		hp.setAge(60);
		
		ss.merge(hp);
		
		tr.commit();
		ss.close();

	}

}
