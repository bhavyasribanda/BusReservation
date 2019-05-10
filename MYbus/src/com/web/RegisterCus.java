package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDAO;
import com.dto.Customer;

/**
 * Servlet implementation class RegisterCus
 */
@WebServlet("/RegisterCus")
public class RegisterCus extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("custName");
		String password = request.getParameter("password");
		String emailId = request.getParameter("email");
		String mobile = request.getParameter("mobileNo");
		System.out.println(name+" "+emailId+" "+mobile);
		Customer customer = new Customer(name,password,emailId,mobile);		
		CustomerDAO customerDao = new CustomerDAO();
		HttpSession session = request.getSession(true);
		session.setAttribute("customer", customer);
	    
		int x = customerDao.registerCust(customer);
		request.setAttribute("customerData", customer);
		
		out.print("<html>");	
	/*if(x == 1){
		Customer customer1 = new Customer();		
		CustomerDAO customerDao1 = new CustomerDAO();
		customer1 = customerDao1.getCustomer(mobile);
		request.setAttribute("customerData", customer1);
		*/
		session.setAttribute("name", name);
	    
		RequestDispatcher rd = request.getRequestDispatcher("SetBooking.jsp");
		rd.include(request, response);
	    out.println("<h3><CENTER>Registration Success .."+x+" Rows  Inserted...</CENTER></H3>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
