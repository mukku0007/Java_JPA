<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome the Java JSP.</h2>
	
	<% //Scriplet tag
	
		String name = "Mukesh Kumar";
		int length = name.length();
	%>
	
	<%= length %>
	
</body>
</html>