<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Your Registration is Successful</h1>
	<hr>
	<h1>The data you enter are:</h1>
	<br> User: ${UserRegDTO.name}
	<br> User Name: ${UserRegDTO.userName}
	<br> Password: ${UserRegDTO.password}
	<br> Country: ${UserRegDTO.country}
	<br>
	Hobbies:
	<c:forEach var="temp" items="${UserRegDTO.hobby}">
		${temp}
	</c:forEach>
	

	<br> Gender: ${UserRegDTO.gender}
	<br>

</body>
</html>