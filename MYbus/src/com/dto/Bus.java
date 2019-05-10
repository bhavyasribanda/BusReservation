package com.dto;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bus {
	@Id@GeneratedValue
	private int busId = 6606;
	
	@Column(length=25)
	private String busType;
	
	@Column(length=25)
	private String source;
	
	@Column(length=25)
	private String destination;
	
	@Column(length=25)
	private String arrival;
	
	@Column(length=25)
	private String depart;
	
	@Column(length=25)
	private int seats;
	
    @Column(length=25)
	private int price;
	
	@OneToMany(mappedBy="bus")	
	private List <Booking> booking=new ArrayList<Booking>();
	
	
	public Bus(List<Booking> booking) {
		super();
		this.booking = booking;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int bus_Id) {
		busId = bus_Id;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String bus_Type) {
		busType = bus_Type;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Bus( String bus_Type, String source, String destination, String arrival, String depart, int seats,
			int price, List<Booking> booking) {
		super();
		//Bus_Id = bus_Id;
		busType = bus_Type;
		this.source = source;
		this.destination = destination;
		this.arrival = arrival;
		this.depart = depart;
		this.seats = seats;
		this.price = price;
		this.booking = booking;
	}
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public Bus( String bus_Type, String source, String destination, String arrival, String depart, int seats,
			int price) {
		super();
		//Bus_Id = bus_Id;
		busType = bus_Type;
		this.source = source;
		this.destination = destination;
		this.arrival = arrival;
		this.depart = depart;
		this.seats = seats;
		this.price = price;
	}
	
	
}