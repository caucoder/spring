<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-form</title>
</head>
<body>

	<form:form action="processForm" method="GET" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Country:
		<form:select path="country">
		
			<form:options items="${student.countryOptions}"/>
		
		</form:select>
		<br><br>
		Your favirote programming Language: 
		Java<form:radiobutton path="favoriteLanguage" value="Java"/>
		C++<form:radiobutton path="favoriteLanguage" value="C++"/>
		Python<form:radiobutton path="favoriteLanguage" value="Python"/>
		
		<br><br>
		Your favirote operating systems: 
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
		<br><br>
		<input type="submit" value="Submit"> 
	</form:form>
</body>
</html>