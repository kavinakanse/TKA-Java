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

	public String deleteData(int empId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Employee e = ss.get(Employee.class, empId);

		ss.remove(e);
		tr.commit();
		ss.close();

		return "Data is deleted...";
	}

	public String updateData(Employee e, int empId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Employee e1 = ss.get(Employee.class, empId);
		e1.setName(e.getName());
		e1.setRole(e.getRole());
		e1.setCity(e.getCity());
		e1.setSalary(e.getSalary());

		ss.merge(e1);
		tr.commit();
		ss.close();

		return "Data is updated....";
	}

}
