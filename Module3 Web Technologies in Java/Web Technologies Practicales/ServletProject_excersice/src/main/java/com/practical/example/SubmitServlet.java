package com.practical.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Lab Exercise:
	 1. Implementa filter to perform server-side validation of user input.*/
public class SubmitServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String email = req.getParameter("email");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Submission Successful</h2>");
		out.println("<p>Username: " + username + "</p>");
		out.println("<p>Email: " + email + "</p>");
	}
}