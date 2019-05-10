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


@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		System.out.println(user);
		String pass = request.getParameter("password");
		System.out.println(pass);
		
		
		 Customer customer = new Customer();
	     CustomerDAO customerDao = new CustomerDAO();
	     customer = customerDao.getCustomer(user);
		  
	
		out.print("<html>");	
	//	if(customer != null){
		HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
		    session.setAttribute("pass", pass);
			if(customer.getCustName().equalsIgnoreCase(user) && customer.getPassword().equalsIgnoreCase(pass)) {
			     request.setAttribute("customerData", customer);
				RequestDispatcher rd = request.getRequestDispatcher("SetBooking.jsp");
				rd.include(request, response);	
			}
			out.println("</html>");		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
