package com.tka.dao;

import com.tka.StudentApplication;
import com.tka.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	private final StudentApplication studentApplication;

	@Autowired
	SessionFactory factory;

	StudentDao(StudentApplication studentApplication) {
		this.studentApplication = studentApplication;
	}

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
}
