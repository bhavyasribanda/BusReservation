<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  margin-top:-25px;
  margin-left:-10px;
  margin-right:-10px;
  background-image: url("https://images.unsplash.com/photo-1544620347-c4fd4a3d5957?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1498&q=80");
  height:100%;
  min-height:500px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Navbar links */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}
/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 5px;
  max-width: 300px;
  padding: 5px;
   text-color:gold;
 
  background-color:transparent;
}

/* Full-width input fields */
input[type=text], input[type=password] , input[type=date]{
  width: 100%;
  padding: 15px;
  margin: 5px 0 12px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus ,input[type=date]:focus{
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: green;
  color: white;
  padding: 12px 24px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>

<div class="bg-img">
<h1 class="bg-info" align = "center" class="text-warning"><b>BOOK MY BUS</b></h1>
  
  <form action="AdminPage.jsp" class="container">
  
  <label ><font color="gold"><b>DELETED SUCCESSFULLY</b></font></label>
  
   
  </form>
</div>

</body>
</html>
