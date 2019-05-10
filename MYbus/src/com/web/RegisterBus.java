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

import com.dao.BusDAO;
import com.dao.BusDAOJ;
import com.dto.Bus;

@WebServlet("/RegisterBus")
public class RegisterBus extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String type = request.getParameter("busType");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String depart = request.getParameter("depart");	
		String arrival = request.getParameter("arrival");
		int seats = Integer.parseInt(request.getParameter("seats"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		Bus bus = new Bus(type,source,destination,depart,arrival,seats,price);		
		BusDAO busDao = new BusDAO();
		int x = busDao.register(bus);
		RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
		rd.include(request, response);
	    out.println("<h3><CENTER>Registration Success .."+x+" Rows  Inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

