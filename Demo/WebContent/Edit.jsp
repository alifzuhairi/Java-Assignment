<%//This page is to create form for edit student %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>

<style>
<%//Change background colour%>
body{
	background-color:#
}
</style>

<script>
function validate(){
	//Show alert if name or department are not filled
	if(document.getElementById('Name').value == ''){
		alert('Name is compulsory');
	}
	else if(document.getElementById('department').value == ''){
		alert('Department is compulsory');
	}
	else{
		//submit edit form
		document.getElementById('editForm').submit();
	}
}
</script>

</head>
<body>

<%//create action for submit button %>
<form action="EditProcess.jsp" method="POST" id= 'editForm'>
	
	<%//create edit form  %>
	<p>Matric: <input type="text" name="matric" value = "<%=request.getParameter("matric") %>" /></p> 
	<p>New password: <input type ="password" name="newPass" id ="newPass"/></p>
	<p>Name: <input type="text" name="newName" id ='Name'/></p>
	<p>Department: <input type="text" name="newDepartment" id= 'department' /></p>
	<p>To see the list of department click <a href = "department.jsp">Department List</a></p>
	<p>*Insert no of department</p></form>
	<p><button type="submit" onclick = "validate()">Submit</button></p>
	
</body>
</html>
