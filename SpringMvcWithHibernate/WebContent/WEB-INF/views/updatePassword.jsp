<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Change Password</h1>
	<font color="Red">${msg}</font>
	<form:form action="changepassword" method="POST">
		<table>
			<tr>
				<td>Old Password</td>
				<td><Input type="password" name="oldpassword"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><Input type="password" name="newpassword"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><Input type="password" name="confirmpassword"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>