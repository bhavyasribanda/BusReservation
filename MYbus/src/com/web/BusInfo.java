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

@WebServlet("/BusInfo")
public class BusInfo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				BusDAO busDao = new BusDAO();
		List<Bus> arrayList = busDao.getAllBuses();

		request.setAttribute("busesData", arrayList);
		
		out.print("<html>");		
			HttpSession session = request.getSession(true);
			
			//session.setAttribute("destination", destination);
			//session.setAttribute("date", date);
			//if(bus.getSource().equalsIgnoreCase(source) && bus.getDestination().equalsIgnoreCase(destination) ) {
				RequestDispatcher rd = request.getRequestDispatcher("BusInfo.jsp");
				rd.include(request, response);	
			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
/*else
			
				RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
				rd.forward(request, response);
			}
			
		//}
		else
		{
			out.print("<body>");
			out.print("<center><h1>Invalid Credentials..</h1></center>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			out.print("</body>");			
		}*/
		out.println("</html>");		
}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
