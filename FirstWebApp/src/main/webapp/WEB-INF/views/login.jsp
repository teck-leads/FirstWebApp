<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginJSP</title>
</head>
<body>
	<h1>First JSP</h1>

	<form action="/login.do" method="POST">
	<b style="color: red;">${ErrorMessage} </b><br>
		Enter your name<input name="name" type="text"><br>
		Enter your name<input name="password" type="password"/><br>
		Submit <input type="submit">
	</form>
</body>
</html>