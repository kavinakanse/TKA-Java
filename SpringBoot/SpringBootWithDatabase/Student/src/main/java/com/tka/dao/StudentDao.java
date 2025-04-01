package com.tka.dao;

import com.tka.entity.Student;

import jakarta.persistence.criteria.Root;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {


	@Autowired
	SessionFactory factory;

	

	public String insertData(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(s);
		tr.commit();
		ss.close();

		return "Data is inserted....";

	}

	public String deleteData(int studId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, studId);
		ss.remove(s);
		tr.commit();
		ss.close();

		return "Data is deleted....";

	}

	public String updateData(Student s, int studId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Student s1 = ss.get(Student.class, studId);
		s1.setName(s.getName());
		s1.setMarks(s.getMarks());
		s1.setCity(s.getCity());

		ss.merge(s1);
		tr.commit();
		ss.close();

		return "Data is updated....";

	}

	public Student getSingleRecord(int studId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, studId);
		tr.commit();
		ss.close();
		return s;

	}

	public List<Object> getAllRecord(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> jcq = hcb.createQuery();
		Root<Student> root = jcq.from(Student.class);

		jcq.select(root);

		Query<Object> query = ss.createQuery(jcq);
		List<Object> list = query.getResultList();
		tr.commit();
		ss.close();
		
		return list;

	}

}
