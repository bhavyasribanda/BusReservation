package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BusDAO;
import com.dto.Bus;

@WebServlet("/DeleteBus")
public class DeleteBus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int busId = Integer.parseInt(request.getParameter("busId"));
		BusDAO busDAO = new BusDAO();
	    int x = busDAO.delete(busId);
	    if(x == 1) {
	    	RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
			rd.include(request, response);
		    out.println("<h3><CENTER>Deletion Success .."+x+" Rows " + " deleted...</CENTER></H3>");
	    }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
