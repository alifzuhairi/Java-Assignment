<%//This page is to create the process of changing password  %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Changing password...</title>
</head>
<body>
<p>
	  <%
      boolean login=false;
      //check username and password in the database
      //to connect to database server
      String driverName = "com.mysql.jdbc.Driver";
      String connectionUr1 = "jdbc:mysql://localhost:3306/";
      String dbName = "demo";
      String userId = "root";
      String password ="alepviennas123";
      
      Connection connection = null;
	  Statement statement = null;
	  
	  try{
		  login = true;
    	  //load the jdbc driver
    	  Class.forName(driverName);
    	  //connect to the database server
    	  connection = DriverManager.getConnection( connectionUr1 + dbName, userId, password);
    	  
      } catch(Exception e) {
    	  out.println(e.getMessage());
    	  }
	  
	  if (login){
		  try{
			  //create change password query
			  PreparedStatement stmt = connection.prepareStatement("update students set password=password(?) where matric = ?");
			  stmt.setString(1,request.getParameter("newpass"));
			  stmt.setString(2,request.getParameter("Username"));
			  
			  //output the query
			  System.out.println(stmt);
			  
			  //execute query statement
			  int row = stmt.executeUpdate();
			  
			  //Show the result
			  if(row>0){
				  out.println(row + " password(s) changed");
			  }  else{
				  out.println("Failed to change password");
			  }
			  
			  //If execution fail
			  } catch(Exception e) {
				  //show error message
		    	  out.println(e.getMessage());
		      } 
		  
		      } else {
		     %>
		    	  <p>login failed</p>
		    	  <%
		    	  }%>
	  </p>
</body>
</html>
