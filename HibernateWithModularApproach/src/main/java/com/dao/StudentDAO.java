package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Student;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.Root;

public class StudentDAO {

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student s = new Student();
		s.setName("om");
		s.setCourse("python");
		s.setMarks(70);
		s.setContact(9976543291l);
		s.setCity("pune");
		
		ss.persist(s);
		
		System.out.println("Data is inserted....");

		tr.commit();
		ss.clear();
	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int sId = 1;
		Student s = ss.get(Student.class, sId);
		
		s.setName("Gauri");
		s.setCourse("C++");
		s.setMarks(66);
		s.setCity("Mumbai");
		
//		ss.update(s);
		ss.merge(s);
		
		System.out.println("Data is updated....");
		
		tr.commit();
		ss.close();
		
	}

	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int sId = 2;
		Student s = ss.get(Student.class, sId);
		
//		ss.delete(s);
		ss.remove(s);
		
		System.out.println("Data is deleted...");
		
		tr.commit();
		ss.close();
	}

	public void getSingleRecord() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int sId = 3;
		Student s = ss.get(Student.class, sId);
		
		System.out.println(s);
		
		tr.commit();
		ss.close();
	}

	public void getAllRecord() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> cq = hcb.createQuery();
		Root<Student> root = cq.from(Student.class);
		
		cq.select(root);
		
		Query query = ss.createQuery(cq);
		List<Object> list = query.getResultList();
		
		for(Object student : list) {
			System.out.println(student);
		}
		
	}
	

}
