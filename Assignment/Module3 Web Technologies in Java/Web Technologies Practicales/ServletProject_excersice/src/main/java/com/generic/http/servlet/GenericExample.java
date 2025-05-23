package com.generic.http.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*Createa Java servlet program using both GenericServlet and HttpServlet and
compare their implementation.*/
public class GenericExample extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h3>This servlet uses GenericServlet</h3>");
	}
}
