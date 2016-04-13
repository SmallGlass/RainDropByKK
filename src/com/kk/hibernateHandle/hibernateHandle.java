package com.kk.hibernateHandle;

import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class hibernateHandle {
	@Resource
	public SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.openSession();
	}
	public void add(Object o){
		Session session=getSession();
		session.setFlushMode(FlushMode.AUTO);
		Transaction trans = session.beginTransaction();
		trans.begin();
		session.save(o);
		trans.commit();
		session.close();
	}
	public void update(Object o){
		Session session=getSession();
		session.setFlushMode(FlushMode.AUTO);
		Transaction trans = session.beginTransaction();
		trans.begin();
		session.saveOrUpdate(o);
		trans.commit();
		session.close();
	}
	public void delete(Object o){
		Session session=getSession();
		session.setFlushMode(FlushMode.AUTO);
		Transaction trans = session.beginTransaction();
		trans.begin();
		session.delete(o);
		trans.commit();
		session.close();
	}
}
