package com.tka.Employee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Employee.entity.Employee;

@Repository
public class EmployeeDao {

	
	@Autowired
	SessionFactory factory;

	
	public String insertData(Employee e) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(e);
		tr.commit();
		ss.close();
		return "Data is inserted...";
	}
	
}
