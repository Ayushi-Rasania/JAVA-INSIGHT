package com.practical.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Practical Example 2: Fetch Data Using ServletContext
Lab Exercise:
1. Createmultiple servlets that fetch shared data from web.xml using ServletContext
*/
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		ServletContext context = getServletContext();
		String company = context.getInitParameter("companyName");

		out.println("<h2>Second Servlet</h2>");
		out.println("<p>Company: " + company + "</p>");
	}
}
