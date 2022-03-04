<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

		<title>Add Notes </title>
    	<%@include file="All_js_css.jsp"%>

</head>
<body>
	<div class="container">
    
    	<%@include file="navbar.jsp"%>
    	<br>
    	<h1><small>Please Fill Your Note details</small></h1>
    	<br>
    	<!-- Forms -->
    	<form action="SaveNoteServlet" method="post">
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Note Title</label>
		    <input type="text" name="title" class="form-control" id="title" aria-describedby="emailHelp"  required placeholder="Enter Your Note">
		    <div id="emailHelp" class="form-text">We'll never share your Note with anyone else.</div>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Note Description</label>
		    <textarea class="form-control"  name="content" style="height:300px;" id="description" required  placeholder="Enter Your Description here"></textarea>
		  </div>
		  <div class="container text-center">
		  	<button type="submit" class="btn btn-primary purple">Add Note</button>
		  </div>
		  
	   </form>
		     
    </div>
    
</body>
</html>