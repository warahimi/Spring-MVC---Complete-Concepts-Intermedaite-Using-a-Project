<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- activating the Spring form tags -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>

	<form:form action="process-homepage" method="get" modelAttribute="userInfo"> <!-- modelAttribute="userInfo" is the object coming from controller with Model object, this form is binded with userInfo Object, we can fetach the properties using userInfo in our form -->
		<div align="center">
			<p>
				<label for="your-name">Your Name:</label> 
				<form:input type="text" id="your-name" path="yourName"/> <!-- use path="" instead of name="", this path will help us to bind the property  -->
			</p> <!-- path values should be same as the variable name inside the DTO to populate the values -->

			<p>
				<label for="crush-name">Crush Name:</label> 
				<form:input type="text" id="crush-name" path="crushName"/>
			</p>

			<input type="submit" value="Calculate">
		</div>
	</form:form>
</body>
</html>