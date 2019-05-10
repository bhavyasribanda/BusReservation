<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.fa {
  font-size: 25px;
  cursor: pointer;
  user-select: none;
}

.fa:hover {
  color: skyblue;
}
body, html {
  height: 80%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("https://wallpapers.ae/wp-content/uploads/2015/10/Light-Color-Curves-Wallpaper.jpg");
   margin-top:25px;
  margin-left:-10px;
  margin-right:-10px;
  min-height:800px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}
.container {
  position: absolute;
  right:0;
  margin: 100px;
  max-width: 500px;
  padding: 5px;
  background-color:light;
}
</style>
</head>
<body>
<div class="bg-img">
<h1 class="bg-info" align = "center" class="text-warning"><b>BOOK MY BUS</b></h1>
 <form action="Customer.jsp" class="container">
<i onclick="myFunction(this)" onclick="incNumber()" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<br/>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<br/>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<br/>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<br/>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o">&nbsp;</i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<br/>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o">&nbsp;</i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<i onclick="myFunction(this)" class="fa fa-square-o"></i>
<br/><br/>
<i style="font-size:20px" class="fa fa-square" style="font-size:48px;"> - Seats Booked</i><br/><br/>
<i style="font-size:20px" class="fa fa-square-o" style="font-size:48px;"> - Seats Available</i><br/><br/>
  <label for="seat"><font color="gold"><b>TotalSeats</b></font></label>
    <input type="text" placeholder="" name="seat" required><br/>
  <%		//HttpSession session1 = request.getSession(true);
	int busId = Integer.parseInt(request.getParameter("busId"));
		
			session.setAttribute("busId",busId);
	
  %>
  <button type="submit" class="btn">PROCEED</a></td></button>
  		    
  
  </form>
</div>

<script>
function myFunction(x) {
  x.classList.toggle("fa-square");
}
</script>
</body>
</html>