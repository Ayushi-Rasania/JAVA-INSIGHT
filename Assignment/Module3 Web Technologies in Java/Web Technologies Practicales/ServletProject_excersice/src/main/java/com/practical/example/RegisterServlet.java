package com.practical.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*1. Createa registration form in JSP.
2. Sendformdatatoaservlet, process it, and forward the response back to a JSP using
RequestDispatcher.*/
public class RegisterServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name= req.getParameter("name");
	String email=req.getParameter("email");
	
	 req.setAttribute("username", name);
	 req.setAttribute("useremail", email);

     // Forward to JSP page to display output
     RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
     dispatcher.forward(req, resp);
}
}
