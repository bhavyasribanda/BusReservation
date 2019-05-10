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
  background-color: green;
  color: white;
  padding: 10px 12px;
  border: none;
  cursor: pointer;
  width: 20%;
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
	<jsp:useBean id="customerData" class="com.dto.Customer"
		scope="request" />
	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAILID</th>
			<th>MOBILENUMBER</th>
			</tr>
		<tr>
			<td><%=customerData.getCustId()%></td>
			<td><%=customerData.getCustName()%></td>
			<td><%=customerData.getEmail()%></td>
			<td><%=customerData.getMobileNo()%></td>
			</tr>
	</table>
 -->
 
 	<table border=2 align=center>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAILID</th>
			<th>MOBILENUMBER</th>
			</tr>
		<tr>
			<td>${customerData.custId}</td>
			<td>${customerData.custName}</td>
			<td>${customerData.email}</td>
			<td>${customerData.mobileNo}</td>
			</tr>
	</table>
	<br/>
	<br>
      <form action="SetBook" class="container" align="center">
    <button type="submit" class="btn">Proceed</button>&nbsp;
    <br/>
 
	</div>
</body>
</html>





