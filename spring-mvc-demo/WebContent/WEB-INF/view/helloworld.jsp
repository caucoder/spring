<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello world of Spring</h2>
	<br><br>
	Student Name: ${param.studentName}
	<hr>
	<div>
		access data from model
	</div>
	Student Name: ${message}
</body>
</html>