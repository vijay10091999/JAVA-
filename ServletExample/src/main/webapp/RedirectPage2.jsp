<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:pink;">
	<h1>This is page two...</h1>
	
	<!--  Redirection -->
	<%
	
	//response.sendRedirect("RedirectPage3.jsp");
	response.sendRedirect("https://www.google.co.in/");

	
	%>
</body>
</html>