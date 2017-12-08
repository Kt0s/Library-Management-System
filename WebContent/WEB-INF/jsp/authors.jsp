<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
		<title>Authors list</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	</head>
	<body>
	 	<table class="table table-bordered" style="width: 300px">
	 		<tr>
	 			<th>ID</th>
	 			<th>FirstName</th>
	 			<th>LastName</th>
	 		</tr>
	 		<c:forEach items="${authorsList}" var="author">
	 			<tr>
	 				<td>${author.id}</td>
	 				<td>${author.firstName}</td>
	 				<td>${author.lastName}</td>
	 			</tr>
	 		</c:forEach>
	 	</table>
	</body>
</html>