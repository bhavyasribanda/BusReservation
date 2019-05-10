	package com.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Seating {
	@Id@GeneratedValue
	private int no;
	@Column(length=25)
	private int totalSeats;
	
	@ManyToOne
	@JoinColumn(name="Booking_Id")
	private Booking booking;
	
	
	public Seating() {
		super();	
	}


	public Seating(int totalSeats) {
		super();
		this.totalSeats = totalSeats;
		//bookingId = booking_Id;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

/*
	public Booking getBookingId() {
		return bookingId;
	}


	public void setBooking_Id(Booking booking_Id) {
		bookingId = booking_Id;
	}*/
	
}
