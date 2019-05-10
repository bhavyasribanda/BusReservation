package com.db;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dto.Bus;
public class HibernateTemplate {

	private static SessionFactory sessionFactory;
	
	static
	{
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.save(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public static List<Bus> getObjectListByQuery(String query)
	{
		return  sessionFactory.openSession().createQuery(query).list();
	}
	
	public static int updateObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.saveOrUpdate(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
	public static int deleteObject(Class c,Serializable serializable)
	{
		int result=0;
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			
			Object obj=session.get(c,serializable);
			
			session.delete(obj);
			
			tx.commit();
			
			result=1;
						
		} catch (Exception e) {
			
			e.printStackTrace();
			
			tx.rollback();
		}
		
		return result;
	}

	public static Object getObjectByBus(String source,String destination) {
		
		String queryString = "from Bus where source=:source and destination=:destination";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("destination", destination);
		  
		  query.setString("source", source);
		  Object queryResult = query.uniqueResult();
		  Bus bus = (Bus)queryResult;
		 // System.out.println(employee.getName()+" "+employee.getPassword()); 
		  return bus; 
		}

	public static List<Bus> getBusListByQuery(String source, String destination) {
		Session session=sessionFactory.openSession();
		 Query query = session.createQuery("from Bus where source = :source and destination = :destination");
		 query.setParameter("source",source);
		 query.setParameter("destination",destination);
		  List <Bus> bus = query.list();
		return bus;
	}
	public static int getIdByQuery(String mobile) {
		Session session=sessionFactory.openSession();
		 Query query = session.createQuery("custId from Customer where mobile = :mobile");
		 query.setParameter("mobile",mobile);
		 Object queryResult = query.uniqueResult();
		 int id = (int)queryResult;
		 return id;
	}
}
