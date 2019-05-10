<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.ArrayList,com.dto.Bus"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
    <h1 align="center" >"HAVE A HAPPY AND SAFE JOURNEY"</h1>
	<!-- 
	<table style = "width:100%;
	border-collapse:collapse;
	background-color:gold;">
	border=2 align=center>
		<tr style = "background-color:yellowgreen;color:white;">
			<th>ID</th>
			<th>TYPE</th>
			<th>SOURCE</th>
			<th>DESTINATION</th>
			<th>ARRIVAL</th>
			<th>DEPARTURE</th>
			<th>TOTALSEATS</th>
			<th>PRICE</th>
			
		</tr>
		
		
		<% 
		ArrayList<Bus> arrayList= (ArrayList<Bus>)request.getAttribute("busesData");
		for(Bus bus : arrayList) { %>		 
		<tr>			
			<td><%=bus.getBusId()%></td>
			<td><%=bus.getBusType()%></td>
			<td><%=bus.getSource()%></td>
			<td><%=bus.getDestination()%></td>
			<td><%=bus.getDepart()%></td>
			<td><%=bus.getArrival()%></td>
			<td><%=bus.getSeats()%></td>
			<td><%=bus.getPrice()%></td>
			
			<% } %>
			</table>
			 -->
<jsp:include page="SelectSeat.jsp" />
	<table border=2 align=center  style = "width:100%;
	border-collapse:collapse;
	background-color:#e6e6fa;">
		<tr  style = "background-color:pink;color:white;">
			<th>ID</th>
			<th>TYPE</th>
			<th>SOURCE</th>
			<th>DESTINATION</th>
			<th>DEPART</th>
			<th>ARRIVAL</th>
			<th>TOTALSEATS</th>
			<th>PRICE</th>
			
		</tr>
		<c:forEach var="bus" items="${busesData}">
			<tr>
				<td>${bus.busId}</td>
				<td>${bus.busType}</td>
				<td>${bus.source}</td>
				<td>${bus.destination}</td>
				<td>${bus.arrival}</td>
				<td>${bus.depart}</td>
				<td>${bus.seats}</td>
				<td>${bus.price}</td>
			</tr>	
		</c:forEach>
	</table>
</body>
</html>





