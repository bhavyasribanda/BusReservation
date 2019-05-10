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


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		System.out.println(user);
		String pass = request.getParameter("password");
		System.out.println(pass);
		
		if(user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin123")) {
			RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
			rd.include(request, response);	
		}
				out.println("</html>");	
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
