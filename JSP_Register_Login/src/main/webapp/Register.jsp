<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Register" method="post">
		Name : <input type="text" name="name"/> <br/><br/>
		Email : <input type="text" name="email"/> <br/><br/>
		Password : <input type="password" name="pass"/> <br/><br/>
		Gender : <input type="radio" name="gender" value="Male"/> Male <input type="radio" name="gener" value="Feamle"/> Female<br/><br/>
		City:
				<select>
					<option>Select City</option>
					<option>Delhi</option>
					<option>Patna</option>
					<option>Mumbai</option>
					<option>Banglore</option>
				</select> <br/><br/>
				
				<input type="submit" value="Register"/>
	</form>			
</body>
</html>