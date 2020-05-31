<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- activating the Spring form tags -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">

	.error{
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
	}

</style>



</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>

	<form:form action="process-homepage" method="get" modelAttribute="userInfo" > <!-- modelAttribute="userInfo" is the object coming from controller with Model object, this form is binded with userInfo Object, we can fetach the properties using userInfo in our form -->
		<div align="center">
			<p>
				<label for="your-name">Your Name:</label> 
				<form:input id="your-name" path="yourName"/> <!-- use path="" instead of name="", this path will help us to bind the property  -->
				<form:errors path="yourName" cssClass="error"/>
			</p> <!-- path values should be same as the variable name inside the DTO to populate the values -->

			<p>
				<label for="crush-name">Crush Name:</label> 
				<form:input id="crush-name" path="crushName"/>
				<form:errors path="crushName" cssClass="error"/>
			</p>
			<form:checkbox path="termAndCondition" id="check"/>
			<label>I agree that this is for fun:</label>
			<form:errors path="termAndCondition" cssClass="error"/>
			<br><br>
			
			<input type="submit" value="Calculate" >
		</div>
	</form:form>
</body>
</html>