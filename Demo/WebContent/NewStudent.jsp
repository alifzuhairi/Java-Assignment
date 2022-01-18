<%//This page is to create form for new student %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student Form</title>

<style>
<%//change background colour%>
body{
	background-color:# 
}
</style>

<script>
//create validate function for submit button
function validate(){
	//Show alert if matric, password,name or department are not filled
	if(document.getElementById('Matric').value == ''){
		alert('Matric is compulsory');
	}
	else if(document.getElementById('Password').value == ''){
		alert('Password is compulsory');
	}
	else if(document.getElementById('Name').value == ''){
		alert('Name is compulsory');
	}
	else if(document.getElementById('department').value == ''){
		alert('Department is compulsory');
	}
	//submit new student form
	else{
		document.getElementById('newStudentForm').submit();
	}
}
</script>
</head>
<body>

<%//create action for submit button %>
<form action="NewStudentProcess.jsp" method="POST" id=newStudentForm>
	
	<%//Create new student form %>
	<p>Matric: <input type="text" name="Matric" id = 'Matric' /></p> 
	<p>Password: <input type="password" name="password" id = 'Password'/></p>
	<p>Name: <input type="text" name="name" id ='Name'/></p>
	<p>Department: <input type="text" name="department" id = 'department' /></p>
	<p>To see the list of department click <a href = "department.jsp">Department List</a></p>
	<p>*Insert no of department</p>
	</form>
	<p><button type="submit" onclick = "validate()">Submit</button></p>

</body>
</html>
