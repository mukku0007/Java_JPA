<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = "Mukesh Kumar";
		out.println(name);
	%>
	
	<%
		//session.setAttribute("session_name", "Session123");
		String sname = (String) session.getAttribute("session_name");
		out.println(sname);
	%>
</body>
</html>