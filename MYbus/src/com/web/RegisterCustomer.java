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
@WebServlet("/RegisterCustomer")
public class RegisterCustomer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response, int seats, int busId, Date date) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("custName");
		String password = request.getParameter("password");
		String emailId = request.getParameter("email");
		String mobile = request.getParameter("mobileNo");
		System.out.println(name+" "+emailId+" "+mobile);
		Customer customer = new Customer(name,password,emailId,mobile);		
		CustomerDAO customerDao = new CustomerDAO();
		int x = customerDao.registerCust(customer);
		HttpSession session = request.getSession(true);
		session.setAttribute("name", name);
	
		RequestDispatcher rd = request.getRequestDispatcher("SetBooking");
		rd.include(request, response);
	    out.println("<h3><CENTER>Registration Success .."+x+" Rows  Inserted...</CENTER></H3>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

