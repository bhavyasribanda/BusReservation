package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;

import com.db.HibernateTemplate;
import com.dto.Bus;
import com.dto.Customer;

public class CustomerDAO {

	private SessionFactory factory = null;
	
	
	public int registerCust(Customer customer) {
		return HibernateTemplate.addObject(customer);
	}
        

		public int getId(String mobile) {
	//	System.out.println(source + " " + destination);
		int id= HibernateTemplate.getIdByQuery(mobile);
		//System.out.println("Inside All Buses ..." + buses);
		return id;	
	}

	/*public List<Bus> getAllBuses() {
		//System.out.println(source + " " + destination);1
		List<Bus> buses=(List)HibernateTemplate.getObjectListByQuery("from Bus");
		System.out.println("Inside All Buses ..."+buses);
		return buses;	
	}
	public List<Bus> getAllBus(String source,String destination) {
		System.out.println(source + " " + destination);
		List<Bus> buses= HibernateTemplate.getBusListByQuery("From Bus where destination=:destination and source=:source",source,destination);
		System.out.println("Inside All Buses ..." + buses);
		return buses;	
	}*/
	public Customer getCustomer(String name) {
		return (Customer)HibernateTemplate.getObject(Customer.class,name);
	}
	public Customer getCustomer(int id ) {
		return (Customer)HibernateTemplate.getObject(Customer.class,id);
	}
}
	
