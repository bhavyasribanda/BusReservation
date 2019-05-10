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
@Entity
public class Customer {
	@Id@GeneratedValue
	private int custId;
	
	@Column(length=25)
	private String custName;
	 
	@Column(length=25)
	private String password;
	
	@Column(length=25)
	private String email;
	
	@Column(length=25)
	private String mobileNo;
	@Column(length=25)
	
	@OneToMany(mappedBy="customer")	
	private List <Booking> bookings=new ArrayList<Booking>();
	
	public void setBooking(List<Booking> booking) {
		bookings = booking;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int cust_Id) {
		custId = cust_Id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String cust_Name) {
		custName = cust_Name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(String password) {
		super();
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobile_No) {
		mobileNo = mobile_No;
	}
	public Customer( String cust_Name, String password,String email, String mobile_No) {
		super();
		//Cust_Id = cust_Id;
		custName = cust_Name;
		this.password = password;
		this.email = email;
		mobileNo = mobile_No;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
}