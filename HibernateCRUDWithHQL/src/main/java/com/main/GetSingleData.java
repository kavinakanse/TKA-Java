package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Product;

public class GetSingleData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Product where pId=:pId";
		int pId = 2;
		Query<Product> query = ss.createQuery(hqlQuery);
		query.setParameter("pId", pId);
		
//		Product p1 = query.getSingleResult();
		Product p1 = query.uniqueResult();
		
		System.out.println(p1);
		

	}

}
