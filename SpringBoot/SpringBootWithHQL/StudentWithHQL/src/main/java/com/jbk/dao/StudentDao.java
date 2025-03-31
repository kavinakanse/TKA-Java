package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "insert into Student(name, marks, course) values(:name, :marks, :course)";
		MutationQuery mq = ss.createMutationQuery(hql);
		mq.setParameter("name", s.getName());
		mq.setParameter("marks", s.getMarks());
		mq.setParameter("course", s.getCourse());
		mq.executeUpdate();

		tr.commit();
		ss.close();

		return "Data is Inserted..";
	}

	public String deleteData(int studId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "delete from Student where studId=:studId";
		MutationQuery mq = ss.createMutationQuery(hql);
		mq.setParameter("studId", studId);
		mq.executeUpdate();

		tr.commit();
		ss.close();

		return "data is deleted...";

	}

	public String updateData(Student s, int studId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "update Student set name=:name, marks=:marks, course=:course where studId=:studId";
		MutationQuery mq = ss.createMutationQuery(hql);
		mq.setParameter("name", s.getName());
		mq.setParameter("marks", s.getMarks());
		mq.setParameter("course", s.getCourse());
		mq.setParameter("studId", studId);
		mq.executeUpdate();

		tr.commit();
		ss.close();
		return "data is updated..";
	}

	public Student getSingleRecord(int studId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "from Student where studId =: studId";
		Query<Student> query = ss.createQuery(hql, Student.class);
		query.setParameter("studId", studId);
		Student s = query.uniqueResult();

		return s;
	}

	public List<Student> getAllRecord(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "from Student";
		Query<Student> query = ss.createQuery(hql, Student.class);
		List<Student> list = query.list();

		return list;
	}

}
