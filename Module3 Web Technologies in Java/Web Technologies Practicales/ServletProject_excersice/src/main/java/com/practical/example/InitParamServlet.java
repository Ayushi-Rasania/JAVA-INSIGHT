package com.practical.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Practical Example 1: Fetch Data Using ServletConfig
Lab Exercise:
1. Writeaservlet to fetch and display initialization parameters from web.xml using ServletConfig.*/
public class InitParamServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		ServletConfig config = getServletConfig();
		String adminName = config.getInitParameter("adminName");
		String adminEmail = config.getInitParameter("adminEmail");

		out.println("<h2>Initialization Parameters from web.xml</h2>");
		out.println("<p>Admin Name: " + adminName + "</p>");
		out.println("<p>Admin Email: " + adminEmail + "</p>");
	}
}
