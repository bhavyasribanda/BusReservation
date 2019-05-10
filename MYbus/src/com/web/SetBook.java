package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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

/**
 * Servlet implementation class SetBook
 */
@WebServlet("/SetBook")
public class SetBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		int id = (int) session.getAttribute("busId");
	     int seat = (int) session.getAttribute("seats");
	   String name1 = (String) session.getAttribute("name");
	    Date date1 = (Date) session.getAttribute("date");
	    
        
	    Bus bus = new Bus();
        BusDAO busDao = new BusDAO();
        bus = busDao.getBus(id);
        int price = seat * bus.getPrice();
       // System.out.println(busId+" "+bus.getPrice()+" ");
        Customer customer = new Customer();
        CustomerDAO customerDao = new CustomerDAO();
        customer = (Customer) session.getAttribute("customer");
        Booking booking = new Booking(seat,date1,customer,bus,price);
        BookingDAO bookingDao = new BookingDAO();
        int x = bookingDao.register(booking);
        
		RequestDispatcher rd = request.getRequestDispatcher("Banking.html");
		rd.include(request, response);
	    out.println("<h3><CENTER>Registration Success .."+x+" Rows  Inserted...</CENTER></H3>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
