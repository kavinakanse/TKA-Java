package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;

@Repository // marks class as DAO
public class EmployeeDao {

	@Autowired // used to inject another class or interface properties
	SessionFactory factory;

	public String insertData(Employee e) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "insert into Employee(name, role, city, salary) values(:name, :role, :city, :salary)";
		MutationQuery query = ss.createMutationQuery(hql);
		query.setParameter("name", e.getName());
		query.setParameter("role", e.getRole());
		query.setParameter("city", e.getCity());
		query.setParameter("salary", e.getSalary());
		query.executeUpdate();
		tr.commit();
		ss.close();

		return "Data is Inserted...";
	}

	public String deleteData(int empId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "delete from Employee where empId=:empId";
		MutationQuery mq = ss.createMutationQuery(hql);
		mq.setParameter("empId", empId);
		mq.executeUpdate();
		tr.commit();
		ss.close();

		return "Data is Deleted....";

	}

	public String updateData(Employee e, int empId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "update Employee set name=:name, role=:role, city=:city, salary=:salary where empId=:empId";
		MutationQuery mq = ss.createMutationQuery(hql);
		mq.setParameter("name", e.getName());
		mq.setParameter("role", e.getRole());
		mq.setParameter("salary", e.getSalary());
		mq.setParameter("city", e.getCity());
		mq.setParameter("empId", empId);

		mq.executeUpdate();
		tr.commit();
		ss.close();

		return "data is updated...";

	}

	public Employee getSingleRecord(int empId) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "from Employee where empId=:empId";
		Query<Employee> query = ss.createQuery(hql, Employee.class);
		query.setParameter("empId", empId);
		Employee e1 = query.getSingleResult();

		return e1;

	}
	
	public List<Employee> getAllRecord(Employee e) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hql = "from Employee";
		Query<Employee> query = ss.createQuery(hql,Employee.class);
		List<Employee> list = query.list();
		return list;
	}

}
