package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigExampleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		// Get ServletConfig object
		ServletConfig config = getServletConfig();
		
		 // Fetch init parameter
		String company = config.getInitParameter("companyName");
		
		out.println("<html><body>");
        out.println("<h2>Welcome to " + company + "</h2>");
        out.println("</body></html>");
	}
}
