package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextSetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		context.setAttribute("company", "Enprowess");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("\"<h3>Company name has been set in ServletContext.</h3>");
	}
}
