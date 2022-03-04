<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

try {
	String connectionURL = "jdbc:mysql://localhost:3306/student"; 

	Connection connection = null; 
	Class.forName("com.mysql.jdbc.Driver").newInstance(); 
	connection = DriverManager.getConnection(connectionURL, "root", "Lufa@7917");
	if(!connection.isClosed()){
		out.println("Successfully connected to " + "MySQL server using TCP/IP...");
	}	
    else{
	  out.println("Uable to connected!!");
    }
    
	
	String sql = "select * from stud";
	Statement st = connection.createStatement();
	ResultSet rs = st.executeQuery(sql);
	while(rs.next()) {
		int id = rs.getInt(1);
		String Name = rs.getString(2);
		int age = rs.getInt(3);
		out.println(id + " " + Name + " " + age);
	}
	
	
	}

catch(Exception ex){
	out.println(ex);
}
%>
</body>
</html> 