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
<style>
.bg-img {
  /* The image used */
  background-image: url("https://wallpapers.ae/wp-content/uploads/2015/10/Light-Color-Curves-Wallpaper.jpg");
  
  margin-top:25px;
  margin-left:-10px;
  margin-right:10px;
  height:100%;
  min-height:480px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}
.btn {
  background-color: gold;
  color: white;
  padding: 10px 12px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.8;
}

.container2 {
  position: absolute;
  right: 0;
 
  max-width: 300px;
  padding: 5px;
  background-color:transparent;
}
</style>
<body>
<div class="bg-img">

	<!-- 
	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>TYPE</th>
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
			<td><%=bus.getDepart()%></td>
			<td><%=bus.getArrival()%></td>
			<td><%=bus.getSeats()%></td>
			<td><%=bus.getPrice()%></td>
			
			<% } %>
			</table>
			 -->
<jsp:include page="SelectSeat.jsp" />
	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>TYPE</th>
			<th>DEPART</th>
			<th>ARRIVAL</th>
			<th>TOTALSEATS</th>
			<th>PRICE</th>
			
		</tr>
		<c:forEach var="bus" items="${busesData}">
			<tr>
				<td>${bus.busId}</td>
				<td>${bus.busType}</td>
				<td>${bus.arrival}</td>
				<td>${bus.depart}</td>
				<td>${bus.seats}</td>
				<td>${bus.price}</td>
				<td><a href='Seats.jsp?busId=${bus.busId}' type="button">VIEW SEATS</a></td>
			  <!-- <form action='Seats.jsp' class="container2" method="post">
    <input type="submit" class="btn" value="VIEW SEATS" /></form></td>-->
   </tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>





