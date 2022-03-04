<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.entities.User"%>
    
     <%
    
    User user=(User)session.getAttribute("currentUser");
    if (user==null){
    	response.sendRedirect("index.jsp");
    }
    
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Font-icon -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<!-- CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="CSS/style.css" rel="stylesheet" type="text/css"/>

</head>

<body>

<!-- Navbar -->


<nav class="navbar navbar-expand-lg navbar-dark primary-background">
  <a class="navbar-brand" href="index.jsp">Search Application</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home<span class="sr-only">(current)</span></a>
      </li>
      
      
      <li class="nav-item">
        <a class="nav-link" href="#">contact us</a>
      </li>
    </ul>
   <ul class="navbar-nav mr-right">
   <li class="nav-item">
        <a class="nav-link" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle"></span><%=user.getName() %> </a>
   </li>
       
   <li class="nav-item">
        <a class="nav-link" href="LogoutServlet"><span class="fa fa-user-plus"></span>Logout</a>
   </li>
       
   </ul>
  </div>
</nav>

<!-- Profile modal -->


<!-- Button trigger modal -->

<!-- Modal -->
<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header primary-background text-white text-center">
        <h5 class="modal-title" id="exampleModalLabel">Search Application</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      <div class= "container text-center">
      
      	<img  src="pic/<%= user.getProfile() %>" class= "img-fluid" style="border-radius:50%; max-width: 200px;"/>
      <!-- Details -->
      
      <div id="profile-details">
      <table class="table">

  <tbody>
    <tr>
      <th scope="row">Name :</th>
      <td><%= user.getName() %></td>
   
    </tr>
    <tr>
      <th scope="row">Email :</th>
      <td><%= user.getEmail() %></td>
   
    </tr>
    <tr>
      <th scope="row">Gender :</th>
      <td><%= user.getGender() %></td>
     
    </tr>

  </tbody>
</table>
      </div>

      </div>
     
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button id="edit-profile-btn" type="button" class="btn primary-background">Edit</button>
      </div>
    </div>
  </div>
</div>

<!-- end of profile modal -->

<!-- Javascript -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script  src="JS/script.js" type="text/javascript"></script>


</body>
</html>