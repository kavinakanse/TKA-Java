package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Employee;

import jakarta.persistence.criteria.Root;

public class GetAllRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		//get all data using Criteria Builder
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> cq = hcb.createQuery();
		Root<Employee> root = cq.from(Employee.class);
		
		cq.select(root);
		
		Query<Object> query = ss.createQuery(cq);
		List<Object> list = query.getResultList();
		
		for(Object employee : list) {
			System.out.println(employee);
		}
	}

}
