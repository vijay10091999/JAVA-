<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit here</title>
	<%@include file="All_js_css.jsp"%>
</head>
<body>
	    <div class="container">
 		<%@include file="navbar.jsp"%>
 		<br>
 		<h1> Edit Your Note</h1>
 		<br>
 		<% 	
 			System.out.println(request.getParameter("note_id"));
 			int noteId = Integer.parseInt(request.getParameter("note_id"));
 		
	 		Session s = FactoryProvider.getFactory().openSession();
		
			Note note = (Note)s.get(Note.class, noteId);
	 	%>
 		<!-- Forms -->
    	<form action="UpdateServlet" method="get">
    		<input value="<%=note.getId() %>" name = "noteId" type="hidden">
		  <div class="mb-3">
		    <label for="title" class="form-label">Note Title</label>
		    <input type="text" name="title" class="form-control" id="title" aria-describedby="emailHelp" value="<%=note.getTitle()%>" required placeholder="Enter Your Note" />
		    <div id="emailHelp" class="form-text">We'll never share your Note with anyone else.</div>
		  </div>
		  <div class="mb-3">
		    <label for="content" class="form-label">Note Description</label>
		    <textarea class="form-control"  name="content" style="height:300px;" id="description"  required  placeholder="Enter Your Description here"><%=note.getContent()%></textarea>
		  </div>
		  <div class="container text-center">
		  	<button type="submit" class="btn btn-primary purple">Save your Note</button>
		  </div>
		  
	   </form>
	   </div>
	</body>	  
	</html> 