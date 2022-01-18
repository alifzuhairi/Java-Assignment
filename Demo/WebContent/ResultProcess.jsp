<%//This page is to create process of inserting result %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Process</title>
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
			  //Create and execute query statement for create trigger
			  Statement stmt2 = connection.createStatement();
			  stmt2.execute("create trigger log_results after insert on result " //
					  + "for each row " //
					  + "begin " //
					  + "insert into log values(now(),'New record inserted', 'admin'); " //
					  + "end;");
			  //Output query
			  System.out.println(stmt2);
			  
			  //Create query statement for insert result
			  PreparedStatement stmt = connection.prepareStatement("insert into result values (?,?,?,?)");
			  stmt.setString(1,request.getParameter("matric"));
			  stmt.setString(2,request.getParameter("sem"));
			  stmt.setString(3,request.getParameter("gpa"));
			  stmt.setString(4,request.getParameter("cgpa"));
			  //Output query
			  System.out.println(stmt);
			  //Execute query
			  int row = stmt.executeUpdate();
			  //Show result
			  if(row>0){
				  out.println(row + " Result added ");
			  }  else{
				  out.println("Failed to add result");
			  }
			  
			  //If execution fail
			  } catch(Exception e) {
				  //Show error message
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
