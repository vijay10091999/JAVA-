<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Login Page</title>

<!-- Font-icon -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="CSS/style.css" rel="stylesheet" type="text/css"/>

</head>
<body>
<!-- navbar -->
	<%@include file = "navbar.jsp" %>
	
<main class="d-flex align-items-center banner-background" style="height: 70vh">

	<div class="container">
		<div class="row">
	        <div class="col-md-4 offset-md-4">
	        	<div class="card" style="  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);">
	        		<div class="card-header primary-background text-white text-center">
	        		<br>
	        		<span class="fa fa-user-plus fa-3x"></span>
	        			<p>Login</p>
	        		</div>
	            <div class="card-body">
						<form action="LoginServlet" method="post">
						<div class="container text-center">
						  <button type="submit" class="btn btn-primary">Google</button>
						</div>
						</form>				            	
	  	        </div>
	            </div>
	        </div>
	    </div>
	    </div>
</main>


<!-- Javascript -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<script  src="JS/script.js" type="text/javascript"></script>
</body>
</html>