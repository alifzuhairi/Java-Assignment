<%//This page is to create the main page of smp system %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processing login...</title>
<style>
body {
  background-color:#ECC;
}
</style>
</head>
<body>    
      <p>
      <%
      boolean login=false;
      //check username and password in the database
      //to connect to database server
      String driverName = "com.mysql.jdbc.Driver";
      String connectionUr1 = "jdbc:mysql://localhost:8080/";
      String dbName = "demo";
      String userId = "root";
      String password ="alepviennas123";
      
      Connection connection = null;
	  Statement statement = null;
	  
	  
      try{
    	  //load the jdbc driver
    	  Class.forName(driverName);
    	  //connect to the database server
    	  connection = DriverManager.getConnection( connectionUr1 + dbName, userId, password);
    	 
    	  //Create query statement for select student
    	  PreparedStatement stmt = connection.prepareStatement("select name from students where matric=? and password(?)");
    	  stmt.setString(1, request.getParameter("Username"));
    	  stmt.setString(2, request.getParameter("Password"));
    	  
    	  //output query statement
    	  System.out.println(stmt);
    	  //execute query statement
    	  ResultSet rs = stmt.executeQuery();
    	  if(rs.next()){
    		  login = true;
    	  }
    	  
      } catch(Exception e) {
    	  out.println(e.getMessage());
    	  }
      
      if(login){
      %>
  	  <%//Create link to change password %>
      <p>processing login.... <a href = "changePassword.jsp?Username=<%=request.getParameter("Username")%>">Change Password</a></p>
      
      <% //opening tag for java code
         out.println("Hello ");
      %> 
	  
      <%=request.getParameter("Username")%>
      
      , your password is
 
      <%=request.getParameter("Password")%>
      
      <p>This is to display a single value (returned value)</p>
      
      show the table below

      <%
      try{
    	  //create and execute query statement for select student
    	  statement = connection.createStatement();
    	  ResultSet rs = statement.executeQuery("select matric, students.name, dob, departments.name as department from students left join departments on department = departments.id");
    	  
    	  %>
    	  <%//Create action for result and new student buttons %>
    	  <p><a href = "Result.jsp?Username=<%=request.getParameter("Username")%>"><button type ='result'>Result</button></a>
    	  	 <a href ="NewStudent.jsp"><button type ='newStudent'>New Student</button></a>
    	  </p>
    	  <%//Create table for students %>
    	  <table border="1">
    	  <tr>
    	  <th>Matric</th>
    	  <th>Name</th>
    	  <th>DOB</th>
    	  <th>Department</th>
    	  <th>Action</th> 
    	  </tr>
    	  
    	  <%
    	  //get students data from database
    	  while(rs.next()) {  
    	  //  out.println("<p>" + rs.getString("dob") + "</p>");  
    	  %>
    	  
    	  <tr>
    	  <td><%=rs.getString("matric") %></td>
    	  <td><%=rs.getString("name") %></td>
    	  <td><%=rs.getString("dob") %></td>
    	  <td><%=rs.getString("department") %></td>
    	  <td><a href ="Edit.jsp?matric=<%=rs.getString("matric") %>"><button type = 'edit'>Edit</button></a>
    	      <a href ="Delete.jsp?matric=<%= rs.getString("matric") %>"><button type = 'delete'>Delete</button></a>
    	  </td>
    	  </tr>
    	  
    	  <%
    	  }
    	  %>
    	  </table>
    	  
      <%
      //If execution fail
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
