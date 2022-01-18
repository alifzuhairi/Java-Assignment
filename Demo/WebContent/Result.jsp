<%//This page is to create form for result %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Form</title>

<style>
<%//change background colour%>
body{
	background-color:#
}
</style>

<script>
//create validate function for submit button
function validate(){
	//show alert if sem, gpa,cgpa are not filled
	if(document.getElementById('sem').value == ''){
		alert('Semester is compulsory');
	}
	else if(document.getElementById('gpa').value == ''){
		alert('Gpa is compulsory');
	}
	else if(document.getElementById('cgpa').value == ''){
		alert('Cgpa is compulsory');
	}
	//submit result form
	else{
		document.getElementById('ResultForm').submit();
	}
}
</script>

</head>
<body>

<%//create action for submit button  %>
<form action="ResultProcess.jsp" method="POST" id= 'ResultForm'>
	
	<%//Create result form %>
	<p>Matric: <input type="text" name="matric" value = "<%=request.getParameter("Username") %>" /></p> 
	<p>Semester: <input type ="text" name="sem" id ="sem"/></p>
	<p>Gpa: <input type="text" name="gpa" id ='gpa'/></p>
	<p>Cgpa: <input type="text" name="cgpa" id= 'cgpa' /></p>
	<p><button type="submit" onclick = "validate()">Submit</button></p></form>

</body>
</html>
