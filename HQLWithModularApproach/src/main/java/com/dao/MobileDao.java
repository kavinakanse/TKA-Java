package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Mobile;


public class MobileDao {

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into mobileInfo(compName, modelName, cost, colour) values(:compName, :modelName, :cost, :colour)";
		MutationQuery mq = ss.createNativeMutationQuery(hqlQuery);
		mq.setParameter("compName", "Apple");
		mq.setParameter("modelName", "IPhone 15 Pro");
		mq.setParameter("cost", 130000);
		mq.setParameter("colour", "silver");
		mq.executeUpdate();
		System.out.println("Data is inserted Successfull..!");
		
		tr.commit();
		ss.close();
	}

	public void updateData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "update Mobile set modelName=:name, price=:price, colour=:colour where mId=:mId";
//		Query query = ss.createQuery(hqlQuery);	//deprecated method
		MutationQuery mq = ss.createMutationQuery(hqlQuery);	//currently used
		mq.setParameter("name", "Iphone 16 plus");
		mq.setParameter("colour", "pink");
		mq.setParameter("price", 80000);
		mq.setParameter("mId", 1);
		mq.executeUpdate();
		
		System.out.println("Data is updated successfully...!");
		
		tr.commit();
		ss.close();
	}

	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete from Mobile where mId =:mId";
		MutationQuery mq = ss.createMutationQuery(hqlQuery);
		mq.setParameter("mId", 1);
		mq.executeUpdate();
		
		System.out.println("Data is deleted Successfully...!");
		
		tr.commit();
		ss.close();
	}

	public void getSingleData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Mobile where mId=:mId";
		Query<Mobile> query = ss.createQuery(hqlQuery);
		query.setParameter("mId", 3);
		
//		query.getSingleResult();	
		Mobile m = query.uniqueResult();
		System.out.println(m);
		
	}

	public void getAllData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Mobile";
		Query<Mobile> query = ss.createQuery(hqlQuery, Mobile.class);
		List<Mobile> list = query.list();
		for(Mobile m : list) {
			System.out.println(m);
		}
		
		
	}
	
	
}
