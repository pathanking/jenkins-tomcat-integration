package com.tm;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		writer.println("<h1 style='color:green'>Welcome Mr. " + username + ", to Jenkins CI/CD</h1>");
		writer.println("<h2 style='color:blue'>Here's your secret password :  " + password + "</h2>");
	}

}
