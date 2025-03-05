package com.hospitalproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainHospital {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Hospital hp = new Hospital();
		hp.setpId(1);
		hp.setName("Ram");
		hp.setAge(60);
		hp.setContact(9876543215l);
		hp.setWeight(75);
		hp.setAddress("Pune");
		
		ss.persist(hp);
		tr.commit();
		ss.close();

	}

}
