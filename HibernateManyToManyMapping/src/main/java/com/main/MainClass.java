package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Courses;
import com.entities.Students;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		cfg.addAnnotatedClass(Courses.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Courses c = new Courses();
		c.setcId(10011);
		c.setcName("JAVA");
		
		Courses c1 = new Courses();
		c1.setcId(10023);
		c1.setcName("Python");
		
		Courses c2 = new Courses();
		c2.setcId(10024);
		c2.setcName("C++");
		
		
		Students s1 = new Students();
		s1.setStudId(101);
		s1.setSname("Kavina");
		s1.setCity("Pune");
		
		Students s2 = new Students();
		s2.setStudId(102);
		s2.setSname("Shital");
		s2.setCity("Mumbai");
		
		Students s3 = new Students();
		s3.setStudId(103);
		s3.setSname("Ram");
		s3.setCity("Goa");
		
		ArrayList<Courses> list1 = new ArrayList<Courses>();
		list1.add(c);
		list1.add(c1);
		list1.add(c2);
		
		ArrayList<Students> list2 = new ArrayList<Students>();
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		
		c.setS(list2);
		s3.setCrs(list1);
		
		ss.persist(c);
		ss.persist(c1);
		ss.persist(c2);
		ss.persist(s1);
		ss.persist(s2);
		ss.persist(s3);
		
		System.out.println("Data is inserted.....");
		
		tr.commit();
		ss.close();
			
		
	}

}
