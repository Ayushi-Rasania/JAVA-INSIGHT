package com.practical.example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputValidationFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        if (name == null || name.trim().isEmpty() || email == null || email.trim().isEmpty()) {
            request.setAttribute("error", "All fields are required!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("inputForm.jsp");
            dispatcher.forward(request, response);
        } else {
            chain.doFilter(request, response); // Proceed to servlet
        }
	}
	public void destroy() {
        // Cleanup code if needed
    }
	

}
