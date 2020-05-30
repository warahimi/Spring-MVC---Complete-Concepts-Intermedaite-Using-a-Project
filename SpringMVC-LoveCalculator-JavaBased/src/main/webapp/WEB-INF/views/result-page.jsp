<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<p>
	Your Name: ${userInfo.yourName}<br> <!-- Spring will call the userInfo.getYourName() behind the scene -->
	Crush Name: ${userInfo.crushName}<br>
	</p>
</body>
</html>