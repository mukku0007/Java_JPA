package com.jsp.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("Register")
public class Register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter printWriter = response.getWriter();
		
			String myName = request.getParameter("name");
			String myEmail = request.getParameter("email");
			String myPassword = request.getParameter("password");
			String myGender = request.getParameter("gender");
			String myCity = request.getParameter("city");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","root@123");
				
				PreparedStatement preparedStatement = connection.prepareStatement("insert into register values(?,?,?,?,?)");
				preparedStatement.setString(1, myName);
				preparedStatement.setString(2, myEmail);
				preparedStatement.setString(3, myPassword);
				preparedStatement.setString(4, myGender);
				preparedStatement.setString(5, myCity);
				
				int count = preparedStatement.executeUpdate();
				if(count > 0){
					response.setContentType("text/html");
					printWriter.print("<h3 style='color:green'>User Registered Successfully</h3>");
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Register.jsp");
					requestDispatcher.include(request, response);
				}
				else {
					response.setContentType("text/html");
					printWriter.print("<h3 style='color:red'>User Not Registered Successfully</h3>");
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Register.jsp");
					requestDispatcher.include(request, response);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
				response.setContentType("text/html");
				printWriter.print("<h3 style='color:red'>User Not Registered due to some error.</h3>");
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Register.jsp");
				requestDispatcher.include(request, response);
			}
	}
	
}
