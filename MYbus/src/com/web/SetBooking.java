package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BookingDAO;
import com.dao.BusDAO;
import com.dao.CustomerDAO;
import com.dto.Booking;
import com.dto.Bus;
import com.dto.Customer;
@WebServlet("/SetBooking")
public class SetBooking extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response, int seats,int busId, Date date, int name) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		session.getAttribute("busId");
	    session.getAttribute("seats");
	    session.getAttribute("name");
	    session.getAttribute("date");
        
	    Bus bus = new Bus();
        BusDAO busDao = new BusDAO();
        bus = busDao.getBus(busId);
        int price = seats * bus.getPrice();
        System.out.println(busId+" "+bus.getPrice()+" ");
        Customer customer = new Customer();
        CustomerDAO customerDao = new CustomerDAO();
        customer = customerDao.getCustomer(name);
        Booking booking = new Booking(seats,date,customer,bus,price);
        BookingDAO bookingDao = new BookingDAO();
        int x = bookingDao.register(booking);
        
		RequestDispatcher rd = request.getRequestDispatcher("Banking.html");
		rd.include(request, response);
	    out.println("<h3><CENTER>Registration Success .."+x+" Rows  Inserted...</CENTER></H3>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

