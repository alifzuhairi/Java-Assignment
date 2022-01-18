<%//This page is to show the list of department %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department List</title>
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
	  
      if(login){
     
      try{
    	  //Create query statement for select department and execute
    	  statement = connection.createStatement();
    	  ResultSet rs2 = statement.executeQuery("select * from departments;");
    	  	   
    	  %>
    	  <p>This is the list of department</p>
    	 
    	  <%//Create table for department list %>
    	  <table border="1">
    	  <tr>
    	  <th>Department Id</th>
    	  <th>Department name</th> 
    	  </tr>
    	  
    	  <%
    	  //Get department list from database
    	  while(rs2.next()) {
    	  //  out.println("<p>" + rs.getString("dob") + "</p>"); 
    	  %>  
    	  <tr>
    	  <td><%=rs2.getString("id") %></td>
    	  <td><%=rs2.getString("name") %></td>
    	  </tr>  
    	  <%
    	  }
    	  %>
    	  </table>
    	  
    	  <%
    	//if Execution fail 
      } catch(Exception e) {
    	  //show error message
    	  out.println(e.getMessage());
      }
    	 
      } else {
    	  %>
    	  <p>login failed</p>
    	  <%
    	  //out.println("login failed");
      }
    	  %>

     </p>
</body>
</html>
