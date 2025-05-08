package com.header;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set custom response headers
        response.setHeader("X-Custom-Header", "TOPS-Technologies");
        response.setHeader("X-Powered-By", "Java Servlet");

        // Set the content type of the response
        response.setContentType("text/html");
        
     // Get the output writer
        PrintWriter out = response.getWriter();
        
     // Start writing the HTML response
        out.println("<html><body>");
        out.println("<h2>HTTP Request Headers</h2>");
        out.println("<ul>");
        
     // Display all request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<li><b>" + headerName + ":</b> " + headerValue + "</li>");
        }

        out.println("</ul>");
        out.println("<p>Custom response headers have been added!</p>");
        out.println("</body></html>");
	}
}
