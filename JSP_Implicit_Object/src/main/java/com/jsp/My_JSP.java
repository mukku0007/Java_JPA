package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/a")
public class My_JSP extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Hello Mukesh Kumar");
		
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("session_name","Session123");
	}
	
}
