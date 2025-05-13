package com.practical.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if ("admin".equals(username) && "1234".equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("user", username);

			Cookie userCookie = new Cookie("username", username);
			userCookie.setMaxAge(3600);
			resp.addCookie(userCookie);

			resp.sendRedirect("userWelcome.jsp");
		} else {
			req.setAttribute("error", "Invalid username or password!");
			RequestDispatcher rd = req.getRequestDispatcher("userLogin.jsp");
			rd.forward(req, resp);
		}
	}
}
