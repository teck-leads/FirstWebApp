<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginJSP</title>
</head>
<body>
	<h1 style="margin: auto;">Online Warranty Service</h1>

	<form action="/login.do" method="POST">
		<b style="color: red;">${ErrorMessage} </b><br>
		<table>
			<tr>
				<td>Enter your name</td>
				<td><input name="name" type="text"></td>


			</tr>
			<tr>
				<td>Enter your Password</td>
				<td><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>


	</form>
</body>
</html>