package com.practical.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Writeafilter that checks whether form input fields are empty. If they are, forward back to
the input form; otherwise, proceed with the request*/
public class FormServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email=req.getParameter("email");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
        out.println("<h2>Form Submitted Successfully</h2>");
        out.println("Name: " + name + "<br/>");
        out.println("Email: " + email);
        out.println("</body></html>");
	}
}
