<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-confirmation</title>
</head>
<body>
	The Student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	from ${student.country}
	<br>
	Favorite Language is: ${student.favoriteLanguage}
	<br>
	Your favorite operating Systems:
	<ul>
		<c:forEach items="${student.operatingSystems}" var="tmp">
			<li>${tmp}</li>
		</c:forEach>
	</ul>
</body>
</html>