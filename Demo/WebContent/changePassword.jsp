<%//This page to create a form to change password %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Change Password</title>

<style>
<%//Change background colour%>
body{
	background-color:#
}
</style>

<script>
function validateChangePassword(){
	//Show alert if username or password are not filled
	if(document.getElementById('Username').value == ''){
		alert('Username is compulsory');
	}
	else if(document.getElementById('newpass').value == ''){
		alert('Password is compulsory');
	}
	//submit change password form
	else{
		document.getElementById('changePasswordForm').submit();
	}
}
</script>

</head>
<body>

<%//create action for submit button %>
<form action="changePasswordProcess.jsp" method="POST" id='changePasswordForm'>
	
	<%//create form to change password  %>
	<p>Username: <input type="text" name="Username"  value= "<%=request.getParameter("Username")%>" id= 'Username' /></p> 
	<p>New Password: <input type="password" name="newpass" id ='newpass' /></p></form>
	<p><button type="submit" onclick = "validateChangePassword()">Submit</button></p>

</body>
</html>
