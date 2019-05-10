package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;

import com.db.HibernateTemplate;
import com.dto.Booking;

public class BookingDAO {

	private SessionFactory factory = null;
	
/*	public List<B> getBus(String source,String destination) {

		return (List<Bus>)HibernateTemplate.getObjectByBus(source,destination);
	}*/

	public int register(Booking booking) {
		return HibernateTemplate.addObject(booking);
	}
/*
	public List<Bus> getAllBuses() {
		//System.out.println(source + " " + destination);1
		List<Bus> buses=(List)HibernateTemplate.getObjectListByQuery("from Bus");
		System.out.println("Inside All Buses ..."+buses);
		return buses;	
	}
	public List<Bus> getAllBus(String source,String destination) {
		System.out.println(source + " " + destination);
		List<Bus> buses= HibernateTemplate.getBusListByQuery(source, destination);
		System.out.println("Inside All Buses ..." + buses);
		return buses;	
	}
	public Bus getBus(int id) {
		return (Bus)HibernateTemplate.getObject(Bus.class,id);
	}*/
	public int delete(int busId) {
		// TODO Auto-generated method stub
		return HibernateTemplate.deleteObject(Booking.class, busId);
	}

	

}