<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1 align="center">Register Here</h1>
	<hr>
<div align="center">
<f:form action="sucess-registeration" method="GET" modelAttribute="dto">

			<label>User: </label>
			<f:input path="name" />
			<br>
			<label>User Name: </label>
			<f:input path="userName" />
			<br>
			<label>Password: </label>
			<f:password path="password" />
			<br>
			<label>Country: </label>
			<f:select path="country">
				<f:option value="Ind" label="India"></f:option>
				<!-- value=Ind will bind to the property country of DTO and label=India will be shown to the user-->
				<f:option value="Afg" label="Afghanistan"></f:option>
				<f:option value="US" label="USA"></f:option>
				<f:option value="Pak" label="Pakistan"></f:option>
			</f:select>
			<br>

			<label>Hobbies: </label>
		Cricket: <f:checkbox path="hobby" value="cricket" />
			<!-- values = cricket will be binded to the proberty hobby -->
		Running: <f:checkbox path="hobby" value="running" />
		Reading: <f:checkbox path="hobby" value="reading" />
		Travel: <f:checkbox path="hobby" value="travel" />
		Programming: <f:checkbox path="hobby" value="programming" />
			<br>
			<label>Gender: </label>
		Male: <f:radiobutton path="gender" value="male" />
			<!-- value = male will be binded if it is selected --> 
		Female: <f:radiobutton path="gender" value="female" />
	
	
		<div align="center">
			<h3>Communication</h3>
			<label>Email</label>
			<f:input id="email" path="communicationDTO.email" /> 
			<!-- nested object mapping object iniside object String object inside CommunicationDTO object -->
			<!-- Spring will run getCommunicationDTO().getEmail() -->
			<label>Phone:</label>
			<f:input path="communicationDTO.phone"/>
			
		</div>
	

		<br> <input type="submit" value="Register">




	</f:form>

</div>

</body>
</html>