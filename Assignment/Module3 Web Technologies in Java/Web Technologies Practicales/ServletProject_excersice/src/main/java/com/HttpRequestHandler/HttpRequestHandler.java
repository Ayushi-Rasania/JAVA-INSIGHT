package com.HttpRequestHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//1. Writeaprogramusing HttpServlet to handle HTTP-specific requests like GET and POST.
public class HttpRequestHandler extends HttpServlet {

	// Handles GET request
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>GET request received</h3>");
		out.println("<form method='post' action='HttpRequestHandler'>");
		out.println("Name: <input type='text' name='username'>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
	}

	// Handles POST request
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("username");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>POST request received</h3>");
		out.println("<p>Hello, " + name + "!</p>");
	}
}
