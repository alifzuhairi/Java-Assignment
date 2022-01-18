<%//This page is to create form to delete student %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Form</title>

<style>
<%//Change background colour%>
body{
	background-color:#
}
</style>

</head>
<body>
<%//Create action for delete button %>
<form action="DeleteProcess.jsp" method="POST" id= 'deleteForm'>
	
	<%//Create form to delete student%>
	<p>Confirm matric to delete</p>
	<p>Matric: <input type="text" name="matric" value ="<%=request.getParameter("matric") %>" id = 'Matric' /></p> 	
	<p><button type="submit">Submit</button></p></form>

</body>
</html>
