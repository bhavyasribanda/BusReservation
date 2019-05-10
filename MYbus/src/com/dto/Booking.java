package com.dto;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



import java.util.Date;
@Entity
public class Booking {
	@Id@GeneratedValue
	private int bookingId;
	@Column(length=25)
	private int seatsBooked;
	@Column(length=25)
	private Date travelDate;
	@Column(length=25)
	private int totalPrice;
	@ManyToOne
	@JoinColumn(name="CUST_ID")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="BUS_ID")
	private Bus bus;
	
	
	@OneToMany(mappedBy="booking")	
	private List <Seating> seating=new ArrayList<Seating>();
	
	
	public Booking(int totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int booking_Id) {
		bookingId = booking_Id;
	}
	public int getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(int seats_booked) {
		seatsBooked = seats_booked;
	}
	public Date getTravel_Date() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	/*public int getCust_Id() {
		return Cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		Cust_Id = cust_Id;
	}*/
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/*public int getBus_Id() {
		return Bus_Id;
	}
	public void setBus_Id(int bus_Id) {
		Bus_Id = bus_Id;
	}*/
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Booking(int seats_booked, Date travel_Date, Customer customer, Bus bus,
			List<Seating> seating) {
		super();
	//	Booking_Id = booking_Id;
		seatsBooked = seats_booked;
		this.travelDate = travel_Date;
		//Cust_Id = cust_Id;
		this.customer = customer;
		this.bus = bus;
		this.seating = seating;
	}
	public Booking(int seats, Date date, Customer customer1, Bus bus2,int price) {
		// TODO Auto-generated constructor stub
		this.seatsBooked = seats;
		this.customer = customer1;
		this.bus = bus2;
		this.travelDate = date;
		this.totalPrice = price;
	}
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
}