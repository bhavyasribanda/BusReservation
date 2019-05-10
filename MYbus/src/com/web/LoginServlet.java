package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BusDAO;
import com.dao.BusDAOJ;
import com.dto.Bus;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Meghana");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String source = request.getParameter("source");
	    System.out.println(source);
		String destination = request.getParameter("destination");
    	System.out.println(destination);
		String date1 = request.getParameter("travel");
		Date date2 = null;
		
		try {
			date2 = new SimpleDateFormat("yyyy-mm-dd").parse(date1) ;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		java.sql.Date date = new java.sql.Date(date2.getTime());
		BusDAO busDao = new BusDAO();
		List<Bus> arrayList = busDao.getAllBus(source,destination);

		request.setAttribute("busesData", arrayList);
		
		out.print("<html>");		
			HttpSession session = request.getSession(true);
			session.setAttribute("source",source);
			session.setAttribute("destination", destination);
			session.setAttribute("date", date);
				RequestDispatcher rd = request.getRequestDispatcher("DisplayBus.jsp");
				rd.include(request, response);	
		out.println("</html>");		
}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
