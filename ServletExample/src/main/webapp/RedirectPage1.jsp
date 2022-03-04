<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:lightblue;">
   <h1>This is page one...</h1>
   <!--  Redirection -->
	<%
	
	response.sendRedirect("RedirectPage2.jsp");
	
	
	%>
</body>
</html>