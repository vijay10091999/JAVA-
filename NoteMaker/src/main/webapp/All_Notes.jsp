<%@page import="com.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>All Notes </title>
    	<%@include file="All_js_css.jsp"%>

</head>
<body>
 <div class="container">
 		<%@include file="navbar.jsp"%>
 		<br>
 		<h1 class="text-uppercase">All Notes : </h1>
 		
 		<div class="row">
	 		<div class="col-12">
	 		<% 
	 		
	 		Session s= FactoryProvider.getFactory().openSession();
	 		Query q = s.createQuery("from Note");
	 		
	 		List <Note> list = q.list();
	 		
	 		for(Note note: list){
	 			%>
	 				<div class="card mt-3">
						  <img src="img/Note1.png" class="card-img-top m-4 mx-auto" alt="card-img-top" style="max-width: 80px;">
						  <div class="card-body px-5">
						    <h5 class="card-title"><%=note.getTitle() %></h5>
						    <p class="card-text"><%=note.getContent() %></p>
						    <div class="container text-center">
						    <a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-primary purple">Delete</a>
						       <a href="Edit.jsp?note_id=<%=note.getId() %>" class="btn btn-danger">Update</a>
						    </div>
						  </div>
					</div>
	 			
	 			
	 			<% 
	 		}
	 		
	 		s.close();
	 		
	 		%>
	 		</div>
 		</div>

 </div>
</body>
</html>