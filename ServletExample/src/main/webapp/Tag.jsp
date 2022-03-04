<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Random,java.util.ArrayList,java.io.*" %>
<%@ page errorPage="ErrorHandling.jsp" %>

			
    
<!-- Taglib Library -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


			<!--  Declaration Tag....-->
			<%!
			
			//declare varibales....
			
			int a= 5;
			int b= 6;
			int c;
			
			//declare Methods...
			
			public int doSum(){
				c=a+b;
				return c;
			}
			%>
			
		    <!--  Scriptlet Tag....-->
		    <%
		    
		    //use for print the value ...
		    
		    out.println(doSum());
		    
		    %>
		    
		    <!-- Expression Tag....-->
		    
		    
		    <h1>Sum is : <%= doSum() %></h1>
		    
		    
		    <!-- Directive Tag....-->
		    
		    <!-- use directive tag...first need to import which tag you want to used..... -->

			<!-- Page Directive -->
			<%@ page import="java.util.Random,java.util.ArrayList,java.io.*" %>
			
		    
		    <h1>Random Number :
		    
			    <%
			    	Random r = new Random();
			    	int n = r.nextInt(10);
			    
			    %>
			    <%= n %>
		    </h1>
		    
		    <!-- Include Directive -->
		     <%@ include file= "index.jsp" %> 
		    
		     <!-- Taglib Directive -->
		     <%--
		     It is used when we want to use other tag libarary in jstl such jsp standard
		     tag library or custom librarry created by user...
		     --%>
		     <!-- <c:set var="name" value="vijay ingle"></c:set>
		     <c:out value="${name}"></c:out>-->
		     
		     <!-- Errorr handling -->
		     <%!
		     	int n1= 200;
		        int n2 = 0;
		     %>
		     <%
		     	int divison= n1/n2;
		     %>
		     <h1>Division is : <%= divison %></h1>
		    
		    <!-- JSP Implicit objects -->
		    
		    <%
		    
		    out.println("this is my jsp implicit objects");
		    
		    request.getParameter("");
		    
		    response.sendRedirect("");
		    
		    //config(ServletConfig)
		    
		    //application(ServletContext)
		   
		    //sesssion
		   
		   out.println(session.isNew());
		   session.setAttribute("name",23);
		    
		   //page: current jsp page:
			   
		   //exception: Throwable..
		   
		   //pageContext: PageContext
		    
		    
		    %>
			
		
</body>
</html>